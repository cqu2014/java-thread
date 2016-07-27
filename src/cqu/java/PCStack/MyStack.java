package cqu.java.PCStack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private List list = new ArrayList();
	
	synchronized public void push(){
		try {
			if (list.size() == 1) {
				this.wait();
			}
			list.add("anything = "+Math.random());
			this.notify();
			System.out.println("push = "+list.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized public String pop(){
		String returnValue = "";
		try {
			if (list.size() == 0) {
				System.out.println("pop operator: "+Thread.currentThread().getName()+"WAITING....");
				this.wait();
			}
			returnValue = ""+list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("pop = " + list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnValue;
		
	}
}
