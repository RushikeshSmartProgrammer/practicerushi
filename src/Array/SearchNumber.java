package Array;
import java.util.Scanner;
public class SearchNumber {
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
	int a[]= {3,4,5,6,10,44};
	for(int v:a)
	{
		System.out.print(v+",");
		
	}
	System.out.println();
	System.out.println("Enter the value within above number");
	int b=sc.nextInt();
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==b)
		{
			System.out.println(b);
			//System.out.println("Your value on index no.="+i);
		}
			
	}		
	}

}
