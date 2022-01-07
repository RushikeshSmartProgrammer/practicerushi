package MultiThreading;

public class MyThread2 extends Thread {
	                                           										//here we extends the thread
		public static void main(String str[])
		{
		MyThread2 m1=new MyThread2();
		MyThread2 m2=new MyThread2();
	    m1.start();
	    m2.start();
	}

		

		@Override
		public void run() {
			// TODO Auto-generated method stub
		for(int i=0;i<10;i++)   {                                                     
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Thread Running"+"   "+i+"   "+Thread.currentThread().getName());
		}
		}
	}


