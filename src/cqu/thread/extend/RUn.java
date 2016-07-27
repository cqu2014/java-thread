package cqu.thread.extend;

/**
 * @author hadoop
 * 当存在父子关系时，子类是完全可以通过“可重入锁”调用父类的同步方法
 */
public class RUn {
	
	public static void main(String[] args) {
		new RUn().begin();
	}
	
	public void begin() {
		MyThread myThread = new MyThread();
		myThread.start();
		
		/*MyThreadA myThreadA = new MyThreadA();
		myThreadA.start();*/
	}
	
	class MyThread extends Thread{
		@Override
		public void run() {
			super.run();
			Sub sub = new Sub();
			sub.operateISub();
		}
	}
		//synchronize不具有继承性
		class MyThreadA extends Thread{
			@Override
			public void run() {
				super.run();
				Sub sub = new Sub();
				for(int i =0;i<10;i++)
				sub.operateIMain();
			}
	}

}
