package String_Array_Functions;

public class Assignment_String_Reverse_Loop {

	public static void main(String[] args) {
		String name = "ANKIT KUMAR";
		String reverse = "";
		
		//for(int i=name.length()-1; i>=0; i--)
		
		for (int i= 10; i>=0; i--)
		{
			char c = name.charAt(i);
			reverse = reverse+c;
		}
			System.out.println("The reverse of input is -- " +reverse); //this is outside the loop because of iteration process
	}
}
