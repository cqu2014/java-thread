package cqu.java.multiPC;

public class Run {
	public static void main(String[] args) {
		new Run().begin();
	}
	
	public void begin() {
		String lock = new String("");
		
		P p = new P(lock);
		C c = new C(lock);
		
		ThreadA[] aThread = new ThreadA[2];
		ThreadB[] bThread = new ThreadB[2];
		
		for(int i =0;i<2;i++){
			aThread[i] = new ThreadA(p);
			aThread[i].setName("Maker "+(i+1));
			bThread[i] = new ThreadB(c);
			bThread[i].setName("CUSTOMER "+(i+1));
			
			aThread[i].start();
			bThread[i].start();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for(int i=0;i<threadArray.length;i++){
			System.out.println(threadArray[i].getName()+" "+threadArray[i].getState());
		}
	}
	
	class ThreadA extends Thread{
		private P p;

		public ThreadA(P p) {
			super();
			this.p = p;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			while(true){
				p.setValue();
			}
		}
	}
	
	class ThreadB extends Thread{
		private C c;

		public ThreadB(C c) {
			super();
			this.c = c;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			
			while(true){
				c.getValue();
			}
		}
	}
}
