package cqu.java.game;

public class ThreadWithRunnable {

	public static void main(String[] args) {
		new ThreadWithRunnable().begin();
	}
	
	public void begin() {
		MyThread myThread1 = new MyThread();
		
		 new Thread(myThread1,"FirstOne").start();
		 new Thread(myThread1,"SecondOne").start();
		
	}
	
	
	class MyThread implements Runnable{
		private int index = 0;
		
		@Override
		public void run() {
			for(;index<100;index++){
				System.out.println("---------->"+index);
			}
		}
	}

}
