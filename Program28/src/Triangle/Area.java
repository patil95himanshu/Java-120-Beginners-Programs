package Triangle;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Area {
	
	double w,h,result;
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Width and height of the Triangle: ");
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		
		double result = (w*h)/2;
		System.out.println("The area of Triangle is: " + result);
	}

}
