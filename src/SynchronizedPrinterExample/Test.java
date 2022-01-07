package SynchronizedPrinterExample;

public class Test {
	public static void main(String args[])
	{
		Printer print=new  Printer();
		Rushikesh r=new Rushikesh(print);
		Rahul r1=new Rahul(print);
		Aniket a=new Aniket(print);
		r.start();
		r1.start();
		a.start();
	}

}
