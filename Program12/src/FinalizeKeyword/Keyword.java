package FinalizeKeyword;
/**
* @author -- Himanshu Patil
*/
class First {
	
	int x;
	public First(int x)
	{
		this.x = x;
	}
	
	protected void finalize() throws Throwable
	{
		System.out.println("This is Finalize keyword in Java Programming " + x);
	}

}

public class Keyword {
	
	public static void main(String args [])
	{
		First f1 = new First(100);
		First f2 = new First(200);
		
		f1 = f2;
		System.gc();
		System.out.println("Hello Everyone");
	}
}
