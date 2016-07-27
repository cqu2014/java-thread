package cqu.javaThread;

public class TestStatus {

	public static void main(String[] args) {
		new TestStatus().begin();
	}
	
	
	public void begin() {
		MyThread mThread = new MyThread("firstOne");
		Thread thread = new Thread(mThread);
		thread.start();
		/*try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Thread.yield();
		
		MyThread01 mThread01 = new MyThread01("SecondOne");
		mThread01.start();
		
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"=>"+i);
			Thread.yield();
		}
		
	}
	
	class MyThread implements Runnable{
		private String name;
		public MyThread(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			for(int i=0;i<10;i++){
				System.out.println("-------------->"+this.name+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	class MyThread01 extends Thread{
		public MyThread01(String name) {
			super(name);
		}
		
		@Override
		public void run() {
			for(int i=0;i<10;i++){
				System.out.println("-------->"+this.getName()+"-------->"+i);
			}
		}
	}

}
