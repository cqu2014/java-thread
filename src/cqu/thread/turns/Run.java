package cqu.thread.turns;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		new Run().begin();
	}
	
	public void begin() throws InterruptedException {
		MyOneList list = new MyOneList();
		MyThreadA threadA = new MyThreadA(list);
		threadA.setName("A");
		threadA.start();
		
		MyThreadB threadB = new MyThreadB(list);
		threadB.setName("B");
		threadB.start();
		
		Thread.sleep(6000);
		
		System.out.println("listSize = "+list.getSize());
	}

	class MyThreadA extends Thread{
		private MyOneList list;

		public MyThreadA(MyOneList list) {
			super();
			this.list = list;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			MyService myService = new MyService();
			myService.addList(list, "A");
		}
	}
	
	class MyThreadB extends Thread{
		private MyOneList list;

		public MyThreadB(MyOneList list) {
			super();
			this.list = list;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			MyService myService = new MyService();
			myService.addList(list, "B");
		}
	}
}
