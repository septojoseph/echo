package star;

public class numStarPyramid 
{

	public static void main(String[] args) {
      int n=5;
      //int count=1;
      for (int row = 0; row <n; row++) 
      {
    	  int count=1;
    	  for (int space = 0; space < n-1-row; space++) 
    	  {
    		  System.out.print("  ");
			
		}
    	  for (int star = 0; star <= 2*row; star++) 
    	  {
    		  if(star%2==0)//even place print count
    			  
    			  System.out.print(count++ +" ");
    		  else//odd place print
    			  System.out.print("* ");
			
		}
    	  System.out.println();
		
	}
	}
}
