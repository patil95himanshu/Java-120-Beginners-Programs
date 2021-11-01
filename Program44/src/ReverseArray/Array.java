package ReverseArray;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class Array {
	
	public static void main(String args [])
	{
		ArrayList al = new ArrayList();
		al.add("H");
		al.add("I");
		al.add("M");
		al.add("A");
		al.add("N");
		al.add("S");
		al.add("H");
		al.add("U");
		
		System.out.println("Before reversal: " + al);
		
		Collections.reverse(al);
		System.out.println("After reversal: " + al);
		
	}

}
