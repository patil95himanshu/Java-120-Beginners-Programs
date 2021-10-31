package UserInput;
import java.io.*;

/**
* @author -- Himanshu Patil
*/
public class CalculateInput {
	
	public static void main(String args []) throws IOException {
		
		int num1,num2, output;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number to add: ");
		num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter another number to add: ");
		num2 = Integer.parseInt(br.readLine());
		
		output = num1 + num2;
		System.out.println("The Result is: " + output);
		
		
	}

}
