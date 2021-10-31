package Students;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Grades {
	
	public static void main(String args [])
	{
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		
		x = sc.nextInt();
		if(x>=0 && x<40)
		{
			System.out.println("You are Failed.");
		}
		else if(x>40 && x<70)
		{
			System.out.println("You are Passed");
		}
		else if(x>=70)
		{
			System.out.println("Excellent");
		}
		else if(x<0)
		{
			System.out.println("Only positive numbers are allowed");
		}
		else
		{
			System.out.println("Please insert valid numbers");
		}
	}

}
