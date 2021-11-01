package StringToDataTypes;
/**
* @author -- Himanshu Patil
*/
public class ConvertString {
	
	public static void main(String args [])
	{
		// String to Boolean
		String Str1 = "False";
		
		boolean bol = Boolean.parseBoolean(Str1);
		System.out.println("The boolean result is: " + bol);
		
		//String to Integer
		String Str2 = "500";
		int num1 = 300;
		
		int num2 = Integer.parseInt(Str2);
		int add = num1 + num2;
		System.out.println("Integer result is: " + add);
		
		//String to Double
		String Str3 = "301.92";
		Double dob = 45.78;
		
		Double dob1 = Double.parseDouble(Str3);
		Double adddob = dob + dob1;
		System.out.println("Double result is: " + adddob);
	}

}
