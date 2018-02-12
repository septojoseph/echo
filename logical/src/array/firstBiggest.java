package array;
import java.util.Scanner;

public class firstBiggest
{
		
		public static void main(String[] args) 
		{
			
		Scanner sc = new Scanner(System.in);
				System.out.println("enter size");;
				int s = sc.nextInt();
				System.out.println("enter element");
				int ar[] = new int[s];
			for(int i=0;i<ar.length;i++)
			{
			ar[i]=sc.nextInt();
			}
			int big=ar[0];
			for(int i=1;i<ar.length;i++)
			{
				if(big<ar[i])
				{
					big=ar[i];
				}
			}
			System.out.println("biggest is"+big);
		}
	}
			
