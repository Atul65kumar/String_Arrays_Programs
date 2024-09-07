package String_Array_Functions;
public class Assignment_Array_Part_Numbers {

	public static void main(String[] args)
	{
		int []rollno = new int[4];
		rollno[0]=100;
		rollno[1]=200;
		rollno[2]=300;
		rollno[3]=400;
		int givennumber = 200;
		for(int i = 0; i<rollno.length;i++)
		{
			if (givennumber == rollno[i])
			{
				System.out.println("Given number is a part of the array at index position --" +  i);
			}
			else {
				System.out.println("Sorry!!, not found");
			}
		}	
	}
}
