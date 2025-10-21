class Alpha
{
	static char ch='a';
	static int b=40;
	static void disp()
	{
		System.out.println("executingdisp()");
	}
	static void push()
	{
		System.out.println("executingpush()");
	}
}
public class Mainclass3
{
	public static void main(String[] args)
	{
		System.out.println(Alpha.ch);
		System.out.println(Alpha.b);
		Alpha.disp();
		Alpha.push();
	}
}