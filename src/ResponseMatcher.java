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
	public double response_Matching() 
	{
		int size_fox = pred_fox.size();
		int size_oke = pred.size();
		double score = 0;
		double result = 0;
		double max = 0;
		if(size_fox == 0)
		{
			System.out.println("no triples found");
			result = 0;
			return 0;
		}
		else 
		{     		System.out.println("List of Subjects in OKE files.........  ");
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
			System.out.println("maximum number of Matches");
			System.out.println(max);
			score = (double)(score + (max/3)) ;
            max = 0;
			
			}
			System.out.println("total score");
			System.out.println(score);
			System.out.println("total score in percentage");
			result = (score/size_oke)*100;
	
    	sub_fox.clear();
    	obj_fox.clear();
        pred_fox.clear();
    	sub.clear();
        obj.clear();
        pred.clear();
        result = Math.round(result * 100.0) / 100.0;
    	System.out.println(result);
		return result;
		}
			
	}


}