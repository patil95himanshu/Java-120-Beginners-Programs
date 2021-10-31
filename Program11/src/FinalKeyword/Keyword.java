package FinalKeyword;
/**
* @author -- Himanshu Patil
*/
public class Keyword {
	
	final void display()
	{
		System.out.println("This is a final Method");
	}

}

class Hello extends Keyword {
	
	public static void main (String args [])
	{
		Hello h1 = new Hello();
		h1.display();
	}
}
