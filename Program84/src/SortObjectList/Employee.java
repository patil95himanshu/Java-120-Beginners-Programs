package SortObjectList;
import java.util.*;

/**
* @author -- Himanshu Patil
*/
public class Employee implements Comparable<Employee> {
	
	private String name;
	private String occupation;
	private int salary;
	
	public Employee(String firstname, String job, int value)
	{
		super();
		this.name = firstname;
		this.occupation = job;
		this.salary = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String  getOccupation() {
		return occupation;
	}
	
	public void setoccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Name of employee is: " + name + " Occupation is: " + occupation + " Salary is: " + salary;
	}
	
	@Override
	public int compareTo(Employee comparemydata) {
		
		int compareValue = ((Employee)comparemydata).getSalary();
		
		return this.salary - compareValue;
		
	}
	
	public static void main(String args [])
	{
		Employee employee1 = new Employee("Hello", "Programmer",1000);
		Employee employee2 = new Employee("Jude", "Doctor",4000);
		Employee employee3 = new Employee("Joseph", "Lawyer",500);
		Employee employee4 = new Employee("Vivian", "Nurse",7000);
		Employee employee5 = new Employee("Juliet", "Chef",10000);
		Employee employee6 = new Employee("Mark", "Cricketer",70000);
		
		List<Employee> employee = new ArrayList();
		
		employee.add(employee1);
		employee.add(employee2);
		employee.add(employee3);
		employee.add(employee4);
		employee.add(employee5);
		employee.add(employee6);
		
		System.out.println("Objects before sorting: ");
		for(Employee emp1:employee)
		{
			System.out.println(emp1);
		}
		
		System.out.println("\n");
		
		Collections.sort(employee);
		
		System.out.println("Objects after sorting: ");
		for(Employee emp1:employee)
		{
			System.out.println(emp1);
		}
	
	}

}
