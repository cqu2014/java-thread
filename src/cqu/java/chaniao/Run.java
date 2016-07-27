package cqu.java.chaniao;

public class Run {
	public static void main(String[] args) {
		new Run().begin();
	}
	
	public void begin() {
		String lock = new String("");
		
		P p = new P(lock);
		C c = new C(lock);
		
		ThreadP threadP = new ThreadP(p);
		ThreadB threadB = new ThreadB(c);
		
		threadB.start();
		threadP.start();
		
	}
	
	class ThreadP extends Thread{
		private P p;

		public ThreadP(P p) {
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
		private C r;

		public ThreadB(C r) {
			super();
			this.r = r;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			while(true){
				r.getValue();
			}
		}
	}
}
