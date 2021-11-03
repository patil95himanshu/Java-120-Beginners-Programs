package StringFunctionsInJava;
/**
* @author -- Himanshu Patil
*/
public class StringFunctions {
	
	public static void main(String args[])
	{
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "Hello      World";
		String str4 = new String("Welcome");
		
		System.out.println("Str1 is: " + str1);
		System.out.println("Str2 is: " + str2);
		System.out.println("Str3 is: " + str3);
		System.out.println("Str4 is: " + str4);
		
		System.out.println("\n");
		
		System.out.println("Str1 in Lowercase is: " + str1.toLowerCase());
		System.out.println("Str3 in Uppercase is: " + str2.toUpperCase());
		System.out.println("Str2 Replace Value: " + str2.replace('W', 'p'));
		System.out.println("Str1 length is: " + str1.length());	
		
	}

}
