package star;

public class patternR
{

	public static void main(String[] args) 
	{
		int n=9;
		for (int i = 0; i <=n; i++) 
		{
			for (int j = n/2; j <=n ; j++) 
			{
				if(i==0&&j!=n/2&&j!=n||i==n/2&&j!=n||j==n/2&&i!=0||j==n&&i!=0&&i<n/2||i==j&&i!=0)
					
					System.out.print("s ");
				else
					System.out.print("  ");		
				
			}
			System.out.println("");

			
		}

	}
}
