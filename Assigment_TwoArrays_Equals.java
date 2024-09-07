package String_Array_Functions;

import java.util.Arrays;

public class Assigment_TwoArrays_Equals {

	public static void main(String[] args) {
		String name[] = new String[2];
		String name1[] = new String[2];
		name[0]= "Atul";
		name[1] = "Kumar";
		name1[0] = "Atul";
		name1[1] = "Kumar";
		
		boolean b = Arrays.equals(name, name1);
		System.out.println(b);
	}

}
