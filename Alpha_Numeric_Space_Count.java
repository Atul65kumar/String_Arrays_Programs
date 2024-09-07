package String_Array_Functions;
import java.util.Arrays;
public class Alpha_Numeric_Space_Count {
	static int count_of_alphabet = 0;
	static int count_of_numberic = 0;
	static int count_of_space = 0;
	
	public static void main(String[] args) {
		String input = "ATUL KUMAR 6597  ";
		char[] c1 = input.toCharArray();
		//System.out.println(Arrays.toString(c1)); // output [A, T, U, L, , K, U, M, A, R, , 6, 5, 9, 7, , ]
		System.out.println("Find the Alphabets:  ");
		for(int i=0; i<input.length(); i++)
		{
			 boolean answer = Character.isAlphabetic(c1[i]);
			// System.out.println(answer);
			if(answer==true)
			 {
				 count_of_alphabet++;
			 }
		}
		System.out.println("Count of Alphabets are -- " +count_of_alphabet);
		
		System.out.println("Find the Numeric values:  ");
		for(int i=0; i<input.length(); i++)
		{
			 boolean answer1 = Character.isDigit(c1[i]);
			// System.out.println(answer1);
			 if(answer1==true)
			 {
				 count_of_numberic++;
			 }
		}
		System.out.println("Count of numbers are -- " +count_of_numberic);
		
		System.out.println("Find the Spaces:  ");
		for(int i=0; i<input.length(); i++)
		{
			 boolean answer2 = Character.isSpaceChar(c1[i]);
			// System.out.println(answer2);
			 if(answer2==true)
			 {
				 count_of_space++;
			 }
		}
		System.out.println("Count of spaces are -- " +count_of_space);		
	}
}
