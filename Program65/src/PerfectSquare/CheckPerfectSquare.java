package PerfectSquare;

import java.util.Scanner;

/**
* @author -- Himanshu Patil
*/
public class CheckPerfectSquare {
	
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		
		int sqrt = (int)Math.sqrt(x);
		if(sqrt*sqrt == x)
		{
			System.out.println(x + " is a Perfect Square");
		}
		else
		{
			System.out.println(x + " is not a Perfect Square");
		}
	}

}
