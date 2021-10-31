package AscendingOrder;
import java.io.*;
/**
* @author -- Himanshu Patil
*/
public class Array {
	
	public static void main(String args []) throws NumberFormatException, IOException
	{
		int num1  = 0, num2[] = new int[7], x, y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\n Enter only 7 array elements: ");
		for(x=0; x<7; x++)
		{
			num2[x] = Integer.parseInt(br.readLine());
		}
		for(x=0; x<num2.length; x++)
		{
			for(y=x+1; y<num2.length; y++)
			{
				if(num2[x]>num2[y])
				{
					num1 = num2[x];
					num2[x] = num2[y];
					num2[y] = num1;
				}
			}
		}
		System.out.println("The result of this Array in ascending order is: ");
		for(x=0; x<7; x++)
		{
			System.out.print(" " + num2[x]);
		}
	}

}
