package cqu.javaThread;

public class ThreadWithRunnable {

	public static void main(String[] args) {
		new ThreadWithRunnable().begin();
	}
	
	public  void begin() {
		MyThread mThread = new MyThread();
		Thread thread = new Thread(mThread);
	
		
		for(int i = 0;i<10;i++){
			System.out.println("Main:"+i);
		}
		
		thread.start();
	}
	
	//此内部类相当于一个非Static的方法，所以在static方法main中无法直接调用
	
	class MyThread implements Runnable{
		
		@Override
		public void run() {
			for(int i = 0;i<10;i++){
				System.out.println("MyThread:"+i);
			}
		}
	}

}
