package number;

class amstrong
{  
	public static int iscount(int n)
	{
	int	count=0;
		while(n>0)
		{
			
			n=n/10;
			count++;
		}
		return count;
	}
	
	public static int issum(int n,int c)
	{
		int s=1,a=0;
		for(int i=0;i<c;i++)
		{
			s=s*n;
			//a++;
		}
		
		return s;
	}
	public static void main(String[] args) 
	{
		int n=153,k=0;
		int temp=n;
		int c = iscount(n);
		
		while(n>0)
		{
			int r=n%10;
			
			 k=k+issum(r,c);
			
			n=n/10;
		}
		if(temp==k)
		{
			System.out.println("amstrong");
		}
		System.out.println(k);
	}
}