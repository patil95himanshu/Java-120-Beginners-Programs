package InsertElement;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Arrays {
	
	public static void main(String args [])
	{
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any element of your choice: ");
		
		x = sc.nextInt();
		int num1[] = new int[x+1];
		System.out.println("Enter arrays of elements now: ");
		for(int w=0; w<x; w++)
		{
			num1[w] = sc.nextInt();
		}
		
		System.out.println("Choose a prefered position for your element: ");
		y = sc.nextInt();
		
		System.out.print("Enter your prefered element: ");
		z = sc.nextInt();
		
		for(int w = (x-1); w>=(y-1); w--)
		{
			num1[w+1] = num1[w];
		}
		
		num1[y-1] = z;
		System.out.print("The result after inserting element is: ");
		for(int w=0; w<x; w++)
		{
			System.out.print(num1[w] + ",");
		}
		System.out.print(num1[x]);
	}

}
