package number;

public class amstrongWithinArange 
{
		public static int iscount(int n)
		{
		int	count=0;
			while(n>0)
			{
				count++;
				n=n/10;
			}
			return count;
		}
		
		public static int issum(int n,int c)
		{
			int s=1,a=0;
			while(a<c)
			{
				s=s*n;
				a++;
			}
			
			return s;
		}
		public static void main(String[] args) 
		{
			
		int n=1000;
			for(int i=10;i<=n;i++)
			{
			int k=0;
			int b=i;
			int c = iscount(i);
			while(b>0)
			{
				int r=b%10;
				
				 k=k+issum(r,c);
				
				b=b/10;
			}
			if(i==k)
			{
			System.out.println(k);
		}
			}
			}
	}

