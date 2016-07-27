package cqu.thread.chapter2;

public class Interrupt {

	public static void main(String[] args) {
		//new Interrupt().begin();
		new Interrupt().begin1();
	}
	
	
	public void begin1() {
		try {
			Mythread mythread = new Mythread();
			mythread.start();
			Thread.sleep(1000);//把main线程阻塞2秒
			mythread.interrupt();
			System.out.println("是否停止1？"+mythread.isInterrupted());
			System.out.println("是否停止2？"+mythread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		
		System.out.println("end !");
		
	}
	
	public void begin() {
		Mythread mythread = new Mythread();
		mythread.start();
		try {
			Thread.sleep(2000);//把main线程阻塞2秒
			mythread.interrupt();
			System.out.println("是否停止1？"+Thread.interrupted());
			System.out.println("是否停止2？"+Thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		
		System.out.println("end !");
		
	}
	
	class Mythread extends Thread{
		@Override
		public void run() {
			for(int i=0;i < 500;i++){
				System.out.println("i = "+(i+1));
			}
		}
	}

}
