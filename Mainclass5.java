class Example
{
	int num=20;
	double val=6.7;
	void disp()
	{
		System.out.println("executingdisp()");
	}
	void send()
	{
		System.out.println("executingsend()");
	}
}
public class Mainclass5
{
	public static void main(String[] args)
	{
		Example ex=new Example();
		System.out.println(ex.num);
		System.out.println(ex.val);
		ex.disp();
		ex.send();
	}
}