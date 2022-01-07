package practice;

public class Hm {
	public static void main(String args[])
	{
		
	
	for(int i=1;i<=20;i++)
	{
		if(i%3==0 && i%5==0)
		{
			System.out.println("usb device");
		}else if(i%5==0)
		{
			System.out.println("Device");
		}else if(i%3==0)
		{
			System.out.println("Usb ");
		}
		
		else 
		{
			System.out.println(i+"  ");
		}
	}
	

	}
	
}
