package String_Array_Functions;

public class Reverse_Word {

	public static void main(String[] args) {
		String input = "123456789";
		String output = "";
		for(int i = 8; i>=0; i--)
		{
			char c1 = input.charAt(i);
			output = output + c1;
		}
			System.out.println("The reverse of input is -- " +output);
	}
}