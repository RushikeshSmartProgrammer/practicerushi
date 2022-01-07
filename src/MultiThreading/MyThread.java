package MultiThreading;

public class MyThread implements Runnable{
	public static void main(String str[])
	{
	MyThread m1=new MyThread();
	MyThread m2=new MyThread();
	Thread t1=new Thread(m1);
	Thread t2=new Thread(m2);
    t1.start();
    t2.start();
}


	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=0;i<10;i++)
	
		System.out.println("Thread Running"+"   "+i+"   "+Thread.currentThread().getName());
	
	}
}