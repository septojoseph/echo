package String;

public class wordAlongWithNumber 
{

		public static void main(String[] args) 
		{
		String s = "java is easy";
		String res=" ";
		String[] ar=new String[10];
		int count=0,j=0,cout=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				res=res+s.charAt(i);
				count++;
			}
			else
			{
				res=res+count+" "	;
				count=0;
				
			}		
		}
		res=res+count;
		System.out.println(res);
	}
}
