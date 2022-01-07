package MultiThreading;

public class MyThread3 extends Thread {
	public static void main(String str[])
	{
	MyThread3 m1=new MyThread3();
	MyThread3 m2=new MyThread3();
	MyThread3 m3=new MyThread3();
    m1.start();
    m2.start();
    
    m3.setDaemon(false);
    m3.start();
    System.out.println("Terminate");
    
}

	

	
	public void run() {
		// TODO Auto-generated method stub
	for(int i=0;i<10;i++)   {                                                     
	try {
		if(Thread.currentThread().getName().equals("Thread2")) {
		Thread.sleep(2000);
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("Thread Running"+"   "+i+"   "+Thread.currentThread().getName());
	}
	}


}
