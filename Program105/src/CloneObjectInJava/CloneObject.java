package CloneObjectInJava;
/**
* @author -- Himanshu Patil
*/
public class CloneObject implements Cloneable {
	
	String name;
	int record;
	
	public CloneObject(String name, int record)
	{
		this.name = name;
		this.record = record;
	}
	
	public void show()
	{
		System.out.println("Welcome " + name + "! Your Score is: " + record);
	}
	
	public static void main(String args[])
	{
		CloneObject co = new CloneObject("Tommy",98);
		try {
			CloneObject co1 = (CloneObject)co.clone();
			co1.show();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}


}
