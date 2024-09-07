package String_Array_Functions;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment_Array_ScannerClass {

	public static void main(String[] args)
	{
		double salary[] = new double[4];
		System.out.println("Give the inputs: - ");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < salary.length; i++)
		{
			salary[i] = s.nextDouble();
		}
			System.out.println(Arrays.toString(salary));
	}
}
