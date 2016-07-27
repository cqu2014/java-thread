package cqu.java.PCStack;

public class Run {
	public static void main(String[] args) {
		new Run().begin();
	}
	
	public void begin() {
		MyStack myStack  = new MyStack();
		
		P p = new P(myStack);
		C c = new C(myStack);
		
		ThreadA aThreadA = new ThreadA(p);
		ThreadB bThreadB = new ThreadB(c);
		
		aThreadA.start();
		bThreadB.start();
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
				p.pushService();
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
				c.popService();
			}
		}
	}
}
