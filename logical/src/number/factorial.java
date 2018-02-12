package number;

class factorial
{  
	public static int isfact(int num)
	{
		int fact=1;
		while(num>1)
		{
			fact=fact*num;
			num--;
			isfact(num);
		}
		return fact;
	}
	
	 public static void main(String args[])
	 {  
	   
	  int num=5;    //It is the number to calculate factorial    
	  int fct=isfact(num);
	  System.out.println("Factorial of "+num+" is: "+fct);    
	 }  
	}  