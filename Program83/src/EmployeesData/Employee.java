 package EmployeesData;

import java.util.ArrayList;
import java.util.List;

/**
* @author -- Himanshu Patil
*/
public class Employee {
	
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
	
	public String getOccupation() {
		return occupation;
	}
	
	public void setOccupation(String occupation) {
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
		return "Name is: " + name + " \nOccupation is: " + occupation + " \nSalary is: " + salary;
	}
	
	public static void main(String args [])
	{
		Employee employee1 = new Employee("Hello", "Programmer",1000);
		Employee employee2 = new Employee("Jude", "Doctor",4000);
		Employee employee3 = new Employee("Joseph", "Lawyer",500);
		Employee employee4 = new Employee("Vivian", "Nurse",7000);
		Employee employee5 = new Employee("Juliet", "Chef",10000);
		Employee employee6 = new Employee("Mark", "Cricketer",70000);
		
		List<Employee> employeelist = new ArrayList();
		employeelist.add(employee1);
		employeelist.add(employee2);
		employeelist.add(employee3);
		employeelist.add(employee4);
		employeelist.add(employee5);
		employeelist.add(employee6);
		
		System.out.println("The Employee data is below \n");
		for(Employee employee:employeelist)
		{
			System.out.println(employee);
		}
		
	}

}
