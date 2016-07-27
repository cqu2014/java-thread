package cqu.javaThread;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DeadLock().begin();
	}
	
	public void begin() {
		MyThread mt = new MyThread();
		new Thread(mt,"mt1").start();
		new Thread(mt,"mt2").start();
		
	}
	
	
	class MyThread implements Runnable{
		private Object k1 = new Object();
		private Object k2 = new Object();
		private Boolean flag1 = true;
		//private Boolean flag2 = true;
		
		@Override
		public void run() {
			if (flag1) {
				flag1 = false;
				synchronized (k1) {
					System.out.println(Thread.currentThread().getName()+"=>k1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (k2) {
						System.out.println(Thread.currentThread().getName()+"=>k2");
					}
				}
			}else {
				
			}
		}
		
	}

}
