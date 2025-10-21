class Mobile
{
	String model;
	double price;
	void call()
	{
		System.out.println("calling");
	}
	void selfie()
	{
		System.out.println("selfie");
	}
}
public class Mainclass13
{
	public static void main(String[] args)
	{
		Mobile m1=new Mobile();
		m1.model="iphone";
		m1.price=1.5;
		m1.call();
		m1.selfie();
		System.out.println("----------------------");
		Mobile m2=new Mobile();
		m2.model="samsung";
		m2.price=1.8;
		m2.call();
		m2.selfie();
	}
}