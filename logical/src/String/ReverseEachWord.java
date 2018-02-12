
package String;

public class ReverseEachWord 
{
	
		public static void main(String[] args) 
		{
			String s = "java is easy";
			String res=" ";
			System.out.println(s);
			char[] ch= s.toCharArray();
			for(int i=0; i<ch.length-1;i++)
			{
				int k=i;
				while(i<ch.length-1&&ch[i]!=' ')
				{
					i++;
				}
				int j =i;
				while(j>=k)
				{
					res=res+ch[j];
					j--;
				}
				res=res+" ";
				
			}
				
			System.out.println(res);
		}
}
