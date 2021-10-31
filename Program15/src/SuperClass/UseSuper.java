package SuperClass;
/**
* @author -- Himanshu Patil
*/

class FirstSuper {
	
	int x,y;
	FirstSuper(int a, int b)
	{
		x = a;
		y = b;
	}
	void show()
	{
		System.out.println("Value of X is: " + x);
		System.out.println("Value of Y is: " + y);
	}
}

class SecondSuper extends FirstSuper {
	
	int z;
	SecondSuper(int a, int b, int c)
	{
		super(a, b);
		z = c;
	}
	void show()
	{
		super.show();
		System.out.println("Value of Z is: " + z);
	}
}

public class UseSuper {
	public static void main(String args [])
	{
		SecondSuper fs = new SecondSuper(100,200,300);
		fs.show();
	}
	
}
