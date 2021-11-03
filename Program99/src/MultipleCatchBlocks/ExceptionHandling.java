package MultipleCatchBlocks;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class ExceptionHandling {
	
	public static void main(String args [])
	{
		try
		{
			int x[] = new int[10];
			x[5] = 20/8;
		}
		catch(ArithmeticException e)
		{
			System.out.println("this is an " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This is an " + e);
		}
		catch(Exception e)
		{
			System.out.println("This is an " + e);
		}
		System.out.println("Out of try-catch block");
	}

}
