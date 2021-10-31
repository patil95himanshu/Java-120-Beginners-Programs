package Print;

import java.io.PrintWriter;

/**
* @author -- Himanshu Patil
*/
public class Writer {
	
	public static void main(String args[] ) {
		
		PrintWriter pw = new PrintWriter(System.out,true);
		String sc = "Program 2. ";
		pw.println("This is " + sc);
	}

}
