package CountNumberOfWords;
import java.util.*;
/**
* @author -- Himanshu Patil
*/
public class CountWords {
	
	static int z, y = 0, output;
	static int count(String s)
	{
		char ch[] = new char[s.length()];
		for(z=0; z<s.length(); z++)
		{
			ch[z] = s.charAt(z);
			if(((z>0) && (ch[z] != ' ') && (ch[z-1]==' ')) || ((ch[0] != ' ') && (z == 0)))
				y++;
		}
		return y;
	}
	
	public static void main(String args [])
	{
		String Str1 = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some word: ");
		Str1 = sc.nextLine();
		int words = CountWords.count(Str1);
		System.out.println("The number of words is: " + words);
	}

}
