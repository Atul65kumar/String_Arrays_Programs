package String_Array_Functions;

public class Palindrome_Word {

	public static void main(String[] args) {
		String input = "atul";
		String output = "";
		for(int i = 3; i>=0; i--)
		{
			char c1 = input.charAt(i);
			output = output + c1;
		}
			System.out.println("The reverse of input is -- " +output);
			if(input.equals(output)) {
				System.out.println("Given String is Palindrome");
				}
			else {
				System.out.println("Given String is not Palindrome");
			}
	}
}
