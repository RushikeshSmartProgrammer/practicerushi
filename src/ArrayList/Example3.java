package ArrayList;
import java.util.*;            //addAll(),clear(),contain(),indexOf()

public class Example3 {                //                   1) addAll() Method
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		//list.clear();                          //          2) clear() Method
		System.out.println(list);
		
		ArrayList<String> list1=new ArrayList<>();
		list.add("Test5");
		list.add("Test6");
		list.addAll(list1);
		System.out.println(list);
		
		
		
		if(list.contains("Test1"))              //           3)contains()  check if element exists
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
		System.out.println("Index OF Method return valu in Boolean Form:");
		System.out.println(list.indexOf("Test1")>0);  //True                         4)indexOf()  to check if element exists.
		System.out.println(list.indexOf("Test9")>0);	//false
		
		
		System.out.println("Index OF Method return valu in Integer Form:");         // 5)indexOf()  to check if element exists.and value return in integer.
		ArrayList<String> list4=new ArrayList<>(Arrays.asList("Play1","Play2","Play3","Play4"));
		int firstIndex=list4.indexOf("Play3");
		System.out.println(firstIndex);
		int firstIndex1=list4.indexOf("Hello");
		System.out.println(firstIndex1);
		
 	
	}

}
