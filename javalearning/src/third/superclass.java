package third;

/*public class animal{
	public void printmethod() {
		System.out.println("this is super class");
	}
}*/
public class superclass extends animal{
	public void printmethod() {
		super.printmethod();
		System.out.println("this is sub class");
	}

public static void main(String[] args) {
	//animal obj1 = new animal();
	superclass obj=new superclass();
	//obj1.printmethod();
	obj.printmethod();
}
}



