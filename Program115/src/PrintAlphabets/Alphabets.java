package PrintAlphabets;
/**
* @author -- Himanshu Patil
*/

class CharacterAZ extends Thread {
	
	public void run()
	{
		char x;
		for(x='A'; x<='Z'; x++)
		{
			System.out.print(" " + x);
		}
	}
}

public class Alphabets {
	
	public static void main(String args[])
	{
		CharacterAZ chaz = new CharacterAZ();
		
		chaz.start();
	}

}
