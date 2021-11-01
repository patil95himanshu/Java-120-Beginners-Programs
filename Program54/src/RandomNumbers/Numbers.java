package RandomNumbers;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Numbers {
	
	public static void main(String args [])
	{
		int rad;
		Random radnum = new Random();
		
		System.out.println("The result of the Random numbers are: ");
		
		for(rad=1; rad<=7; rad++)
		{
			System.out.print(radnum.nextInt(2000)+ "\n");
		}
	}

}
