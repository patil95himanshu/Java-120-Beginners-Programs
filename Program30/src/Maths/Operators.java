package Maths;
import java.io.*;
/**
* @author -- Himanshu Patil
*/
public class Operators {
	
	public static void main(String args []) throws NumberFormatException, IOException
	{
		int x, y, z, xyz=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first number: ");
		x = Integer.parseInt(br.readLine());
		System.out.println("Enter the second number: ");
		y = Integer.parseInt(br.readLine());
		
		while(xyz!=6)
		{
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Division");
			System.out.println("4. Multiplication");
			xyz = Integer.parseInt(br.readLine());
			switch(xyz)
			{
			case 1:
				z = x+y;
				System.out.println("Result of Addition is: " + z);
				break;
			
			case 2:
				z = x-y;
				System.out.println("Result of Subtraction is: " + z);
				break;
				
			case 3:
				z = x/y;
				System.out.println("Result of Divison is: " + z);
				break;
				
			case 4:
				z = x*y;
				System.out.println("Result of Multiplication is: " + z);
				break;
			
			case 5:
				System.exit(0);
				break;
			}
		}
	}

}
