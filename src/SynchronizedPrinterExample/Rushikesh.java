package SynchronizedPrinterExample;

public class Rushikesh extends Thread{
	Printer print;
	Rushikesh(Printer print)
	{
	  this.print=print;
	}
  public void run()
  {
	  System.out.println("Running.....");
	  print.printing("Rushikesh Resume Is Printing....");
  }
}
