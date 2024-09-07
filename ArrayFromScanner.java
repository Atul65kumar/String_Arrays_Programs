package String_Array_Functions;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		int rollno[]=new int[3];
		System.out.println("Give the Inputs: -");
		Scanner s1 = new Scanner(System.in);
		for(int i = 0; i<rollno.length; i++)
		{
			rollno[i] = s1.nextInt();
		}			
		//System.out.println(rollno[0]);	
		//System.out.println(rollno[1]);	
		//System.out.println(rollno[2]);	
		System.out.println(Arrays.toString(rollno));
	}
}
