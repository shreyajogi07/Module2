class BankAccount
{
	long accNo;
	double accBal;
	void withdraw(double amnt)
	{
		accBal=accBal-amnt;
		System.out.println("withfdraw");
	}
	void deposit(double amnt)
	{
		accBal=accBal-amnt;
		System.out.println("deposit");
	}
}
public class Mainclass16
{
	public static void main(String[] args)
	{
		BankAccount a1=new BankAccount();
		a1.accNo=123456789109L;
		a1.accBal=12000.0;
		a1.withdraw(200.0);
		a1.deposit(1000.0);
		System.out.println("----------------------");
		BankAccount a2=new BankAccount();
		a2.accNo=123456785674829L;
		a2.accBal=15000.0;
		a2.withdraw(2000.0);
		a2.deposit(3000.0);
	}
}