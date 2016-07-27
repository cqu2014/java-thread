package cqu.thread.chapter2;

public class InnerParamSafeRun {

	public static void main(String[] args) {
		/*InnerParamSafeService safeService = new InnerParamSafeService();
		InnerParamSafeThread aInnerParamSafeThread = new InnerParamSafeThread(safeService);
		aInnerParamSafeThread.start();
		InnerParamSafeThreadb threadb = new InnerParamSafeThreadb(safeService);
		threadb.start();*/
		
		//多个对象多个锁是达不到synchronized效果的，对象锁不一样
		InnerParamSafeService safeService = new InnerParamSafeService();
		InnerParamSafeService	safeService2 = new InnerParamSafeService();
		InnerParamSafeThread aInnerParamSafeThread = new InnerParamSafeThread(safeService);
		aInnerParamSafeThread.start();
		InnerParamSafeThreadb threadb = new InnerParamSafeThreadb(safeService2);
		threadb.start();
	}

}
