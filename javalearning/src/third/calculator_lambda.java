package third;
interface IntegerMath{
	int operation(int a,int b);
}

public class calculator_lambda {
	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}
	public static void main(String[] args) {
		calculator_lambda my = new calculator_lambda();
		IntegerMath addition = (a,b) -> a+b;
		IntegerMath subtraction = (a,b) -> a-b;
		System.out.println("40 + 2 =  " + my.operateBinary(40, 2, addition) );
		System.out.println("20 - 5=  " + my.operateBinary(20, 5, subtraction));
		
	}
}
