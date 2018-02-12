package star;

public class star6 
{
	public static void reverse(String str)
	{
		int slegth=str.length()-1;
		for (int i = slegth; i >=0; i--) 
		{
			System.out.print(str.charAt(i));
		}
		
	}

public static void main(String[] args) {
		
		int n=9;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i == n / 2 && j == n / 2 || i == n - 1 
						|| i == j && i >= j && i >= n / 2
						|| i + j == n - 1 && i >= n / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}}
