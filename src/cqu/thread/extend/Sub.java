package cqu.thread.extend;

public class Sub extends Main {
	public synchronized void operateISub() {
		try {
			while(i>0){
				i--;
				System.out.println("Sub print i = "+i);
				Thread.sleep(100);
				this.operateIMain();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
