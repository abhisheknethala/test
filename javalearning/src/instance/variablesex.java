package instance;
public class variablesex{
	public static String bankname="sbi";// static variable
	public String accountholder;
	public double balance;
	public void withdraw(double amount) {
		double transactionfees= 2.0;
		if(balance>=(amount+transactionfees)) {
			balance =balance-amount-transactionfees;
			System.out.println(amount + "withdraw sucessful for" + accountholder + "with transactionfees"+ transactionfees +"in" + bankname + "and remaining balance is" + balance);
		}
	}
//}

//public class variablesex {
	public static void main(String[] args) {
		variablesex acc1 = new variablesex();
		acc1.accountholder="abhi";
		acc1.balance=500;
		acc1.withdraw(100);
		
		variablesex acc2 = new variablesex();
		acc2.accountholder= "roy";
		acc2.balance= 2000;
		acc2.withdraw(500);
	}

}

