package String;

	import java.util.Scanner;

	public class vowelsToOne 
	{
		  static Scanner sc = new Scanner(System.in);

		  public static void main(String[] args) {
		    System.out.print("Enter a string: ");
		    String s = sc.nextLine();
		    String originalString = s;

		    for (int i = 0; i < s.length(); i++) 
		    {
		      char c = s.charAt(i);
		      if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
		          || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u')) 
		      {
		        String front = s.substring(0, i);
		        String back = s.substring(i + 1);
		        s = front + "1" + back;
		      }
		      else if((c==' '))
		      {
		    	  String front = s.substring(0, i);
			        String back = s.substring(i + 1);
			        s = front + "2" + back;  
		      }
		    }
		    System.out.println(originalString);
		    System.out.println(s);
		  }
}
