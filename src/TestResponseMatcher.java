import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestResponseMatcher {

	@Test
	public void testResponse_Matching() {
		ResponseMatcher test_obj = new ResponseMatcher();
		
		
		 test_obj.sub_fox.add("Google");
		 test_obj.pred_fox.add("working");
		 test_obj.obj_fox.add("Sundar_Pichai");
		 test_obj.sub_fox.add("Google");
		 test_obj.pred_fox.add("located");
		 test_obj.obj_fox.add("California");
		 test_obj.sub_fox.add("Google");
		 test_obj.pred_fox.add("CEO");
		 test_obj.obj_fox.add("Sundar_Pichai");
		 
		 test_obj.sub.add("Google");
		 test_obj.pred.add("located");
		 test_obj.obj.add("California");
		 test_obj.sub.add("Google");
		 test_obj.pred.add("CEO");
		 test_obj.obj.add("Sundar_Pichai");
		
		
		double actual_score =test_obj.response_Matching();
		double preicted_score = 100.0;
		double delta =0;
		
		Assert.assertEquals(actual_score, preicted_score, delta);
        System.out.println("........................................");
		
//		test 2
		 test_obj.sub_fox.add("Google");
		 test_obj.pred_fox.add("CEO");
		 test_obj.obj_fox.add("Sundar_Pichai");
		 test_obj.sub_fox.add("Google");
		 test_obj.pred_fox.add("located");
		 test_obj.obj_fox.add("California");
		 test_obj.sub.add("Google");
		 test_obj.pred.add("located");
		 test_obj.obj.add("Berlin");
			double preicted_score2 = 67;
			double actual_score2 =test_obj.response_Matching();
			delta =1;
		 
		 
		 
			Assert.assertEquals(actual_score2, preicted_score2, delta);
		

		
	}

}
