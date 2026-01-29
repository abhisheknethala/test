package third;

interface printing{// creating intrerface class
	void print();// abstract method print
	default void print1() {// default method
		System.out.println("abhi");// printing statement for method print1
	}
}

public class sample_interface implements printing {// sample interface class extends& implements the interface printing
	public void print() {// calling abstract method and intialising the value to abstract method
		System.out.println("nethala");// printing statement for the abstract method print
	}
	public static void main(String[] args) {// main method
		sample_interface obj = new sample_interface();// creating object 
		obj.print1();// printing default method
		//printing obj2 = new printing();
		obj.print();// printing abstract method
	}

}
