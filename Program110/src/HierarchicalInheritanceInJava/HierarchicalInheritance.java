package HierarchicalInheritanceInJava;
/**
* @author -- Himanshu Patil
*/
class LevelA {
	
	public void showA()
	{
		System.out.println("This is level A");
	}
}

class LevelB extends LevelA {
	
	public void showB()
	{
		System.out.println("This is level B");
	}
}

class LevelC  extends LevelA {
	
	public void showC()
	{
		System.out.println("This is level C");
	}
}

class LevelD extends LevelA {
	
	public void showD()
	{
		System.out.println("This is level D");
	}
}
public class HierarchicalInheritance {
	
	public static void main(String args[])
	{
		LevelB lb = new LevelB();
		lb.showA();
		lb.showB();
		
		LevelC lc = new LevelC();
		lc.showC();
		
		LevelD ld = new LevelD();
		ld.showD();
		
		
		
	}

}
