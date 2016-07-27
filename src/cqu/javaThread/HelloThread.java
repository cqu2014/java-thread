package cqu.javaThread;

public class HelloThread {

	public static void main(String[] args) {
		First first = new First("first");
		First second = new First("second");
		
		//调用函数，执行完才可以向下面执行
		first.run();
		
		//启动线程，多线程策略执行
		first.start();
		second.start();
		
		
		
	}

}

class First extends Thread{
	private String name;
	
	public First(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(name+"=>"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
