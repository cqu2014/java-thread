package cqu.thread.chapter2;

public class InterrException {

	public static void main(String[] args) {
		new InterrException().begin();
	}
	
	public void begin() {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			Thread.sleep(2000);
			myThread.interrupt();
			
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		
		System.out.println("main end");
		
	}
	
	class MyThread extends Thread{
		@Override
		public void run() {
			try {
				for(int i=0;i<500000;i++){
					if (Thread.interrupted()) {
						System.out.println("已经是停止状态了，我要退出 ！");
						//throw new InterruptedException();
						//使用异常当对Thread执行interrupt后，下面的就不会在执行了，break不行
						return;
					}
					System.out.println("i=" + (i+1));
				}
				System.out.println("我在for循环的下面");
			} catch (Exception e) {
				System.out.println("进到MyThread类的catch里了");
				e.printStackTrace();
			}
		}
	}

}
