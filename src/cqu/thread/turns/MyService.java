package cqu.thread.turns;

/**
 * @author hadoop
 *A和B执行getSize和add是异步交叉执行的，会出现读到脏数据的情况
 *解决===》使用参数作为lock，对参数上锁保证了内部synchronized方法的同步执行
 */
public class MyService {
	/**
	 * @param list
	 * @param data
	 * @return
	 */
	public MyOneList addList(MyOneList list,String data) {
		try {
			synchronized (list) {
				if (list.getSize() <1) {
					Thread.sleep(2000);
					list.add(data);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}
}
