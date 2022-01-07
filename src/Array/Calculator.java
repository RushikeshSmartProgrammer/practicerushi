package Array;
import java.util.Scanner;
public class Calculator {
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		do 
		{
			System.out.println("@$  Calculator  $@");
			
			System.out.print("1.Addition");
			System.out.print(" "+"2.Subtraction");
			System.out.print(" "+"3.Multiplication");
			System.out.println(" "+"4.Division");
			System.out.println("Select The Within Above Option");
			int ch=sc.nextInt();
			System.out.println("Enter first Value");
			int a=sc.nextInt();
			System.out.println("Enter Second Value");
			int b=sc.nextInt();
			
			switch(ch)
			{
			case 1:
			System.out.println(a+b); 
			break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
				default:
					System.out.println("Your Choice is Wrong");
			}
			System.out.println("Do You Want To Continue....(Yes/No)");
			 str=sc.next();
			
		}while(str.equalsIgnoreCase("Yes"));
		System.out.println("Thank You!!");
	}

}
