package oopsconcepts;

	class inheritance1 extends Employee{
		int bonus=10000;
		public static void main(String[] args) {
			inheritance1 p = new inheritance1();
			System.out.println("Programmer salary is :" + p.salary);
			System.out.println("programmer bonus is :"  + p.bonus);
		}
	}
