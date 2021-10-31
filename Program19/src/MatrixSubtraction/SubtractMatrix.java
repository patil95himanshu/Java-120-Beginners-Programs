package MatrixSubtraction;
import java.io.*;
/**
* @author -- Himanshu Patil
*/
public class SubtractMatrix {
	
	public static void main(String args []) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1[][] = new int[3][3];
		int num2[][] = new int[3][3];
		int num3[][] = new int[3][3];
		
		int x, y;
		
		System.out.println("Enter the values: ");
		for(x=0; x<3; x++)
		{
			for(y=0; y<3; y++)
			{
				num1[x][y] = Integer.parseInt(br.readLine());
			}
		}
		
		for(x=0; x<num1.length; x++)
		{
			for(y=0; y<3; y++)
			{
				System.out.print(" " + num1[x][y]);
			}
			System.out.println();
		}
		
		System.out.println("Enter the values: ");
		for(x=0; x<3; x++)
		{
			for(y=0; y<3; y++)
			{
				num2[x][y] = Integer.parseInt(br.readLine());
			}
		}
		
		for(x=0; x<num2.length; x++)
		{
			for(y=0; y<3; y++)
			{
				System.out.print(" " + num2[x][y]);
			}
			System.out.println();
		}
		
		for(x=0; x<3; x++)
		{
			for(y=0; y<3; y++)
			{
				num3[x][y] = num1[x][y] - num2[x][y];
			}
		}
		
		System.out.println("The Subtraction of the Matrix is: ");
		for(x=0; x<3; x++)
		{
			for(y=0; y<3; y++)
			{
				System.out.print(" " + num3[x][y]);
			}
			System.out.println();
		}
		
	}

}
