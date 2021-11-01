package PrimeNumbers;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Prime {
	
	public static void main(String args [])
	{
		int x = 0, num1 = 0;
		String pnum = "";
		
		System.out.println("Enter a number to print its Prime Number: ");
		Scanner sc = new Scanner(System.in);
		
		int num2 = sc.nextInt();
		
		for(x=1; x<=num2; x++)
		{
			int primecount = 0;
			for(num1 = x; num1>=1; num1--)
			{
				if(x%num1 == 0)
				{
					primecount = primecount + 1;
				}
			}
			if(primecount == 2)
			{
				System.out.println("Prime number is  " + x);
			}
		}
	}
	
}
