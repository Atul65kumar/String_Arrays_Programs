package String_Array_Functions;
import java.util.Arrays;
public class Assignment_Special_Character {
	static int count_of_specialcharacters = 0;

	public static void main(String[] args) {
		String a = "Atul_k@!!!_";
		char[] c = a.toCharArray();
		// System.out.println(Arrays.toString(c));

		System.out.println("No of Special characters: - ");
		for (int i = 0; i < a.length(); i++) {
			boolean answer = Character.isAlphabetic(c[i]);
			// System.out.println(answer);
			if (answer == false) {
				count_of_specialcharacters++;
			}
		}
		System.out.println("Count of special characters are -- " + count_of_specialcharacters);
	}
}
