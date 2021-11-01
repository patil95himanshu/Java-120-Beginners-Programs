package DecimalToOctal;

import java.util.Scanner;

/**
* @author -- Himanshu Patil
*/
public class Convert {
	
	public static void main(String args [])
	{
		int DNum, x=1, y, num1;
		int ONum[] = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Decimal Number: ");
		DNum = sc.nextInt();
		
		num1 = DNum;
		
		while(num1!=0)
		{
			ONum[x++] = num1%8;
			num1 = num1/8;
		}
		System.out.print("Octal equivalent of " + DNum + " is " );
		for(y=x-1; y>0; y--)
		{
			System.out.print(ONum[y]);
		}
	}

}
