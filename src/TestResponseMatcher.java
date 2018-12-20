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
		 
//		 test 3
			System.out.println("...........Null stringlist test.......");
		
		
			 test_obj.sub.add("Google");
			 test_obj.pred.add("located");
			 test_obj.obj.add("Berlin");
				double actual_score3 =test_obj.response_Matching();
				System.out.println(actual_score3 + "score ");
			Assert.assertEquals(actual_score3, 0, 0);

		
//			 test 4
				System.out.println("........... test 4.......");
			
			
				 test_obj.sub.add("Google");
				 test_obj.pred.add("located");
				 test_obj.obj.add("Berlin");
				 
				 test_obj.sub_fox.add("Microsoft");
				 test_obj.pred_fox.add("CEO");
				 test_obj.obj_fox.add("Sundar_Pichai");
				 
				 
				 
				 test_obj.sub_fox.add("nolabel");
				 test_obj.pred_fox.add("locatedin");
				 test_obj.obj_fox.add("Newyork");
					double actual_score4 =test_obj.response_Matching();
					System.out.println(actual_score4 + "score ");
				Assert.assertEquals(actual_score4, 0, 0);

			
//				 test 5
					System.out.println("........... test 5.......");
				
				
					 test_obj.sub.add("Google");
					 test_obj.pred.add("located");
					 test_obj.obj.add("Berlin");
					 
					 test_obj.sub_fox.add("Microsoft");
					 test_obj.pred_fox.add("CEO");
					 test_obj.obj_fox.add("Sundar_Pichai");
					 
					 test_obj.sub_fox.add("Sundar");
					 test_obj.pred_fox.add("worksin");
					 test_obj.obj_fox.add("Google");
					 
					 
					 
					 
					 test_obj.sub_fox.add("Google");
					 test_obj.pred_fox.add("locatedin");
					 test_obj.obj_fox.add("Newyork");
						double actual_score5 =test_obj.response_Matching();
						System.out.println(actual_score5 + "score ");
						Assert.assertEquals(actual_score5, 33.33, 1);
						
//						 test 5
						System.out.println("........... test 6.......");
					
					
						 test_obj.sub.add("Google");
						 test_obj.pred.add("located");
						 test_obj.obj.add("cal");
						 
						 test_obj.sub_fox.add("Sundar");
						 test_obj.pred_fox.add("ceo");
						 test_obj.obj_fox.add("Google");
						 
						 test_obj.sub_fox.add("Microsoft");
						 test_obj.pred_fox.add("CEO");
						 test_obj.obj_fox.add("Sundar_Pichai");
						 
						 test_obj.sub_fox.add("Sundar");
						 test_obj.pred_fox.add("worksin");
						 test_obj.obj_fox.add("Google");
						 
						 test_obj.sub_fox.add("Sundar");
						 test_obj.pred_fox.add("worksin");
						 test_obj.obj_fox.add("Google");
				 
						 test_obj.sub_fox.add("Google");
						 test_obj.pred_fox.add("locatedin");
						 test_obj.obj_fox.add("cal");
						 
						 
							double actual_score6 =test_obj.response_Matching();
							System.out.println(actual_score6 + "score ");
							Assert.assertEquals(actual_score6, 66, 1);
						
					
		
	}

}
