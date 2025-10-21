class Utility
{
	static double a=2.6;
	char ch='g';
	static void play()
	{
		System.out.println("executingplay()");
	}
	void help()
	{
		System.out.println("executinghelp()");
	}
}
public class Mainclass8
{
	public static void main(String[] args)
	{
		System.out.println(Utility.a);
		Utility u=new Utility();
		System.out.println(u.ch);
		Utility.play();
		u.help();
	}
}