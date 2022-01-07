package ArrayList;
import java.util.*;
public class Example2 {
	public static void main(String args[])                      //Iterate ArrayList
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		list.add("Test6");
		System.out.println(list);
		System.out.println("");
		
		System.out.println("Iterate ArrayList Through For Loop:");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+",");
	    }
		
		System.out.println();
		System.out.println("Iterate ArrayList Through For Each Loop:");
		for(String li:list)
		{
			System.out.print(li+",");
		}
		System.out.println();
		System.out.println("Iterate ArrayList Through Iterator:");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
	}
	}