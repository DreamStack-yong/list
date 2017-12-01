package itbegin;

public class a11 {
	int count = 0;
	String name = "initial value";

	a11(int petals) {
		count = petals;
		print("初始化花的花瓣数量:" + petals);
	}

	a11(String name) {
		print("初始化花的名称:" + name);
		this.name = name; // 这里用this是为了区分name
	}

	a11(String name, int petals) {
		this(petals);
		// this(name);//这里不能调用第二次
		this.name = name;
	}

	a11() {
		this("玫瑰花", 46);
	}

	public void printFlower() {
		// this(11);普通方法里不能调用构造方法。
		print(name + "花瓣数量:" + count);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		a11 f = new a11();
		f.printFlower();
	}
}
