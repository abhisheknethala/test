package instance;

public class iv {
String name;
	int age;
	void case1() {
		name = "abhi";
		age = 20;
		System.out.println(name + "age is" + age);
	}
	void case2() {
		name = "madhu";
		age =18;
		System.out.println(name + "age is" + age);
	}
	public static void main(String[] args) {
		iv obj = new iv();
		obj.case1();
		obj.case2();
	}

}
