package ConstructorInheritance;
/**
* @author -- Himanshu Patil
*/
class student {
	
	student()
	{
		System.out.println("This is First Student Constructor");
	}
}

class school extends student {
	
	school()
	{
		System.out.println("This is Second Student Constructor");
	}
}

class studentschool extends school {
	
	studentschool()
	{
		System.out.println("This is Third Student Constructor");
	}
}

public class ConsInheritance {
	
	public static void main(String args[])
	{
		studentschool ss = new studentschool();
	}

}
