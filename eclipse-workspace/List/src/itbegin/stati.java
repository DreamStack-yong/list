package itbegin;

public class stati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Dog.name);
		Dog D1=new Dog();
		D1.name="D1";
		System.out.println(D1.name);
		Dog D2=new Dog();
		Dog D3=new Dog();
		
	}

}
class Dog{
	static  String name="金毛";
//	static final String name="金毛";
	static {
		name="黄毛";
	}
	 void f(){
		    int i=0 ;
		    //int i = 1;
		    i++;//变量i没有初始化。
		  }
}