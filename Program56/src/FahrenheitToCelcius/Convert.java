package FahrenheitToCelcius;

import java.util.*;

/**
* @author -- Himanshu Patil
*/
public class Convert {
	
	public static void main(String args[])
	{
		float radian;
		double degree;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value in Fahrenheit: ");
		radian = sc.nextFloat();
		
		degree = (radian-32)/1.8;
		
		System.out.println("Celcius equivalent of: " + radian + " Radian is " + degree + " Degree");
	}

}
