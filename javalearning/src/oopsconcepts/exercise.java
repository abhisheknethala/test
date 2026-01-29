package oopsconcepts;

class person{
	String name;
	public person(String name) {
		this.name=name;
	}
	//public void pname(){
	//	System.out.println(name);
	//}
}
class employee extends person{
	double annualsal;
	int startyear;
	String nationalins;
	public employee(String name,double annualsal,int startyear,String nationalins) {
		super(name);
		//this.name=name;
		this.annualsal=annualsal;
		this.startyear=startyear;
		this.nationalins=nationalins;
	}
	public void print() {
		System.out.println("the employee " + name + "annaual salary is" + annualsal  + "startyear is" + startyear +" the insusurance num is" + nationalins);
		
	}
}


public class exercise {
	public static void main(String[] args) {
		employee obj=new employee("abhi",1000,2025,"nis123");
		obj.print();
	//	obj.name="abhi";
	//	obj.annualsal=1000;
	}

}
