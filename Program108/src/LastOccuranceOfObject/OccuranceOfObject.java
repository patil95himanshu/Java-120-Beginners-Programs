package LastOccuranceOfObject;

import java.util.ArrayList;
import java.util.List;

/**
* @author -- Himanshu Patil
*/
public class OccuranceOfObject {
	
	public static void main(String args[])
	{
		List<String> list1 = new ArrayList<String>();
		
		list1.add("000");
		list1.add("222");
		list1.add("444");
		list1.add("333");
		list1.add("222");
		list1.add("000");
		list1.add("111");
		list1.add("555");
		list1.add("888");
		list1.add("444");
		list1.add("333");
		list1.add("000");
		list1.add("111");
		list1.add("222");
		list1.add("444");
		list1.add("555");
		
		System.out.println("The size of the list is: " + list1.size());
		
		System.out.println("Last Occurance of 000 is: " + list1.lastIndexOf("000"));
		System.out.println("Last Occurance of 111 is: " + list1.lastIndexOf("111"));
		System.out.println("Last Occurance of 222 is: " + list1.lastIndexOf("222"));
		System.out.println("Last Occurance of 333 is: " + list1.lastIndexOf("333"));
		System.out.println("Last Occurance of 444 is: " + list1.lastIndexOf("444"));
		System.out.println("Last Occurance of 555 is: " + list1.lastIndexOf("555"));
		System.out.println("Last Occurance of 888 is: " + list1.lastIndexOf("888"));
	}

}
