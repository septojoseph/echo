package refwork;


	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;

	public class ReadFromTextFile 
	{
		public static void main(String[] args)
		{
			String path = "D:/hhh.txt";
			
			try 
			{
				FileReader fileReader = new FileReader(path);
				BufferedReader reader = new BufferedReader(fileReader);
				String line = " ";
				while((line=reader.readLine())!=null)
				{
					System.out.println(line);
				}
			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}



