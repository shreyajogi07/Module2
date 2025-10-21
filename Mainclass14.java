class Bike
{
	int cc;
	double milage;
	void drive()
	{
		System.out.println("drive");
	}
	void clean()
	{
		System.out.println("clean");
	}
}
public class Mainclass14
{
	public static void main(String[] args)
	{
		Bike b1=new Bike();
		b1.cc=500;
		b1.milage=15.0;
		b1.drive();
		b1.clean();
		System.out.println("----------------------");
		Bike b2=new Bike();
		b2.cc=500;
		b2.milage=15.0;
		b2.drive();
		b2.clean();
	}
}