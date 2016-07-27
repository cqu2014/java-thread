package cqu.thread.chapter2;

public class ThreadInThread {

	public static void main(String[] args) {
		System.out.println("The id of CurrentThread: "+Thread.currentThread().getId());
		// TODO Auto-generated method stub
		new ThreadInThread().begin();
	}
	
	public void begin() {
		System.out.println("The id of CurrentThread: "+Thread.currentThread().getId());
		Current current = new Current();
		// Thread thread = new Thread(current);
		current.setName("AA"); //只是给线程设置一个别名，this只是的系统默认的ID不变
		current.start();
		
	}
	
	class Current extends Thread{
		
		public Current() {
			System.out.println("current----begin");
			System.out.println("Thread.currentThread().getName() =  "+Thread.currentThread().getName());
			System.out.println("Thread.currentThread().isAlive() =  "+Thread.currentThread().isAlive());
			System.out.println("this.getName() = "+this.getName());
			System.out.println("this.isAlive() = "+this.isAlive());
			System.out.println("current----end");
		}
		
		@Override
		public void run() {
			System.out.println("run----begin");
			System.out.println("Thread.currentThread().getName() =  "+Thread.currentThread().getName());
			System.out.println("Thread.currentThread().isAlive() =  "+Thread.currentThread().isAlive());
			System.out.println("this.getName() = "+this.getName());
			System.out.println("this.isAlive() = "+this.isAlive());
			System.out.println("run----end");
			System.out.println("The id of CurrentThread: "+Thread.currentThread().getId());
		}
	}

}
