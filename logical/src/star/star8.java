package star;

public class star8 
{
	public static void main(String[] args) 
	{
			int n=3;
			for (int row = 0; row < n; row++) 
			{
				for (int space = 0; space < n-1-row; space++) 
				{
					System.out.print("  ");
					
				}
				for (int stars = 0; stars<=2*row; stars++) 
				{
					System.out.print("* ");
					
				}
				System.out.println(" ");
			}
}}