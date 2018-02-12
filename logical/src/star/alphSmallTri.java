package star;

public class alphSmallTri 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i = 1; i <= n; i++) 
		{
			int count=96+i;
		
			for (int j = 1; j <= i; j++) 
			{
				System.out.print((char)count+" ");
				count=count+n-j;
				
			}
			
			System.out.println();
			
		}

	}
}
