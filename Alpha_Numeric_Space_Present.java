package String_Array_Functions;

import java.util.Arrays;

public class Alpha_Numeric_Space_Present {

	public static void main(String[] args) {
		String input = "ATUL KUMAR 6597  ";
		char[] c1 = input.toCharArray();
		System.out.println(Arrays.toString(c1)); // output [A, T, U, L, , K, U, M, A, R, , 6, 5, 9, 7, , ]
		System.out.println("Find the Alphabets:  ");
		for(int i=0; i<input.length(); i++)
		{
			 boolean answer = Character.isAlphabetic(c1[i]);
			 System.out.println(answer);
	}
		System.out.println("Find the Numeric values:  ");
		for(int i=0; i<input.length(); i++)
		{
			 boolean answer1 = Character.isDigit(c1[i]);
			 System.out.println(answer1);
	}
		System.out.println("Find the Spaces:  ");
		for(int i=0; i<input.length(); i++)
		{
			 boolean answer2 = Character.isSpaceChar(c1[i]);
			 System.out.println(answer2);
}
}
}


