package String_Array_Functions;

public class String_Functions {

	public static void main(String[] args) {
		//String s1 = "Bangalore";
		String s1 = new String(" Bangalore ");
		String s2 = "Noida";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.charAt(6));
		
		System.out.println(s1.indexOf('g'));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(2, 7));
		
	}

}
