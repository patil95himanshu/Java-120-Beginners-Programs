package StaticVariable;
/**
* @author -- Himanshu Patil
*/
public class Employee {
	
	int Reg_No;
	String Name;
	static String Company = "CDAC HYDERABAD";
	
	Employee(int a, String b)
	{
		Reg_No = a;
		Name = b;
	}
	
	void display()
	{
		System.out.println("Your details are: " + Reg_No + " " + Name + " " + Company);
	}
	
	public static void main(String args [])
	{
		Employee em = new Employee(101, "Himanshu");
		em.display();
	}
	

}
