package cqu.javaThread;

public class TestShare {

	public static void main(String[] args) {
		new TestShare().begin();
	}
	
	public void begin() {
		MyThread myThread = new MyThread();
		new Thread(myThread,"mt1").start();
		new Thread(myThread,"mt2").start();
	}
	
	class MyThread implements Runnable{
		private int index = 0;
		
		@Override
		public void run() {
			count();
		}
		
		public void count() {
			for(int i = 0;i<10;i++){
				int temp = index+1;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				index = temp;
				System.out.println(Thread.currentThread().getName()+"=>"+index);
			}
		}
	}

}
