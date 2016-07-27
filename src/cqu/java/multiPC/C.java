package cqu.java.multiPC;

public class C {
	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue() {
		try {
			synchronized (lock) {
				while(ValueObject.value.equals("")){
					System.out.println("CUSTOMER "+Thread.currentThread().getName()+"##WAITING A##");
					lock.wait();
				}
				System.out.println("CUSTOMER "+Thread.currentThread().getName()+"##WAITING A##");
				ValueObject.value = "";
				//lock.notify();
				lock.notifyAll();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
