package String;

public class repeatedCharecter 
{
		public static void main(String[] args) 
		{
			String s="hai how are you";
			char[] ch1 = new char[10];
			char[] ch=s.toCharArray();
			int n = ch.length;
			int count=0;
			for(int i=0;i<n;i++)
			{
				char s1=ch[i];
				for(int j=0;j<n;j++)
				{
					if(s1==ch[j])
					{
					count++;
				    ch[j]=' ';
					}
				}
				if(s1!=' '&&count>1)
				{
				System.out.println(s1+" repeated "+count);
				}
				count=0;
			}

		}
}
