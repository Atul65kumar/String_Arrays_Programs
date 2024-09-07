package String_Array_Functions;

public class Assignment_Palindrome {

	public static void main(String[] args) {
		String palindrome = "RACECAR";
		String output = "";
		
		for(int i = palindrome.length()-1; i>=0; i--)
		
		//for(int i=6; i>=0; i--)
		{
			char a = palindrome.charAt(i);
			output = output + a;
		}
		if(palindrome.equals(output))
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Given String is not palindrome");
		}
	}
}
