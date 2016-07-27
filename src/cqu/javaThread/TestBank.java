package cqu.javaThread;

public class TestBank {

	public static void main(String[] args) {
		new  TestBank().begin();
	}
	
	public void begin() {
		Family mFamily = new Family();
		new Thread(mFamily,"丈夫").start();
		new Thread(mFamily,"妻子").start();
	
	}
	
	class Family implements Runnable{
		private int getMoney;
		private int savaMoney;
		private int homeMoney;
		
		public Family() {
			// TODO Auto-generated constructor stub
			this.getMoney = 2000;
			this.savaMoney = 5000;
			this.homeMoney = 0;
		}
		
		@Override
		public void run() {
			getMoney();
			show();
		}
		
		public  void getMoney() {
			
			synchronized (this) {
				System.out.println(Thread.currentThread().getName()+"取了："+getMoney+"元");
				homeMoney +=2000;
				int temp = savaMoney - getMoney;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				savaMoney = temp;
			}
		}
		
		public void show() {
			System.out.println("银行还剩有"+savaMoney+"元"+" , 家里还有还剩有"+homeMoney+"元");
		}
		
	}

}
