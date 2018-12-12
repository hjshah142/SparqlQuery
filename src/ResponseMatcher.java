import java.util.ArrayList;
import java.util.List;

public class ResponseMatcher {

	public static void main(String[] args) {
            ResponseMatcher obj1 = new ResponseMatcher();
            obj1.response_Matching();
            
	}
	public void response_Matching() 
	{
		List<String> sub_fox = new ArrayList<String>();
		List<String> obj_fox = new ArrayList<String>();
		List<String> pred_fox = new ArrayList<String>();
		List<String> sub = new ArrayList<String>();
		List<String> obj = new ArrayList<String>();
		List<String> pred = new ArrayList<String>();
		int total_triples = sub.size();
		 sub_fox.add("Google");
		 pred_fox.add("CEO");
		 obj_fox.add("Sundar_üichai");
		 sub_fox.add("Google");
		 pred_fox.add("CEO");
		 obj_fox.add("Sundar_Pichai");
		 sub_fox.add("Google");
		 pred_fox.add("Ceo1");
		 obj_fox.add("Sundar_üichai");
		 
		//
		 sub.add("Sundar_Pichai");
		 pred.add("workfor");
		 obj.add("Google");
		System.out.println("List of Subjects in OKE files.........  ");
		System.out.println(sub);
		System.out.println("List of predicates  in OKE files.........  ");
		System.out.println(pred);
		System.out.println("List of Objects  in OKE files.........  ");
		
		System.out.println(obj);
		System.out.println(" ...........");

		System.out.println("List of Subjects.........  ");
		System.out.println(sub_fox);
		System.out.println("List of predicates.........  ");
		System.out.println(pred_fox);
		System.out.println("List of Objects.........  ");
		System.out.println(obj_fox);
		System.out.println(" ...........");

      
		int size_fox = obj_fox.size();
		int size_oke = pred.size();
		float truth = 0;

			
			for (int a = 0; a < size_oke; a++) {
			for (int b = 0; b < size_fox; b++) {
//				if (obj.get(a).equals(obj_fox.get(b)) && pred.get(a).equals(pred_fox.get(b))
//						&& sub.get(a).equals(sub_fox.get(b))) 
//				{
//					System.out.println(" same triple found");
//					truth++;
//				}
		            int triple_counter = 0;
					if (obj.get(a).equals(obj_fox.get(b)))
					{triple_counter++;}
					if (sub.get(a).equals(sub_fox.get(b)))
					{triple_counter++;}
					if (sub.get(a).equals(sub_fox.get(b)))
					{triple_counter++;}
					if(triple_counter == 0)
					{
						System.out.println("Noting matched");
						
					}
					else if(triple_counter == 1)
					{
						System.out.println("one match found");
						truth = (float) (truth + 0.33);
					}
					else if(triple_counter == 2)
					{
						System.out.println("two match found");
						truth = (float) (truth + 0.66);
					}
					else if(triple_counter == 3)
					{
						System.out.println("three  match found");
						truth = truth + 1;
						
					}
					System.out.println("Value of truth " + truth);
						
					
						
				
			}
		}
	}

}
