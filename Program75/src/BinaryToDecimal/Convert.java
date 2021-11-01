package BinaryToDecimal;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Convert {
	
	public static void main(String args[])
	{
		int BNum, DNum = 0, x=1, num1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter only Binary Numbers: ");
		BNum = sc.nextInt();
		int BNum2 = BNum;
		
		while(BNum != 0)
		{
			num1 = BNum%10;
			DNum = DNum + num1*x;
			x = x*2;
			BNum = BNum/10;
		}
		
		System.out.print("Decimal Equivalent of " + BNum2 + " is " + DNum);
	}

}
