package SortInDescendingOrder;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class SortList {
	
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("JAVA");
		al.add("PYTHON");
		al.add("KYC");
		al.add("CUP");
		al.add("AT");
		al.add("WELCOME");
		al.add("EYE");
		al.add("HELLO");
		al.add("WORLD");
		
		System.out.println("Array before Sorting: ");
		for(String Str1: al)
		{
			System.out.println(Str1);
		}
		
		System.out.println("\n");
		
		Collections.sort(al, Collections.reverseOrder());
		
		System.out.println("The Result of Array List in Descending order is: ");
		for(String Str1: al)
		{
			System.out.println(Str1);
		}
		
	}

}
