package cqu.java.multiPC;

public class P {
	private String lock;
	
	public P(String lock) {
		this.lock = lock;
	}
	
	public void setValue() {
		try {
			synchronized (lock) {
				while(!ValueObject.value.equals("")){
					System.out.println("Maker "+Thread.currentThread().getName()+"**WAITING A**");
					lock.wait();
				}
				System.out.println("Maker "+Thread.currentThread().getName()+"RUNNABLE");
				ValueObject.value = System.currentTimeMillis()+"_"+System.nanoTime();
				//lock.notify();
				lock.notifyAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
