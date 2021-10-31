package Palindrome;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Number {

	public static void main(String[] args) {
		
		int w, x, y = 0, z = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to check Palindrome: ");
		z = sc.nextInt();
		w = z;
		
		while(z > 0)
		{
			x = z%10;
			y = (y*10)+x;
			z = z/10;
		}
		
		if(w == y)
		{
			System.out.println("This number is a Palindrome");
		}
		else
		{
			System.out.println("This is not a Palindrome");
		}	
	}

}
