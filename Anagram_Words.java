package String_Array_Functions;
import java.util.Arrays;
public class Anagram_Words {

	public static void main(String[] args)
	{
		String name = "face";
		String name1 = "cafe";
		
		if(name.length()!=name1.length())
		{
			System.out.println("Given input is not Anagram");
		}
		else
		{
			char []c1 =	name.toCharArray();
			char []c2 = name1.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			boolean answer = Arrays.equals(c1, c2);
			System.out.println(answer);
			if(answer==true)
			{
				System.out.println("Given Strings are Anagram");
			}
			else
			{
				System.out.println("Given Strings are not Anagram");
			}
		}
	}
}
