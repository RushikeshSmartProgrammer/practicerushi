package Array;
import java.util.Scanner;
public class IRCTC {
	public static void main(String args[])
	{
		int ch;String str;
		Scanner sc=new Scanner (System.in);
		do {
		System.out.println("Welcome to IRCTC");
		System.out.println("1.Ticket Booking");
		System.out.println("2.Check Status of Booking");
	    System.out.println("3.Coach Position");
	    System.out.println("4.Complaint");
	    System.out.println("Select your choice");
	    ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:
	    	System.out.println("1.Reservation");
	    	System.out.println("2.General");
	    	System.out.println("Select from Above Option.");
	    	ch=sc.nextInt();
	    	{ if(ch==1)
	    	{
	    		System.out.println("your ticket is reserved.");
	    	} else if  (ch==2)
	    	{
	    		System.out.println("your ticket is booked in general");
	    	}else
	    	{
	    		System.out.println("Invaild Choice");
	    		break;
	    	}
	    	}
	    	{
	    		System.out.println("Make Your Payement...");
	    		System.out.println("1.UPI");
	    		System.out.println("2.Debit");
	    		System.out.println("3.Paytm");
	    		ch=sc.nextInt();
	    		{
	    			if(ch==1 ||ch==2||ch==3)
	    			{
	    				System.out.println("Your Ticket Is Successfully Booked...");
	    			}else
	    			{
	    				System.out.println("You Make Wrong Choice");
	    			}
	    		}
	    	}
	    	break;
	    case 2:
	    	System.out.println("Your ticket is Confirmed.");
	    	break;
	    case 3:
	    	System.out.println("Enetr yor Coach No.(1.A1,2.B1,3.C1)");
	    	ch=sc.nextInt();
	    	if(ch==1)
	    	{
	    		System.out.println("Your coach at 1st Postion ");
	    	}else if(ch==2)
	    	{
	    		System.out.println("Your coach at Second Position");
	    	}else if(ch==3)
	    	{
	    		System.out.println("Your Caoch At Third Position");
	    	}else
	    	{
	    		System.out.println("You Select Wrong Choice");
	    	}
	    	break;
	    case 4:
	    	System.out.println("Please write your complaint.");
	    	str=sc.next();
	    	System.out.println("Thank You! for Your Valueable Feedback ");
	    	break;
	    	
	    	default:
	    		System.out.println("You Make Wrong Choice");
	    }
	    System.out.println("Do You Want To Continue...(Yes/No or Y/N)");
	    str=sc.next();
	    
	} while(str.equalsIgnoreCase("Yes") ||str.equalsIgnoreCase("Y"));
		System.out.println("Thank You!!Visit Again!!");
}	
}
