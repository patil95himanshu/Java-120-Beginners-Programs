package MethodOverloading;

import java.io.*;

/**
* @author -- Himanshu Patil
*/
public class Overload {
	
	String add(String a, String b)
	{
		return(a+b);
	}

}

class StringOverLoad
{
	public static void main (String args []) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String x,y;
		System.out.println("Enter two Values: ");
		x = br.readLine();
		y = br.readLine();
		
		Overload ol = new Overload();
		System.out.print("Result " + ol.add(x,y));
	}

}
