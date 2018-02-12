package String;

public class compare 
{
	  public static void main(String arg[])
	  {   
	   compareStrings("Ranjeet mishra","ranjeet MishRA");
	  }
	  public static void  compareStrings(String str1,String str2)
	  {
	    //This is used to remove case sensitivity
	    //Comment them,if you want case sensitivity
	     str1=str1.toLowerCase();
	     str2=str2.toLowerCase();
	 
	   if(str1.length()!=str2.length())
	   {   
	       System.out.println("Not Equal");
	       return;//means go back to caller
	   }
	    for(int i=0;i<str1.length();i++)
	   {
	    //No need to type cast to int,since char internally stored as UNICODE Value
	    if(str1.charAt(i)!=str2.charAt(i)) 
	    {
	      System.out.println("Not Equal");
	      return;
	    }
	   }
	   //If control came here,that means strings are equal
	     System.out.println("String are equal");
	  }//method 
	}//class


