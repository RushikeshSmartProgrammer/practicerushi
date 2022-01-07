package ArrayList;
import java.util.*;

public class AddAndremoveDataFromArrayList {
	public static void main(String args[])              //Addition and removal of data from array list
	{
		List<Integer> list=new ArrayList<Integer>(); 
		list.add(1);
		list.add(11);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(17);
		System.out.println(list);
		list.remove(1);
		list.remove(1);
		list.remove(1);
		list.remove(1);
		System.out.println("ArrayList After Removeval Of Element:");
		
		System.out.println(list);
		
		List<String> list1=new ArrayList<String>();
		list1.add("Mango");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Apple");
		System.out.println(list1);
		list1.remove(1);
		System.out.println("ArrayList After Removeval Of Element:");
		System.out.println(list1);
		
		
	}

}

