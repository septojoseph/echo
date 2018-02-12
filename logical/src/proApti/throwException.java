package proApti;

	class myexception extends Exception 
	{
		myexception(String msg)
		   {
		      super(msg);
		   }
		}

		class throwException 
		{
		   static void  employeeAge(int age) throws myexception
		   {
		      if(age < 0)
		         throw new myexception("Age can't be less than zero");
		      else
		         System.out.println("Input is valid!!");
		   }
		   public static void main(String[] args) 
		   {
		       try 
		       {
		            employeeAge(4);
		       }
		       catch (myexception e) 
		       {
		            e.printStackTrace();
		       }
		   }
		}

