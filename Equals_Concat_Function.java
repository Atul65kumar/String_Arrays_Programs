package String_Array_Functions;

public class Equals_Concat_Function {

	public static void main(String[] args)
	{
		String a = "Atul";
		String b = "atul";
		System.out.println(a.equals(b)); //equals function
		
		String c = "Atul";
		System.out.println(c.equals(a)); //equals function
		
		System.out.println(a.concat(" Kumar")); //concat function
		
		System.out.println(a.equalsIgnoreCase(b)); //equalignorecase function
	}
}
