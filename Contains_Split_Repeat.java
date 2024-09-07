package String_Array_Functions;

import java.util.Arrays;

public class Contains_Split_Repeat {

	public static void main(String[] args) 
	{
		String a = "Manish Kumar Tiwari";
		boolean answer = a.contains("Tiwari");
		System.out.println(answer);
		
		String[] name = a.split(" ");
		System.out.println(Arrays.toString(name));
		
		String[] name1 = a.split(" ", 2);
		System.out.println(Arrays.toString(name1));
		
		String b= "school";
		System.out.println(b.repeat(5));
		
		String c = "Manish";
		String d = "";
		System.out.println(c.endsWith("h"));
		System.out.println(d.isEmpty());	
	}

}
