package SynchronizedPrinterExample;

public class Printer {
	public synchronized void printing(String str)
	{
		System.out.println("Printing Strated"+str);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Printing done"+str);
	}

}
