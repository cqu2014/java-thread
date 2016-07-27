package cqu.thread.extend;

public class Main {
	public int i = 10;
	
	public synchronized void operateIMain() {
		try {
			i--;
			System.out.println("main print i = "+i);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
