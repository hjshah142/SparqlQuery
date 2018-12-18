import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResponseMatcher {
	
	List<String> sub_fox = new ArrayList<String>();
	List<String> obj_fox = new ArrayList<String>();
	List<String> pred_fox = new ArrayList<String>();
	List<String> sub = new ArrayList<String>();
	List<String> obj = new ArrayList<String>();
	List<String> pred = new ArrayList<String>();

	public static void main(String[] args) {
            ResponseMatcher obj1 = new ResponseMatcher();
            obj1.response_Matching();
            
	}
	public double response_Matching() 
	{

		 sub_fox.add("Google");
		 pred_fox.add("CE");
		 obj_fox.add("Sundar_Pichai");
		 sub_fox.add("Google");
		 pred_fox.add("located");
		 obj_fox.add("California");
		 sub_fox.add("Google");
		 pred_fox.add("CEO");
		 obj_fox.add("Sundar_Pichai");
		 
		 sub.add("Google");
		 pred.add("located");
		 obj.add("California");

		 sub.add("Google");
		 pred.add("CEO");
		 obj.add("Sundar_Pichai");

//		 sub = Arrays.asList("Sundar_Pichai", "a", "James","Google");
//		 pred = Arrays.asList("CEO","Employee", "worksfor","fires");
//         obj = Arrays.asList("Google", "Google", "Sundar_Pichai","Empolyee");
//		 sub_fox = Arrays.asList("Sundar_Pichai", "a", "James","Google");
//		 pred_fox = Arrays.asList("CEO","Employee", "worksfor","fires");
//		 obj_fox = Arrays.asList("Google", "Google", "Sundar_Pichai","Empolyee");
//		 sub_fox = Arrays.asList("Sundar_Pichai","a");
//		 pred_fox = Arrays.asList("CEO","d");
//         obj_fox = Arrays.asList("Google","c");
//		 sub = Arrays.asList("Sundar_Pichai","a");
//		 pred = Arrays.asList("CEO","d");
//		 obj = Arrays.asList("Google","c");

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

      
		int size_fox = pred_fox.size();
		int size_oke = pred.size();
		double score = 0;
		double result = 0;
		double max = 0;
		

			
			for (int a = 0; a < size_oke; a++)
			{
				
			for (int b = 0; b < size_fox; b++) 
				{

				
		            double triple_counter = 0;
		        
					if (obj.get(a).equals(obj_fox.get(b)))
					{triple_counter++;}
					if (sub.get(a).equals(sub_fox.get(b)))
					{triple_counter++;}
					if (pred.get(a).equals(pred_fox.get(b)))
					{triple_counter++;}
					if(triple_counter> max)
					{  
						
						 max = triple_counter;
						
					}

					
				}
			System.out.println("maximum number of Matthes");
			System.out.println(max);
			score = (double)(score + (max/3)) ;
            max = 0;
			
			}
			System.out.println("total score");
			System.out.println(score);
			System.out.println("total score in percentage");
			result = (score/size_oke)*100;
			System.out.println(result);
			return result;
			
	}

}
