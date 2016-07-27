package cqu.thread.chapter2;

public class InnerParamSafeService {
	//实例变量非线程安全
	int num;
	public void addI(String name) {
		try {
			// int num = 0; 局部变量线程安全
			if (name.equals("a")) {
			 num = 100;
			 System.out.println("a sets over");
				Thread.sleep(200);
			}else {
				num = 200;
				System.out.println("b sets over");
			}
			System.out.println(name+"  num="+num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
