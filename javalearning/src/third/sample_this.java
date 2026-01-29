package third;

public class sample_this {
	// instance variable
	int x=0;
	int y=0;
	// constructor1 and local varaiable
	public sample_this(int x,int y) {
		// intialising value to local variable by this key word
		this.x =x;
		this.y =y;
		//x = x;
		//y = y;
	}
	// constructor2 and another method
	public sample_this() {
		x = 5;
		y = 8;
	}
	// print method for both constructors
	void printmethod() {
		System.out.println("the value of x is" + x + " the value of y is" + y);
	}
	// main method
	public static void main(String[] args) {
		sample_this obj = new sample_this(8,9);// object for constructor1
		sample_this obj1 = new sample_this();// object for constructor 2
		obj.printmethod();// printing constructor1
		obj1.printmethod();// printing constructor2
	}

}
