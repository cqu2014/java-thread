package cqu.thread.chapter2;

public class InnerParamSafeThreadb extends Thread {
	private InnerParamSafeService service;

	public InnerParamSafeThreadb(InnerParamSafeService service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		service.addI("b");
	}
}
