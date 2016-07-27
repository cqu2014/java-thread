package cqu.java.game;

public class StopThread {

	public static void main(String[] args) {
		new StopThread().begin();
	}
	
	public void begin() {
		MyThread myThread = new MyThread();
		Thread mt = new Thread(myThread,"I am Runnable");
		mt.start();		
	}
	
	class MyThread implements Runnable{
		private int index = 0;
		private boolean flag = true;
		
		@Override
		public void run() {
			for(;index<2000;index++){
				if(index == 999) stopThread();
				if(!flag) break;
				System.out.println(Thread.currentThread().getName()+"=>"+index);
			}
		}
		
		public void stopThread() {
			System.out.println("此处进行资源回收工作");
			flag = false; 
		}
	}
}
