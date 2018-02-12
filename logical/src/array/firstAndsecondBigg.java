package array;

import java.util.Scanner;

public class firstAndsecondBigg 
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
			int fbig=ar[0];
			int sbig=ar[1];
			for(int i=1;i<ar.length;i++)
			{
				if(fbig<ar[i])
				{
					sbig=fbig;
					fbig=ar[i];
					
				}
			}
			System.out.println("biggest is"+fbig+"  "+sbig);
		}
	}
			
