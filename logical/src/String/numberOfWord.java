package String;

	import java.util.Scanner;

	public class numberOfWord 
	{
			
			   public static void main(String args[])
			   {   
				   
			       String s = " hai how are yoy ho hi hoo";
			       int count;
			       
			       if(s.charAt(0)!=' ')
			       {
			           count = 1;
			       }
			       else
			       {
			    	   count=0;
			       }
			      
					for(int i=0; i<=s.length()-1; i++)
			        {
			            if(s.charAt(i) ==' ' && s.charAt(i+1)!=' ')
			            {
			                count++;
			            }
			        }
			        
					
			        System.out.print("Total Number of Words in Entered Sentence is " +count);
			   }
			}

		


