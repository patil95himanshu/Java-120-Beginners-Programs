package ThisKeyword;
/**
* @author -- Himanshu Patil
*/
public class UseThis {
	
	int num1, num2;
	UseThis(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	void show()
	{
		System.out.println("The value of Num1 is: " + num1);
		System.out.println("The value of Num2 is: " + num2);
	}
	
	public static void main(String args [])
	{
		UseThis ut = new UseThis(100,200);
		ut.show();
	}
	
}
