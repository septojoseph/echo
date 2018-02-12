package star;

public class star4 
{
	  public static void main(String[] args) 
	  {
	  int num=15,temp=1;
	  for (int i = 1; i <= 15; i++)
	     {
	 	  for (int k = i; k <15; k++)
	 	  {
	        System.out.print(" ");
	 	  }
	          for (int j =1; j <= i; j++)
	             {	 
	               System.out.print(temp+" ");
	                temp++;                 
                 }
	   	        System.out.println();
	   	     if(temp>15)
	         {
	         break;
	         }  
	    }	 
	}
}