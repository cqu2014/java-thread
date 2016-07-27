package cqu.java.gaohongyan;

public class RunnableThread implements Runnable {
	private int count = 5;
	
	@Override
	public void run() {
		while(count > 0){
			count--;
			System.out.println(Thread.currentThread().getName()+"=>"+count);
		}
	}

}
