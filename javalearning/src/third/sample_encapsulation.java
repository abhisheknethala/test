package third;

class A{// creating a class
	private String name;// craeting a private variable
public String getname() {//craeting a method for calling  variable through getname key word
	return name;// returning the name in this method
	}
public void setname(String name) {//craeting a method for assinging  variable through setname key word
	this.name= name;// returning the name which we assigned for variable name
}
}

public class sample_encapsulation {// main class
	public static void main(String[] args) {// main method
		A obj=new A();// creating object foe class A
		obj.setname("abhi");// setting name as abhi through setname method
		//obj.getname();// assigning name abhi for returning the value as abhi through getname method
		System.out.println(obj.getname());//printing the name
	}

}
