package String;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;
	public class SplitintoStringArray {

		public static void main(String[] args) throws IOException
		{
			FileReader fr = new FileReader("D:/hhh/test.txt");
			BufferedReader br = new BufferedReader(fr);
		    String s = br.readLine();
		    System.out.println(s);
		    String res=" ";
		    int count=0;
		    String ar[] = new String[10];
		    char[] ch = s.toCharArray();
		    for(int i=0;i<ch.length;i++)
		    {
		    	if(ch[i]!=' ')
		    	{
		    		res =res+ch[i];
		    	}
		    	else
		    	{
		    		ar[count]=res;
		    		count++;
		    		res=" ";
		    	}
		    }
		    ar[count]=res;
		    for(int i=0;i<=count;i++)
		    {
		    	System.out.println(ar[i]);
		    }
		    
		    /*FileWriter fw = new FileWriter("D:/hhh/tt.txt");
		    BufferedWriter bw= new BufferedWriter(fw);
		    bw.write(s);
		    bw.close();
	        System.out.println(s);*/
		}
}
