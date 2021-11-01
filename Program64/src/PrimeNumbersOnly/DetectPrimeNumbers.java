package PrimeNumbersOnly;

import java.util.*;

/**
* @author -- Himanshu Patil
*/
public class DetectPrimeNumbers {
	
	public static void main(String args [])
	{
		int num1, x, count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num1 = sc.nextInt();
		
		for(x=2; x<num1; x++)
		{
			if(num1%x == 0)
			{
				count++;
				break;
			}
		}
		if(count == 0)
		{
			System.out.println(num1 + " is a Prime Number");
		}
		else
		{
			System.out.println(num1 + " is not a Prime Number");
		}
	}

}
