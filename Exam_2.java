package String_Array_Functions;

public class Exam_2 {

	public static void main(String[] args) {
		String input = "Selenium";
		String output = "";
		for(int i = 7; i>=0; i--)
		{
			char c = input.charAt(i);
			output = output+c;
		}
		System.out.println(output);
	}

}
