package cqu.java.gaohongyan;

public class MyThread extends Thread {
	private int count = 5;
	
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		super.run();
		while(count > 0){
			count--;
			System.out.println(Thread.currentThread().getName()+"=>"+count);
		}
	}
}
