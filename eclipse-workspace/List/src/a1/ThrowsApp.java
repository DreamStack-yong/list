package a1;

public class ThrowsApp {
	public static void f() throws Exception {
		throw new Exception();// 抛出异常
	}

	public static void main(String[] args) {
		// f();//直接调用会有错误
		try {
			ThrowsApp throwsApp=new ThrowsApp();
			throwsApp.f();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}