package TwoMaximum;
/**
* @author -- Himanshu Patil
*/
public class Array {
	
	public void MaximumNums(int[] num1)
	{
		int max1 = 0, max2 = 0;
		
		for(int x:num1)
		{
			if(max1 < x)
			{
				max2 = max1;
				max1 = x;
			}
			else if(max2 < x)
			{
				max2 = x;
			}
		}
		System.out.println("The First Maximum Number is " + max1);
		System.out.println("The Second Maximum Number is " + max2);	
	}
	
	public static void main(String args [])
	{
		int num2[] = {4300,78,9,34,100,5000,432,678,12,7,3,0,654};
		
		Array ay = new Array();
		ay.MaximumNums(num2);
	}

}
