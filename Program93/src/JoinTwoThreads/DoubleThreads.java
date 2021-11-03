package JoinTwoThreads;
/**
* @author -- Himanshu Patil
*/
public class DoubleThreads {
	
	public static void main(String args[]) throws InterruptedException
	{
		Thread FirstThread = new Thread()
				{
					public void run()
					{
						try
						{
							System.out.println(Thread.currentThread().getName() + " Just Started");
							Thread.sleep(1000);
							System.out.println(Thread.currentThread().getName() + " Just Completed");		
						}
						catch(InterruptedException ex)
						{
							
						}
					}
				};
				
		Thread SecondThread = new Thread()
				{
					public void run()
					{
						try
						{
							System.out.println(Thread.currentThread().getName() + " Just Started");
							Thread.sleep(1000);
							System.out.println(Thread.currentThread().getName() + " Just Completed");
						}
						catch(InterruptedException ex)
						{
							
						}
					}
				};
				
				FirstThread.start();
				FirstThread.join();
				
				SecondThread.start();
				SecondThread.join();
				
				System.out.println(Thread.currentThread().getName() + " Just Completed");
	}

}
