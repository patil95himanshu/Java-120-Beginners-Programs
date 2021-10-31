package NegativePositive;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Number {
	
	public static void main(String args [])
	{
		int x;
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		if(x<0)
		{
			System.out.println("This is a negative number");
		}
		else
			System.out.println("This is a positive number");
	}

}
