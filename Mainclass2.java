class Sample
{
	static int x=25;
	static double y=4.5;
	static void help()
	{
		System.out.println("executinghelp()");
	}
	static void send()
	{
		System.out.println("executingsend()");
	}
}
public class Mainclass2
{
	public static void main(String[] args)
{
	System.out.println(Sample.x);
	System.out.println(Sample.y);
	Sample.help();
	Sample.send();
	
}
}