package String;

public class ReverseScentence
{
			public static void main(String[] args) 
			{
				String s = "java is easy";
				String res=" ";
				System.out.println(s);
				char[] ch= s.toCharArray();
				for(int i=ch.length-1;i>=0;i--)
				{
					int k=i;
					while(i>=0&&ch[i]!=' ')
					{
						i--;
					}
					int j =i+1;
					while(j<=k)
					{
						res=res+ch[j];
						j++;
					}
					res=res+" ";
					
				}
					
				System.out.println(res);
			}
}
