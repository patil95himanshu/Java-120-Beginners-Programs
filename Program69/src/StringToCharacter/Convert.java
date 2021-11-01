package StringToCharacter;
/**
* @author -- Himanshu Patil
*/
public class Convert {
	
	public static void main(String args [])
	{
		String helloStr = "This is the Original string Object";
		
		char[] StrArray;
		
		StrArray = helloStr.toCharArray();
		
		System.out.println("The result of the character array is below: ");
		for(int x=0; x<StrArray.length; x++)
		{
			System.out.print(StrArray[x]);
		}
	}

}
