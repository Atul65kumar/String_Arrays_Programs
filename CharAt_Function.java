package String_Array_Functions;

public class CharAt_Function {

	public static void main(String[] args) {
		String name = "ATUL";
		
		/*char a = name.charAt(0);
		System.out.println(a);
		
		char b = name.charAt(1);
		System.out.println(b);
		
		char c = name.charAt(2);
		System.out.println(c);
		
		char d = name.charAt(3);
		System.out.println(d);*/
		//for(int i = 0; i<=3; i++)
		for(int i = 0; i<name.length(); i++)
		{
			char a1 = name.charAt(i);
			System.out.println(a1);
		}
	}
}
