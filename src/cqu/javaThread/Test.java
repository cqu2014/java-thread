package cqu.javaThread;

public class Test {
	public static void main(String[] args) {
		Thread02 mtThread02 = new Thread02("First");
		Thread thread = new Thread(mtThread02);
		
		Thread02 mtThread03 = new Thread02("Second");
		Thread thread01 = new Thread(mtThread03);
		
		thread.start();
		thread01.start();
		
		for(int i = 0;i<10;i++){
			System.out.println("Main:"+i);
		}
		
		
	}
}
