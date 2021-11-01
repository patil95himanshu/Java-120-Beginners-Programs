package ReverseNumber;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Number {
	
	public static void main(String args [])
	{
		int num1 = 0, num2, reversenum1=0;
		
		System.out.println("Enter some numbers: ");
		Scanner sc = new Scanner(System.in);
		
		num2 = num1 = sc.nextInt();
		
		while(num1 != 0)
		{
			reversenum1 = reversenum1*10;
			reversenum1 = reversenum1 + num1%10;
			num1 = num1/10;
		}
		System.out.println("Result of reversed number " + num2 + " is: " + reversenum1);
	}

}
