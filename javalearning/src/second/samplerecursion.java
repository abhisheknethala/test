package second;

public class samplerecursion {
 public static int factorial(int n) {
	if(n<=1) {
		return 1;
	}
	else {
		return n * factorial(n-1);
	}
	//int n=5;
	//System.out.println("the factorial is " + factorial(5))
}
public static void main(String[] args) {
	int num=5;
	int result = factorial(num);
	System.out.println("the factorial of " + num + "is" + result);
	//samplerecursion obj=new samplerecursion();
	//obj.factorial();
}
}
