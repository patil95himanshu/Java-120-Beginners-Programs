package ArithmeticMean;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Mean {
	public static void main(String args [])
	{
		int x, y, add=0, meannum;
		int num1[] = new int[50];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		x = sc.nextInt();
		
		System.out.println("Enter only " + x + " numbers");
		for(y=0; y<x; y++)
		{
			num1[y] = sc.nextInt();
			add = add + num1[y];
		}
		meannum = add/x;
		
		System.out.println("Result of Arithmetic Mean is: " + meannum);
	}

}
