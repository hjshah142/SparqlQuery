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
						
//						 test 6
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
						
//							 test 7
							System.out.println("........... test 7.......");
						
						

							 
							 test_obj.sub.add("Sundar");
							 test_obj.pred.add("worksin");
							 test_obj.obj.add("Google");
							 
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
							 
							 
								double actual_score7 =test_obj.response_Matching();
								System.out.println(actual_score7 + "score ");

													
//								 test 8
								System.out.println("........... test 8.......");
							
							
								 test_obj.sub.add("Google");
								 test_obj.pred.add("located");
								 test_obj.obj.add("cal");
								 
								 test_obj.sub.add("Sundar");
								 test_obj.pred.add("worksin");
								 test_obj.obj.add("Google");
								 
								 
								 test_obj.sub.add("James_Demore");
								 test_obj.pred.add("fires");
								 test_obj.obj.add("Google");
								 
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
								 
								 
								 test_obj.sub_fox.add("Google");
								 test_obj.pred_fox.add("region");
								 test_obj.obj_fox.add("cal");
								 
								 
								 
								 
									double actual_score8 =test_obj.response_Matching();
									System.out.println(actual_score8 + "score ");
									Assert.assertEquals(actual_score8, 66.67, 0);
									
//									 test 9
									System.out.println("........... test 9.......");
								
								
									 test_obj.sub.add("Germany");
									 test_obj.pred.add("capital");
									 test_obj.obj.add("Berlin");
									 
									 test_obj.sub.add("Germany");
									 test_obj.pred.add("lockated");
									 test_obj.obj.add("Europe");
									 
									 
									 test_obj.sub.add("Germany");
									 test_obj.pred.add("in");
									 test_obj.obj.add("Europion Union");
									 
									 test_obj.sub.add("Germany");
									 test_obj.pred.add("partof");
									 test_obj.obj.add("Europe");
									 
									 test_obj.sub.add("Germany");
									 test_obj.pred.add("city");
									 test_obj.obj.add("Berlin");
									 
									 test_obj.sub_fox.add("Germany");
									 test_obj.pred_fox.add("city");
									 test_obj.obj_fox.add("Berlin");
									 
									 test_obj.sub_fox.add("Deutchland");
									 test_obj.pred_fox.add("capital");
									 test_obj.obj_fox.add(".");
									 
									 test_obj.sub_fox.add("Deutchland");
									 test_obj.pred_fox.add("capital");
									 test_obj.obj_fox.add("nolabel");
									 

							 
									 test_obj.sub_fox.add("Google");
									 test_obj.pred_fox.add("locatedin");
									 test_obj.obj_fox.add("cal");
									 
									 
									 test_obj.sub_fox.add("nolabel");
									 test_obj.pred_fox.add("region");
									 test_obj.obj_fox.add("Europe");
									 
									 
									 
									 
										double actual_score9 =test_obj.response_Matching();
										System.out.println(actual_score9 + "score ");	
					
//										 test 10
										System.out.println("........... test 10.......");
									
									
										 test_obj.sub.add("Germany");
										 test_obj.pred.add("capital");
										 test_obj.obj.add("Berlin");
										 
										 test_obj.sub.add("Germany");
										 test_obj.pred.add("lockated");
										 test_obj.obj.add("Europe");
										 
										 
										 test_obj.sub.add("Germany");
										 test_obj.pred.add("in");
										 test_obj.obj.add("Europion Union");
										 
										 test_obj.sub.add("Germany");
										 test_obj.pred.add("partof");
										 test_obj.obj.add("Europe");
										 
										 test_obj.sub.add("Germany");
										 test_obj.pred.add("city");
										 test_obj.obj.add("Berlin");
										 
										 test_obj.sub_fox.add("Germany");
										 test_obj.pred_fox.add("city");
										 test_obj.obj_fox.add("Berlin");
										 
										 test_obj.sub_fox.add("Deutchland");
										 test_obj.pred_fox.add("capital");
										 test_obj.obj_fox.add(".");
										 
										 test_obj.sub_fox.add("Deutchland");
										 test_obj.pred_fox.add("capital");
										 test_obj.obj_fox.add("nolabel");
										 
										 test_obj.sub_fox.add("Deutchland");
										 test_obj.pred_fox.add("in");
										 test_obj.obj_fox.add("nolabel");
										 
										 

								 
										 test_obj.sub_fox.add("Google");
										 test_obj.pred_fox.add("locatedin");
										 test_obj.obj_fox.add("cal");
										 
										 
										 test_obj.sub_fox.add("nolabel");
										 test_obj.pred_fox.add("region");
										 test_obj.obj_fox.add("Europe");
										 
										 
										 test_obj.sub_fox.add("Germany");
										 test_obj.pred_fox.add("region");
										 test_obj.obj_fox.add("Europe");
										 
										 
										 
										 
										 
											double actual_score10 =test_obj.response_Matching();
											System.out.println(actual_score10 + "score ");	
											
//											 test 11
											System.out.println("........... test 11.......");
										
										
											 test_obj.sub.add("Germany");
											 test_obj.pred.add("capital");
											 test_obj.obj.add("Berlin");
											 
         									 test_obj.sub.add("Germany");
											 test_obj.pred.add("in");
											 test_obj.obj.add("Europe");
											 
											 test_obj.sub.add("Europe");
											 test_obj.pred.add("country");
											 test_obj.obj.add("Germany");
											 
											 test_obj.sub.add("Germany");
											 test_obj.pred.add("city");
											 test_obj.obj.add("Frankfurt");
											 
											 test_obj.sub_fox.add("Germany");
											 test_obj.pred_fox.add("city");
											 test_obj.obj_fox.add("Berlin");
											 
											 test_obj.sub_fox.add("Deutchland");
											 test_obj.pred_fox.add("capital");
											 test_obj.obj_fox.add(".");
											 
											 test_obj.sub_fox.add("Deutchland");
											 test_obj.pred_fox.add("capital");
											 test_obj.obj_fox.add("nolabel");
											 
											 test_obj.sub_fox.add("Deutchland");
											 test_obj.pred_fox.add("in");
											 test_obj.obj_fox.add("nolabel");
											 
											 

									 
											 test_obj.sub_fox.add("Google");
											 test_obj.pred_fox.add("locatedin");
											 test_obj.obj_fox.add("cal");
											 
											 
											 test_obj.sub_fox.add("nolabel");
											 test_obj.pred_fox.add("region");
											 test_obj.obj_fox.add("Europe");
											 
											 
											 test_obj.sub_fox.add("Germany");
											 test_obj.pred_fox.add("region");
											 test_obj.obj_fox.add("Europe");
											 
											 
											 
											 
											 
												double actual_score11 =test_obj.response_Matching();
												System.out.println(actual_score11 + "score ");	
												
												
												
//												 test 12
												System.out.println("........... test 12.......");
											
											
												 test_obj.sub.add("Germany");
												 test_obj.pred.add("capital");
												 test_obj.obj.add("Berlin");
												 
	         									 test_obj.sub.add("Deutschland");
												 test_obj.pred.add("in");
												 test_obj.obj.add("Europe");
												 
												 test_obj.sub.add("Europe");
												 test_obj.pred.add("country");
												 test_obj.obj.add("Germany");
												 
												 test_obj.sub.add("Germany");
												 test_obj.pred.add("city");
												 test_obj.obj.add("Frankfurt");
												 
												 test_obj.sub_fox.add("Germany");
												 test_obj.pred_fox.add("city");
												 test_obj.obj_fox.add("Berlin");

												 
												 
												 test_obj.sub_fox.add("Germany");
												 test_obj.pred_fox.add("region");
												 test_obj.obj_fox.add("Europe");
												 
												 
												 
												 
												 
													double actual_score12 =test_obj.response_Matching();
													System.out.println(actual_score12 + "score ");	
													
													
//													 test 13
													System.out.println("........... test 13.......");
												
												
													 test_obj.sub.add("Germany");
													 test_obj.pred.add("capital");
													 test_obj.obj.add("Berlin");

													 test_obj.sub.add("Europe");
													 test_obj.pred.add("country");
													 test_obj.obj.add("Germany");
													 
													 test_obj.sub.add("Germany");
													 test_obj.pred.add("city");
													 test_obj.obj.add("Frankfurt");
													 
													 test_obj.sub_fox.add("Germany");
													 test_obj.pred_fox.add("nolabel");
													 test_obj.obj_fox.add("country");
                                                     
													 
													 test_obj.sub_fox.add("Germany");
													 test_obj.pred_fox.add("to");
													 test_obj.obj_fox.add("abc");
													 
													 
													 test_obj.sub_fox.add("Germany");
													 test_obj.pred_fox.add("city");
													 test_obj.obj_fox.add("Berlin");
													 
													 
													 test_obj.sub_fox.add("Germany");
													 test_obj.pred_fox.add("play");
													 test_obj.obj_fox.add("nolabel");
													 
													 
													 test_obj.sub_fox.add("Germany");
													 test_obj.pred_fox.add("in");
													 test_obj.obj_fox.add("Europe");
													 
													 test_obj.sub_fox.add("country");
													 test_obj.pred_fox.add("place");
													 test_obj.obj_fox.add("Europe");
													 
													 
													 
													 
														double actual_score13 =test_obj.response_Matching();
														System.out.println(actual_score13 + "score ");	
														
												
											
			
											

								
						
										

							
					
		
	}

}
