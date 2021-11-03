package GetSquareofNumbers;
/**
* @author -- Himanshu Patil
*/
class GetSquare extends Thread {
	
	public void run()
	{
		for(int x=1; x<=10; x++)
		{
			System.out.println("The Square of " + x + " is " + (x*x));
		}
	}
}

public class Square {
	
	public static void main(String args[])
	{
		GetSquare gs = new GetSquare();
		gs.start();
	}

}
