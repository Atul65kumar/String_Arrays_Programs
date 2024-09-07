package String_Array_Functions;

public class Reverse_Letter {
	public static void main(String[] args) 
	{
		String input = "atul";
		String output = "";
		for(int i = 3; i>=0; i--) 
		{
			char c1 = input.charAt(i);
			System.out.print(c1);
		}
	}
}
