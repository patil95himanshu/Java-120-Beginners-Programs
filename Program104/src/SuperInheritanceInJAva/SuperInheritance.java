package SuperInheritanceInJAva;
/**
* @author -- Himanshu Patil
*/

class student {
	
	String firstname;
	String lastname;
	
	student(String fname, String lname)
	{
		firstname = fname;
		lastname = lname;
	}
}

class school extends student {
	
	int grade;
	String subject;
	
	school(String fname, String lname, int score, String sub)
	{
		super(fname,lname);
		grade = score;
		subject = sub;
	}
}
public class SuperInheritance {
	
	public static void main(String args[])
	{
		school sch = new school("Tommy","Shelby",98,"Java");
		
		System.out.println("Student's firstname is: " + sch.firstname);
		System.out.println("Student's lastname is: " + sch.lastname);
		System.out.println("Student's grade is: " + sch.grade);
		System.out.println("Student's subject is: " + sch.subject);
	}

}
