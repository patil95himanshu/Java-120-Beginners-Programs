package ArrayList;
import java.util.*;

/**
* @author -- Himanshu Patil
*/
public class Array {
	
	public static void main(String args [])
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("India");
		list.add("UAE");
		list.add("USA");
		list.add("England");
		
		System.out.println("These are the elements of array list: " + list);
		
		//How to add elements into the array using index
		list.add(0, "Italy");
		list.add(0, "Argentina");
		System.out.println("These are the current elements: " + list);
		
		//How to remove elements from array
		list.remove(1);
		list.remove(4);
		System.out.println("This is the remaining elements after removal: " + list);
	}

}
