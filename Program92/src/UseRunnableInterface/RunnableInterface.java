package UseRunnableInterface;
/**
* @author -- Himanshu Patil
*/
public class RunnableInterface implements Runnable {
	
	public static void main(String args[])
	{
		RunnableInterface runthread = new RunnableInterface();
		Thread th = new Thread(runthread);
		th.start();
	}
	
	@Override
	public void run()
	{
		System.out.println("This is a runnable interface...");
	}

}
