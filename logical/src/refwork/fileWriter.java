package refwork;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class fileWriter
	{
		public static void main(String[] args) throws IOException 
		{	
		String path="D:/hhh/test.txt ";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String s1 = br.readLine();
		System.out.println(s1);
		
			String ar[] = new String[10];
			int count=0,cout=0,l=0;
			String res=" ";
			char ch[] = s1.toCharArray();
			
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]!=' ')
				{
					res = res+ch[i];
				}
				else
				{
					ar[count]=res;
					count++;
					res=" ";
				}
			}
			ar[count]=res;
			for(int i=0;i<count;i++)
	        {
				String s= ar[i];
				for(int j=0;j<=count;j++)
				{
					
	            if(s.equals(ar[j]))
	            {
	                cout++; 
	                ar[j]=" ";
	            }
	          }	
				if(s!=" ")
				{
				System.out.println(s+" -- "+cout);
				
			FileWriter writer = new FileWriter("D:/hhh/my.txt", true);
	        BufferedWriter bufferedWriter = new BufferedWriter(writer);
	        bufferedWriter.write(s+" --- "+cout);
	        bufferedWriter.newLine();
	        bufferedWriter.close();       
			cout=0;
	       }
				cout=0;	
		}
		}
	}

