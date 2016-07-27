package cqu.thread.turns;

import java.util.List;
import java.util.ArrayList;

public class MyOneList {
	private List list = new ArrayList();
	
	public synchronized void add(String data) {
		list.add(data);
	}
	
	public int getSize() {
		return list.size();
	}
	
	
}
