package cqu.java.chapter3.Size5;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private static List list = new ArrayList<>();
	
	@SuppressWarnings("unchecked")
	public static void add() {
		list.add("anything");
	}
	
	public static int size() {
		return list.size();
	}
}
