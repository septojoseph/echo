package star;

public class alphaCapRan
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch='A';
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(ch--+" ");
				
			}
			ch=(char)(ch+(2*i+1));
			System.out.println();
			
		}

	}
}
