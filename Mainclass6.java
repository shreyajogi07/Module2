class Beta
{
	char ch='a';
	boolean bool=true;
	void disp()
	{
		System.out.println("executingdisp()");
	}
	void send()
	{
		System.out.println("executingsend()");
	}
}
public class Mainclass6
{
	public static void main(String[] args)
	{
		Beta b=new Beta();
		System.out.println(b.ch);
		System.out.println(b.bool);
		b.disp();
		b.send();
	}
}