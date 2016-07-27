package cqu.thread.chapter2;

public class Sleep {

	public static void main(String[] args) {
		new Sleep().begin();
	}
	
	public void begin() {
		MyThread myThread = new MyThread();
		System.out.println("begin = "+System.currentTimeMillis());
		myThread.start();
		System.out.println("end = "+System.currentTimeMillis());
		
	}
	
	class MyThread extends Thread{
		@Override
		public void run() {
			try {
				System.out.println("run threadName = "+ Thread.currentThread().getName()+" begin ="+System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("run threadName = "+ Thread.currentThread().getName()+" end ="+System.currentTimeMillis());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
