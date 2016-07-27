package cqu.java.game;

public class ThreadWithThread {

	public static void main(String[] args) {
		new ThreadWithThread().begin();
	}
	
	public void begin() {
		MyThread myThread1 = new MyThread("FirstOne");
		MyThread myThread2 = new  MyThread("SecondOne");
		
		myThread1.start();
		myThread2.start();
	}
	
	class MyThread extends Thread{
		private int index = 0;
		
		public MyThread(String name) {
			super(name);
		}
		
		@Override
		public void run() {
			for(;index<100;index++){
				System.out.println(this.getName()+"=>"+index);
			}
		}
	}

}
