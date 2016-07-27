package cqu.thread.chapter2;

public class LoginServlet {
	private static String username;
	private static String password;
	
	/*synchronized*/ public  static void doPost(String uString,String pString) {
		try {
			username = uString;
			if (username.equals("a")) {
				Thread.sleep(500);
			}
			password = pString;
			System.out.println("username= "+username+" password = "+password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
