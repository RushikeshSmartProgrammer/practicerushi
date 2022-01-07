package Array;
import java.util.Scanner;
public class Menu {
	public static void main(String args[])
	{
		int ch;
		String str;
		Scanner sc=new Scanner(System.in);
		do 
		{
			System.out.println("!!MENU!!");
			System.out.println("1.Starter");
			System.out.println("2.Beverages");
			System.out.println("3.Meal");
			System.out.println("Make Your Choice");
		   ch=sc.nextInt();
		   switch(ch)
		   {
		   case 1:
			   System.out.println("Your Order Placed For Starter");
			   break;
		   case 2:
			   System.out.println("Your Order Placed For Beverages");
			   break;
		   case 3:
			   System.out.println("Your Order Placed For Meal");
			   break;
		  default:
				   System.out.println("You Make Wrong Choice");
			   
		   }
			System.out.println("Do You Want To Order More?(Yes/No)");
			str=sc.next();
			
		}while (str.equalsIgnoreCase("Yes"));
		System.out.println("Thank You!Visit Again");
	}
	

}
