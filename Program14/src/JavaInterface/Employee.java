package JavaInterface;
import java.io.*;
/**
* @author -- Himanshu Patil
*/
public class Employee {
	
	int Reg_No, Rt1, Rt2, Rt3;
	String Name;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void GetInput() throws Exception
	{
		System.out.println("Please enter Employee details: Reg_No, Name, Skill Levels of C, C++, Java");
		Reg_No = Integer.parseInt(br.readLine());
		Name = br.readLine();
		Rt1 = Integer.parseInt(br.readLine());
		Rt2 = Integer.parseInt(br.readLine());
		Rt3 = Integer.parseInt(br.readLine());
	}
	
	void display()
	{
		System.out.println("Your Reg_No is: " + Reg_No);
		System.out.println("Your Name is: " + Name);
		System.out.println("Your C is: " + Rt1);
		System.out.println("Your C++ is: " + Rt2);
		System.out.println("Your Java is: " + Rt3);
	}
	
}
	
	class Output extends Employee
	{
		int Total;
		float Average;
		
		void evaluate() throws Exception
		{
			GetInput();
			Total = Rt1+Rt2+Rt3;
			Average = (float)Total/3;
		}
	
		void screenshow()
		{
			System.out.println("Overall Rating is: " + Total);
			System.out.println("Your percentage is: " + Average);
		}
	
	}
	
	class Company
	{
		public static void main(String args []) throws Exception
		{
			Output ot = new Output();
			ot.evaluate();
			ot.screenshow();
		}
	}


