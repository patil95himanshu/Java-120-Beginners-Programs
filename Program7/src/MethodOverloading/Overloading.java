package MethodOverloading;
import java.io.*;
/**
* @author -- Himanshu Patil
*/
public class Overloading {
	
	int sum(int num1, int num2)
	{
		return(num1+num2);
	}

}
	
	
	class MethodCall
	{
		public static void main(String args []) throws NumberFormatException, IOException
		{
			int x,y;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter two Intergers: ");
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());
			
			Overloading ol = new Overloading();
			System.out.println("Result : " + ol.sum(x, y));
		}
	}


