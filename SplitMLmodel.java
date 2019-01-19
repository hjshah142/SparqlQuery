package org.dice_research.sask.ensemble_ms.weka.api;



import weka.classifiers.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.stemmers.LovinsStemmer;
import weka.core.stopwords.WordsFromFile;
import weka.core.tokenizers.NGramTokenizer;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.StringToWordVector;

public class SplitMLmodel {

	public static void main(String[] args) {
		
		
SplitMLmodel splitMLmodel  = new SplitMLmodel();


try {
	Instances traindata = splitMLmodel.loadMLmodel();
	int percent = 80;
	splitMLmodel.evaluateModel(traindata,percent);
} catch (Exception e) {
	
	
	System.out.println("Exception for training model");
	e.printStackTrace();
}

	}

	private void evaluateModel(Instances traindata, int percent) throws Exception {
		RandomForest treeClassifier = new RandomForest();
//		J48 treeClassifier = new J48();

		
		
//		RandomForest treeClassifier = new RandomForest();	
		StringToWordVector stringToWordVectorFilter = new StringToWordVector();
		traindata.setClassIndex(1);
		
//		set properties for strtoword vector filter
		stringToWordVectorFilter.setIDFTransform(true);
        WordsFromFile stopwordsHandler = new WordsFromFile();
	    LovinsStemmer lovins_stemmer = new LovinsStemmer();
	    stringToWordVectorFilter.setStemmer(lovins_stemmer);
	    NGramTokenizer nGramTokenizer = new NGramTokenizer();
	    nGramTokenizer.setNGramMaxSize(1);
	    nGramTokenizer.setNGramMinSize(1);
	    nGramTokenizer.setDelimiters(" \n 	.,;1234567890'\"()?!-/<>‘’“”…«»•&:{[|`^]}$*%");
	    stringToWordVectorFilter.setStopwordsHandler(stopwordsHandler);
//	    stringToWordVectorFilter.setWordsToKeep(500);
	    stringToWordVectorFilter.setTokenizer(nGramTokenizer);

	    stringToWordVectorFilter.setLowerCaseTokens(true);
	    
	 
		stringToWordVectorFilter.setInputFormat(traindata);
		traindata = Filter.useFilter(traindata,stringToWordVectorFilter);
		
		System.out.println(traindata.toSummaryString());
		  

		int trainSize = (int) Math.round(traindata.numInstances() * percent / 100);
		int testSize = traindata.numInstances() - trainSize;
		Instances train = new Instances(traindata, 0, trainSize);
		
		Instances test = new Instances(traindata, trainSize, testSize);
		treeClassifier.buildClassifier(train);
		Evaluation evaluation = new Evaluation(train);
		evaluation.evaluateModel(treeClassifier, test);
		System.out.println(evaluation.toSummaryString());


		// eval.evaluateModelOnceAndRecordPrediction(Treeclassifier, (Instance)
		// filteredDataset);

		System.out.println("printing evalution details result.......");
		System.out.println(evaluation.toClassDetailsString());
		System.out.println(evaluation.toMatrixString("=== Overall Confusion Matrix ===\n"));

		// printing result comparison......gi
		System.out.println("===================");
		System.out.println("Result comparison between actual and predicted class");
		System.out.println("----------------------------------------------------");
		System.out.println("Actual Class  Predicted Class");
		for (int i = 0; i < test.numInstances(); i++) {
			// get class double value for current instance
			double actualClass = test.instance(i).classValue();
			// get class string value using the class index using the class's int value
			String actual = test.classAttribute().value((int) actualClass);
			// get Instance object of current instance
			Instance newInst = test.instance(i);
			// call classifyInstance, which returns a double value for the class
			double predNB = treeClassifier.classifyInstance(newInst);
			// use this value to get string value of the predicted class
			String predString = test.classAttribute().value((int) predNB);
			System.out.println(actual + "             " + predString);
		}

		} 	

	

	private Instances loadMLmodel() throws Exception {
		
		String filename = "WekaMlDataset\\traindata.arff";
		
		DataSource source= new DataSource(filename);
		Instances traindata = source.getDataSet();
		System.out.println(traindata.toSummaryString());
		traindata.setClassIndex(1);
		return traindata;

	}
	

}
