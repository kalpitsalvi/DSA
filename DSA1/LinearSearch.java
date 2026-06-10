public class LinearSearch {
	public static void main (String[] args) {
		
		//Given array
		int[] arr = {5, 12, 19, 28, 33, 47, 56};
		
		//Q1
		int number1 = 33;
		int numberIndex1 = 0;
		boolean found1 = false;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == number1) 
			{
				numberIndex1 = i;
				found1 = true;
				break;	
			}

		}

		if (found1)
		{

			System.out.println("The Index of Number " + number1 + " is " + numberIndex1);
		
		}
		else 
		{
			System.out.println("Number not Found");
		}

		//Q2
		int number2 = 100;
		int numberIndex2 = 0;
		boolean found2 = false;

		for(int j = 0; j < arr.length; j++)
		{
			if (arr[j] == number2) 
			{
				numberIndex2 = j;
				found2 = true;
				break;
			}

		}

		if (found2) {System.out.println("The Index of Number " + number2 + " is " + numberIndex2);}
		else {System.out.println(number2  + " not Found ");}

		//Q3
		
		int number3 = 56;
		int steps3 = 0;

		boolean found3 = false;

		for(int k = 0; k < arr.length; k++)
		{
			if (arr[k] == number3)
			{
				found3 = true;
			}

			steps3++;

			if (found3) break;

		}

		System.out.println("Number of steps " + steps3);
	}

}

