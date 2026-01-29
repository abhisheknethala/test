package oopsconcepts;
class A{
	int a, b;
	void display() {
	System.out.println("variables inside class a is" + a + b);
}}
class B extends A{
	int c;
	void show(){
	System.out.println("variables inside class b is" +a +b +c);
}}
public class num_inher {
	public static void main(String[] args) {
		B obj=new B();
		obj.a = 2;
		obj.b = 3;
		obj.c = 4;
		obj.display();
		obj.show();
		
		
		
	}

}
