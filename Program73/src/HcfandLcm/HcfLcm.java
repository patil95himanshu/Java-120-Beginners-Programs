package HcfandLcm;

import java.util.*;

/**
* @author -- Himanshu Patil
*/
public class HcfLcm {
	
	public static void main(String args[])
	{
		int a,b,c,d,e,h,l;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a;
		d = b;
		
		while(d!=0)
		{
			e = d;
			d = c%d;
			c = e;
		}
		
		h = c;
		l = (a*b)/h;
		
		System.out.println("The result of HCF is:  " + h);
		System.out.println("The result of LCM is:  " + l);
	}

}
