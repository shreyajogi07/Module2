class Helper
{
	static int a=20;
	int b=30;
	static void test()
	{
		System.out.println("executingtest()");
	}
	void disp()
	{
		System.out.println("executingdisp()");
	}
}
public class Mainclass7
{
	public static void main(String[] args)
	{
		System.out.println(Helper.a);
		Helper h=new Helper();
		System.out.println(h.b);
		Helper.test();
		h.disp();
	}
}