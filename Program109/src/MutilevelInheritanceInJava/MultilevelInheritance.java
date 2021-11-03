package MutilevelInheritanceInJava;
/**
* @author -- Himanshu Patil
*/

class LevelA {
	
	public void showA()
	{
		System.out.println("This level belongs to A");
	}
}

class LevelB extends LevelA {
	
	public void showB()
	{
		System.out.println("This level belongs to B");
	}
}

class LevelC extends LevelB {
	
	public void showC()
	{
		System.out.println("This level belongs to C");
	}
}

public class MultilevelInheritance {
	
	public static void main(String args[])
	{
		LevelC lc = new LevelC();
		
		lc.showA();
		lc.showB();
		lc.showC();
	}

}
