package MergeArray;

import java.util.*;

/**
* @author -- Himanshu Patil
*/
public class Array {
	
	public static void main(String args [])
	{
		String x[] = {"H", "E", "L", "L", "O"};
		String y[] = {"W", "O", "R", "L", "D"};
		
		List ls = new ArrayList(Arrays.asList(x));
		ls.addAll(Arrays.asList(y));
		
		Object[] z = ls.toArray();
		System.out.println(Arrays.toString(z));
	}

}
