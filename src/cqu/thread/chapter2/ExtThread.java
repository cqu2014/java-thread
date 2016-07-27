package cqu.thread.chapter2;

public class ExtThread {

	public static void main(String[] args) {
		//两个线程都访问LoginServlet的Static成员变量
		new ExtThread().begin();
	}
	
	public void begin() {
		ALogin aLogin = new ALogin();
		aLogin.start();
		BLogin bLogin = new BLogin();
		bLogin.start();
	}
	
	public class ALogin extends Thread{
		@Override
		public void run() {
			LoginServlet.doPost("a", "aa");
		}
	}
	
	public class BLogin extends Thread{
		@Override
		public void run() {
			LoginServlet.doPost("b", "bb");
		}
	}

}
