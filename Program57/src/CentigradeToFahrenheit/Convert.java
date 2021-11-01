package CentigradeToFahrenheit;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Convert {
	
	public static void main(String args [])
	{
		float degreeF;
		double degreeC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value in Celcius");
		degreeF = sc.nextFloat();
		
		degreeC = (1.8*degreeF)+32;
		
		System.out.println("Celcius equivalent of " + degreeF + " is " + degreeC);
	}

}
