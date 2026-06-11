public class LinearSearchProgram {
    
	public static void main (String[] args) {
		
		//Given array
		int[] arr = {23, 67, 4, 89, 31, 55, 12};
		
		//Q1
		int target = 89;
		int result = 0;
		boolean found = false;
		int steps = 0;

		for (int i = 0; i < arr.length; i++)
		{
			steps++;

			if (arr[i] == target) 
			{
				result = i;
				found = true;
			}

			if (found)
			{
				System.out.println("Step : " + (i+1) + " -> " + target + " found at index " + result);
				break;
			}
			else 
			{
				System.out.println("Step : " + (i+1) + " -> " + target + " not found at index " + i);
				
			}

		}

		System.out.println("Total No of steps : " + steps);

		
	}

}

