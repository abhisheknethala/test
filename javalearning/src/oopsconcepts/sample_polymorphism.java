package oopsconcepts;
abstract class animal{
	//String s;
	public abstract void shout(); //{
		//System.out.println("the animal is shouting");
	//}	
}
class dog extends animal{
	public void shout() {
		System.out.println( " dog bow bow");
	}
}
class cat extends animal{
	public void shout() {
		System.out.println(" cat meow meow");
	}
}

public class sample_polymorphism {

	public static void main(String[] args) {
		//animal obj=new animal();
		animal obj1= new dog();
		animal obj2 = new cat();
		//obj.shout();
		//obj1.s= "dog shouting";
		obj1.shout();
	//	obj2.s=" cat shouting";
		obj2.shout();
	

	}

}
