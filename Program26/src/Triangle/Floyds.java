package Triangle;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Floyds {
	
	public static void main(String args [])
	{
		int x,y,z,num1=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		
		x=sc.nextInt();
		System.out.println("Result of Flyods Triamgle is: ");
		for(y=1; y<=x; y++)
		{
			for(z=1; z<=y; z++)
			{
				System.out.print(num1 + " ");
				num1++;
			}
			System.out.println();
		}
	}

}
