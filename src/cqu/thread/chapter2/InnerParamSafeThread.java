package cqu.thread.chapter2;

public class InnerParamSafeThread extends Thread{
	private InnerParamSafeService service;

	public InnerParamSafeThread(InnerParamSafeService service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		service.addI("a");
	}
}
