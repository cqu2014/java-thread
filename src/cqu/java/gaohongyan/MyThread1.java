package cqu.java.gaohongyan;

public class MyThread1 extends Thread {
	private int count = 5;
	
	/*public MyThread1(String name) {
		super(name);
	}*/
	
	@Override
	 public synchronized void run() {
		// TODO Auto-generated method stub
		super.run();
		int temp = count -1;
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count = temp;
		System.out.println(Thread.currentThread().getName()+"=>"+count);
	}
}
