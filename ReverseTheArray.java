package String_Array_Functions;
import java.util.Arrays;
public class ReverseTheArray {

	public static void main(String[] args) {
		int oldarray[]=new int[3];
		oldarray[0] = 71;
		oldarray[1] = 45;
		oldarray[2] = 89;
		int reverse_array[]=new int[3];
		
		//reverse_array[2] = oldarray[0];
		//reverse_array[1] = oldarray[1];
		//reverse_array[0] = oldarray[2];
		for(int i = 0,k=2; i<oldarray.length;i++)
		{
			reverse_array[k] = oldarray[i];
			k--;
		}
		System.out.println(Arrays.toString(oldarray));
		System.out.println(Arrays.toString(reverse_array));		
	}
}
