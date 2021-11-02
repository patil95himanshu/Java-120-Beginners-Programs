package RemoveDuplicateElements;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class DuplicateElements {
	
	public static void main(String args [])
	{
		List<String> al = new ArrayList<String>();
		
		al.add("AAA");
		al.add("FFF");
		al.add("CCC");
		al.add("DDD");
		al.add("FFF");
		al.add("CCC");
		al.add("HHH");
		al.add("FFF");
		
		System.out.println("List before removing duplicate elements: ");
		System.out.println(al);
		
		LinkedHashSet<String> hset = new LinkedHashSet<String>();
		
		hset.addAll(al);
		
		al.clear();
		
		al.addAll(hset);
		
		System.out.println("\n");
		
		System.out.println("List after removing dupliacte elements: " + al);
	}

}
