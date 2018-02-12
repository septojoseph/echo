package star;

public class patternS
{
	public static void main(String[] args) 
	{
		int n=9;
		for (int i = 0; i <=n; i++) 
		{
			for (int j = 0; j <=n ; j++) 
			{
				if(i==0&&j!=0||i==n&&j!=n&&i!=j||i==n/2&&j!=n&&j!=0||j==0&&i<n/2&&i!=0||j==n&&i>n/2&&i!=j)
					
					System.out.print("s ");
				else
					System.out.print("  ");		
				
			}
			System.out.println("");

			
		}}
}
