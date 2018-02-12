package proApti;

class hhhh 
{
 void printer(int n)
{
	for(int i=0;i<5;i++)
	{
	System.out.println(i*n);
	}
}
}


class threadone extends Thread
{
	hhhh p1;
	threadone(hhhh p1)
	{
		this.p1=p1;
	}
	public void run(int n)
	{
		p1.printer(5);
	}
	
  }
class threadtwo extends Thread

{
	hhhh p2;
	threadtwo(hhhh p2)
	{
		this.p2=p2;
	}
	public void run(int n)
	{
		p2.printer(100);
	}
	}
	
	public class hhh 
	{
	public static void main(String[] args)
	{
         hhhh obj = new hhhh();
		threadone t1 = new threadone(obj);
		threadtwo t2 = new threadtwo(obj);
		t1.start();
		t2.start();
	}}
	
	
