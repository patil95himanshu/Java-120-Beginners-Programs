package DateTime;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
* @author -- Himanshu Patil
*/
public class Current {

	public static void main(String args [])
	{
		Date dTime = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("E");
		SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("MMM");
		
		System.out.println("Current Date is: " + sdf1.format(dTime));
		System.out.println("Current Day is: " + sdf2.format(dTime));
		System.out.println("Current Time is: " + sdf3.format(dTime));
		System.out.println("Current Month is: " + sdf4.format(dTime));
	}
	
}
