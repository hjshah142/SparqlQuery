package org.dice_research.sask.ensemble_ms.weka.api;

import weka.core.Instances;
import weka.core.Stopwords;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.stemmers.LovinsStemmer;
import weka.core.stemmers.Stemmer;
import weka.core.stopwords.Rainbow;
import weka.core.tokenizers.NGramTokenizer;
import weka.filters.Filter;

import weka.core.Instance;
import java.io.File;
import java.util.Random;
import weka.filters.unsupervised.attribute.StringToWordVector;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;


/**
 * This class take data from weka dataset and predict the training data class
 * using crossValidation
 * 
 * @author Harsh Shah
 */

public class CrossvalidateDataset {
	static String filename = "WekaMlDataset\\traindata.arff";
	

	

	
	public static void main(String[] args)
     {
		
		CrossvalidateDataset crossvalidateDataset = new CrossvalidateDataset();
		crossvalidateDataset.buildClassfier();
		

	}





	private void buildClassfier() 
	{
		// load the arff file
		try {
			
			DataSource source = new DataSource(filename);
              Instances dataset = source.getDataSet();
			System.out.println("printing summary of training data.....");
			System.out.println(dataset.toSummaryString());
			// save arff file

			ArffSaver saver = new ArffSaver();
			saver.setInstances(dataset);
			saver.setFile(new File("WekaDataset\\datasetArffExtraction.arff"));
			saver.writeBatch();
			
			
			
			// provide filter and set filter classifier
			
			
			StringToWordVector converterVector = new StringToWordVector();
			  
			    converterVector.setIDFTransform(true);
			    
              LovinsStemmer lovins_stemmer = new LovinsStemmer();
			    
			    converterVector.setStemmer(lovins_stemmer);

			    converterVector.setLowerCaseTokens(true);
			    converterVector.getTokenizer();
	         	converterVector.setInputFormat(dataset);
			// apply the filter
			Instances filteredDataset = Filter.useFilter(dataset, converterVector);
			saver.setInstances(filteredDataset);
			filteredDataset.setClassIndex(0);
			// System.out.println(filteredDataset.toString());
			System.out.println(filteredDataset.classAttribute());

			saver.setFile(new File("WekaDataset\\datasetArff_Filtered.arff"));
			saver.writeBatch();
			
			// classify using j48
	 
			J48 Treeclassifier = new J48();
			Treeclassifier.buildClassifier(filteredDataset);
			Classifier classifier = Treeclassifier;
			System.out.println("Classifier result.................");
			System.out.println(Treeclassifier.toString());
			System.out.println("printin data after filter.................");

			// System.out.println(filteredDataset.toString());
			System.out.println("Number of Classifier.................");
			System.out.println(filteredDataset.numClasses());
			System.out.println(filteredDataset.classAttribute());

			Evaluation eval = new Evaluation(filteredDataset);
			// System.out.println(eval.predictions().size());
			eval.crossValidateModel(classifier, filteredDataset, 10, new Random(1));

			System.out.println("Printing evalution summary.........");
			System.out.println(eval.toSummaryString());
			System.out.println("printing evalution details result.......");
			System.out.println(eval.toClassDetailsString());
			System.out.println(eval.toMatrixString("=== Overall Confusion Matrix ===\n"));

			// printing result comparison......
			System.out.println("===================");
			System.out.println("Actual Class, Predicted Class");
			for (int i = 0; i < filteredDataset.numInstances(); i++) {
				// get class double value for current instance
				double actualClass = filteredDataset.instance(i).classValue();
				// get class string value using the class index using the class's int value
				String actual = filteredDataset.classAttribute().value((int) actualClass);
				// get Instance object of current instance
				Instance newInst = filteredDataset.instance(i);
				// call classifyInstance, which returns a double value for the class
				double predNB = Treeclassifier.classifyInstance(newInst);
				// use this value to get string value of the predicted class
				String predString = filteredDataset.classAttribute().value((int) predNB);
				System.out.println(actual + ",         " + predString);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		
	}

}
