package cqu.thread.turns;

public class StringPool {

	public static void main(String[] args) {
		String aString = "a";
		String bString = "a";
		
		String cString = aString+1;
		String dString = "a1";
		
		System.out.println(aString == bString);
		System.out.println(cString == dString);
	}

}
