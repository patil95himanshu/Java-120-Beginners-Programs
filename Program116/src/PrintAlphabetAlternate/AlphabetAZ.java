package PrintAlphabetAlternate;
/**
* @author -- Himanshu Patil
*/

class LowerAZ extends Thread {
	
	public void run()
	{
		int x = 97;
		while(x <= 122)
		{
			try
			{
				x = x+2;
				System.out.println(" " + (char)x);
				//Thread.sleep(1000);
			}
			catch (Exception e)
			{
			
			}
		}
	}
}

public class AlphabetAZ {
	
	public static void main(String args[])
	{
		LowerAZ laz = new LowerAZ();
		laz.start();
	}

}
