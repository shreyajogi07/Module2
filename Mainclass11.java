class Student
{
	String name;
	double cgpa;
	void write()
	{
		System.out.println(name+"is writing");
	}
	void listen()
	{
		System.out.println(name+"is listening");
	}
}
public class Mainclass11
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.name="jade";
		s1.cgpa=8.5;
		s1.write();
		s1.listen();
		System.out.println("------------------------");
		Student s2=new Student();
		s2.name="blake";
		s2.cgpa=8.9;
		s2.write();
		s2.listen();
	}
}