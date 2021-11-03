package IntersectionOfTwoArrays;

import java.util.*;

/**
* @author -- Himanshu Patil
*/
public class ArrayIntersection {
	
	public static int[] sumElement(int[] x, int intersect)
	{
		int[] output = Arrays.copyOf(x, x.length+1);
		output[x.length] = intersect;
		return output;
	}
	
	public static int[] IntersectElement(int[] y, int[] z)
	{
		int[] inter = {};
		int i = 0, j = 0;
		
		while(i<y.length && j<z.length)
		{
			if(y[i] < z[j])
			{
				i++;
			}
			else if(y[i] == z[j])
			{
				inter = sumElement(inter, y[i]);
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}
		return inter;
	}
	
	public static void main(String args[])
	{
		int[] y = {56,70,8,2,10,700,1000,23,13};
		int[] z = {2,500,70,24,13,8,80,1};
		ArrayIntersection aint = new ArrayIntersection();
		
		Arrays.sort(y);
		Arrays.sort(z);
		
		int[] output = ArrayIntersection.IntersectElement(y,z);
		System.out.println("The result of intersection is: " + Arrays.toString(output));
	}

}
