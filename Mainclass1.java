class Demo
{
	static int a=100;
	static int b=200;
	static void test()
	{
		System.out.println("executing...........");
	}
	static void disp()
	{
		System.out.println("executing");
	}
}
public class Mainclass1
{
	public static void main(String[] args)
	{
		System.out.println(Demo.a);
		System.out.println(Demo.b);
		Demo.test();
		Demo.disp();
	}
}