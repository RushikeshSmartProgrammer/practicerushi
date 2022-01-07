package SynchronizedPrinterExample;

public class Rahul extends Thread {
	Printer print;
	Rahul(Printer print)
	{
		this.print=print;
	}
	public void run()
	{
		System.out.println("Running....");
		print.printing("Rahul Resume IS Printing....");
	}

}
