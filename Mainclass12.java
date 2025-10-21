class Employee
{
	int eid;
	double ctc;
	void work()
	{
		System.out.println("is working");
	}
	void meeting()
	{
		System.out.println("attending meeting");
	}
}
public class Mainclass12
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.eid=11;
		e1.ctc=9000;
		e1.work();
		e1.meeting();
		System.out.println("----------------------");
		Employee e2=new Employee();
		e2.eid=12;
		e2.ctc=7000;
		e2.meeting();
		e2.work();
		System.out.println("----------------------");
		Employee e3=new Employee();
		e3.eid=13;
		e3.ctc=8000;
		e3.meeting();
	}
}