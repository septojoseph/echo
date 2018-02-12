package number;

public class nprime
{

	public static void isprime(int n)
	{
		
		int flag=0;
		for(int i=2;i<=n/2;i++)
		  {    
		   if(n%i==0)
		     {    
		        //System.out.println("Number is not prime");    
		        flag=1;    
			      break;    
		   }    
		  }    
		  if(flag==0) 
		  {
		  System.out.println(n);    
		    }  
		}	
	
	 public static void main(String args[])
	 {  
	   for(int i=2;i<=100;i++)
	  {    
	   isprime(i);
	  }
}
}