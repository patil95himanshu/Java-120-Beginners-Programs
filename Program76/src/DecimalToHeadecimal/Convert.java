package DecimalToHeadecimal;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Convert {
	
	public static void main(String args [])
	{
		int DNum, num1;
		String HNum = "";
		
		char Hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Decimal Number: ");
		DNum = sc.nextInt();
		int DNum1 = DNum;
		
		while(DNum>0)
		{
			num1 = DNum%16;
			HNum = Hex[num1] + HNum;
			DNum = DNum/16;
		}
		System.out.println("Hexadecimal Equivalent of " + DNum1 + " is " + HNum);
	}
}
