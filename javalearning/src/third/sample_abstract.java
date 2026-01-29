package third;
// abstract class
abstract class office{
	// abstract method
	public abstract void job();
}
//employee child class extends the abstract office parent class
class employee extends office{
	public void job() { // regular method
		System.out.println("employee working on project");//printing statemet
	}
}
//security child class extends the abstract office parent class
class security extends office{
	public void job() {// regular method
		System.out.println("security checks the items");//printing statemet
	}
}
//worker child class extends the abstract office parent class
class worker extends office{
	public void job() {// regular method
		System.out.println("worker is cleaning the office");//printing statemet
	}
}

public class sample_abstract { // main class
	public static void main(String[] args) {// main method
		office obj1= new employee();// cretaing object for employee which extends the abstract office class
		obj1.job();//printing obj1
		office obj2 = new security();// cretaing object for security which extends the abstract office class
		obj2.job();//printing obj2
		office obj3 = new worker();// cretaing object for worker which extends the abstract office class
		obj3.job();//printing obj3
	}

}
