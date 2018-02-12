// refwork
package refwork;

public class as 
{
	public static void main(String args[])
	{
		
		String s2 = "how are you are you";
		int n=0;
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(ch!=' ')
			{
				n=n+sum(ch);
			}
			else
			{
				System.out.print(n+" ");
				n=0;
			}
		}
		System.out.print(n+" ");
	}
	public static int sum(char s)
	{
		int k=0;
		if(s>=97&&s<=122)
		{
		 k=s-70;
		}
		else if(s>=65&&s<=90)
		{
			 k=s-26;	
		}
		return k;
	  }
		
	
}