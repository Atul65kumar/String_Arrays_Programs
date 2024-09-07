package String_Array_Functions;
public class Replace_String_Program {

	public static void main(String[] args) 
	{
		String a = "Manish";
		System.out.println(a.replace("M", "Z")); //replace M with Z from Manish
		
		String b = "Manish Kumar Tiwari";
		System.out.println(b.replace(" ", "")); //Remove all capital letters from Manish Kumar Tiwari
		
		String c = "Avinash Yadav";
		System.out.println(c.replaceAll("[A-Z]", " "));
		
		String d = "Avinash Yadav";
		System.out.println(d.replaceAll("[a-z]", " "));
		
		String e = "kv no 23 Bang 34";
		System.out.println(e.replaceAll("[0-9]", ""));
			
	}

}
