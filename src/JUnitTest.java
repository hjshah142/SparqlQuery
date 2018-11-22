import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class JUnitTest {



	@Test
	void test() {

		SentenceExtractor testobj = new SentenceExtractor();
		
		int value1,value2;
		value1 = 1;
		value2 = 3;
		int total = testobj.b;
	      int result = value1 + value2;
	      Assert.assertEquals(result,total);
		

		
	}
	@Test
	void test2()
	{
		SentenceExtractor testobj = new SentenceExtractor();
		String Actual = testobj.responseRader(0);
	String Expected = "[http://dbpedia.org/resource/Google, http://dbpedia.org/ontology/CEO, http://dbpedia.org/resource/Sundar_Pichai][http://aksw.org/notInWiki/James_Damore, http://dbpedia.org/ontology/employer, http://dbpedia.org/resource/Google][http://dbpedia.org/resource/Sundar_Pichai, http://dbpedia.org/ontology/employer, http://dbpedia.org/resource/Google]" ;
	Assert.assertEquals(Actual,Expected);
		
		
	}
	

}
