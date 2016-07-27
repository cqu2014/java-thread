package cqu.java.gaohongyan;

public class Test {

	public static void main(String[] args) {
		/*RunnableThread runnableThread = new RunnableThread();
		new Thread(runnableThread,"A1").start();
		new Thread(runnableThread,"B1").start();
		new Thread(runnableThread,"C1").start();*/
		MyThread1 myThread1 = new MyThread1();
		new Thread(myThread1,"M1").start();
		new Thread(myThread1,"M2").start();
		new Thread(myThread1,"M3").start();
		new Thread(myThread1,"M4").start();
		new Thread(myThread1,"M5").start();
		new Thread(myThread1,"M6").start();
	}

}
