package cqu.thread.chapter2;

public class IsAlive {

	public static void main(String[] args) {
		new IsAlive().begin();
	}
	
	public void begin() {
		
		MyThread myThread = new MyThread();
		System.out.println("begin == " + myThread.isAlive());
		myThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"===>" +Thread.currentThread().isAlive());
		
		System.out.println("end ==" + myThread.isAlive());
	}
	
	class MyThread extends Thread{
		@Override
		public void run() {
			super.run();
			System.out.println("run = " + this.isAlive());
		}
	}

}
