class Delta
{
	int a=20;
	int b=40;
	void test()
	{
		System.out.println("executingtest()");
	}
	void play()
	{
		System.out.println("executingplay()");
	}
}
public class Mainclass4
{
	public static void main(String[] args)
	{
		System.out.println(new Delta().a);
		System.out.println(new Delta().b);
		new Delta().test();
		new Delta().play();
	}
}