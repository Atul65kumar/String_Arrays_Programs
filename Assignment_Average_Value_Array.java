package String_Array_Functions;

public class Assignment_Average_Value_Array {

	public static void main(String[] args) {
		int no[]= new int [4];
		no[0] = 17;
		no[1] = 35;
		no[2] = 81;
		no[3] = 42;
		double sum = 0;
		for(int i =0; i<no.length; i++)
		{
			sum = sum+no[i];
		}
		//int sum = no[0]+ no[1] + no[2]+no[3];
		double average = sum/4;
		System.out.println("Averageg value is -- " +average);		
	}

}
