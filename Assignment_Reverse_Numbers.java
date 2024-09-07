package String_Array_Functions;

import java.util.Arrays;

public class Assignment_Reverse_Numbers {

	public static void main(String[] args)
	{
	double number[] = new double[4];
	 number[0] = 56.66;
	 number[1] = 100.23;
	 number[2] = 120.56;
	 number[3] = 150.99;
	 double reversenumber[] = new double[4];
	 
	 for(int i=0, k=3; i<number.length;i++ )
	 {
		 reversenumber[k]  = number[i];
		 k--;
	 }
	 System.out.println(Arrays.toString(number));
	 System.out.println(Arrays.toString(reversenumber));
	 
	 /*reversenumber[0]  = number[3];
	 reversenumber[1]  = number[2];
	 reversenumber[2]  = number[1];
	 reversenumber[3]  = number[0];*/
	 //System.out.println(Arrays.toString(reversenumber));
	}
}
