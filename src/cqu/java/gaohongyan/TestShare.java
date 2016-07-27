package cqu.java.gaohongyan;

public class TestShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		c.start();
		b.start();
	
		
	}

}
