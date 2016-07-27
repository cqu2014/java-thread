package cqu.thread.syncLock;

public class MyObject {
	 public synchronized void methodA(){
		try {
			System.out.println("Begin methodA threadName="+Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end endTime=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	 public /*synchronized*/ void menthodB() {
		 try {
				System.out.println("Begin methodB threadName="+Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("end");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
