package SynchronizedPrinterExample;

public class Aniket extends Thread{
	Printer print;
	Aniket(Printer print)
	{
		this.print=print;
		
	}
    public  void run()
    {
    	
    	System.out.println("Running...");
    	print.printing("Aniket resume Is Printing....");
    }
}
