package String;

	import java.io.IOException;
	public class anagram 
	{
		public static String removespace(String s)
		{
			String res=" ";
			for(int i=0;i<s.length();i++)
			{
		      if(s.charAt(i)!=' ')
		      {
			  res=res+s.charAt(i);
		      }
	       }
			return res;
	    }
		
		public static String sort(String s)
		{
			String res = " ";
			char[] s1 = s.toCharArray();
			for(int i=0;i<s1.length;i++)
			{
			  for(int j=i+1;j<s1.length;j++)	
			  {
				  if(s1[i]>s1[j])
				  {
					  char t = s1[i];
					  s1[i]=s1[j];
					  s1[j]=t;
				  }
			  }
			  res=res+s1[i];
			}
			return res;		
		}
		public static void main(String[] args) throws IOException 
		{
			String s1 = "mother in low";
			String s2 = "low in mother";
			s1 =removespace(s1);
			s2 =removespace(s2);
			if(s1.length()!=s2.length())
			{
				System.out.println("not anagram");	
			}
			else
			{
				s1=s1.toUpperCase();
				s2=s2.toUpperCase();
				s1=sort(s1);
				s2=sort(s2);
				System.out.println(s1);
				System.out.println(s2);
				System.out.println("anagram");
			}
			
		}

	}

