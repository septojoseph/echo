package String;
import java.util.Scanner;

	public class substring {
		public static void main(String args[])
		{
			System.out.println("Enter a string");
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			System.out.println("Enter a string");
			String s2 = sc.nextLine();
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			int count=0;
			for(int i=0;i<=ch1.length;i++)
			{
				int k= i;
				int j=0;
					while(k<ch1.length&&j<ch2.length&&ch1[k]==ch2[j])
					{
						k++;
						j++;
					}			
			if(j==ch2.length)
			{
				count++;
				System.out.println("present at"+i);
	        }
		}
	}
}
