package String_Array_Functions;
import java.util.Arrays;
public class Array_Function {

	public static void main(String[] args) 
	{
		int rollno[] = new int[5];
		rollno[0]= 21;
		rollno[1] = 19;
		rollno[2] = 9;
		rollno[3] = 45;
		rollno[4] = 34;
		Arrays.sort(rollno);  //Use of sorting in Array
		/*System.out.println(rollno[0]); //first way to print the value
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);
		System.out.println(rollno[4]);*/
		
		/*for(int i=0;i<=4;i++)  //second way to print the value
		{
			System.out.println(rollno[i]);
		}*/
		System.out.println(Arrays.toString(rollno));  //third way to print the value
	}

}
