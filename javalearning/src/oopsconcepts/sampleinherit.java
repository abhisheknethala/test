package oopsconcepts;

import java.util.Scanner;

class work{
	String name;
	int id;
}
class associate extends work{
	String lang;
	void display() {
		System.out.println("employee details");
		System.out.println("emp id" + id);
		System.out.println("emp name" + name);
		System.out.println("prg language"+ lang);
	}
}

public class sampleinherit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		associate emp=new associate();
		System.out.println("enter emp id:");
		emp.id=sc.nextInt();
		System.out.println("enter emp name:\n");
		emp.name=sc.nextLine();
		System.out.println("enter emp lang:");
		emp.lang=sc.nextLine();
		
		
		emp.display();
		sc.close();
	}

}
 