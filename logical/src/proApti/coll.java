package proApti;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;


class employe
{
	int eno;
	String name;
	int sal;
	employe(int eno,String name,int sal)
	{
		this.eno=eno;
		this.name=name;
		this.sal=sal;
	}
	public String toString()
	{
		String info ="eno"+eno+"name"+name+"sal"+sal;
		return info;
	}
}

public class coll 
{

	public static void main(String[] args)
	{
		employe e1= new employe(1,"septo",300);
		employe e2= new employe(2,"amal",400);
		employe e3= new employe(3,"anoop",500);
		PriorityQueue a=new PriorityQueue();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		int s=a.size();
		System.out.println(s);
		Iterator i1 = a.iterator();
		
		System.out.println(a.peek());
		
		//for(int i=0;i<s;i++)
	//{System.out.println(a.get(i));}
		
		//for(Object obj:a)
	   // {	employe em=(employe)obj;
		//System.out.println(em);  }
   
	//	while(i1.hasNext()!=false)
	//	{
		//	System.out.println(i1.next());
	//	}
}}
