package ExceptionHandlingInJava;
/**
* @author -- Himanshu Patil
*/
public class ExceptionHandling {
	
	public static void main(String args [])
	{
		int a = 30;
		int b = 12;
		
		try
		{
			float c = a/b;
			System.out.println("The result of C is : " + c);
		}
		catch(ArithmeticException exception)
		{
			System.out.println("Please do not use 0 as a divisor");
		}
	}

}
