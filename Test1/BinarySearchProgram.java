public class BinarySearchProgram
{

  public static void main (String[] args)
  {

    int[] arr = {4, 12, 23, 31, 55, 67, 89};

    int target = 12;

    int left = 0;
    int right = arr.length - 1;
    int targetIndex = 0;

    int steps = 0;

    boolean found = false;

    while (left <= right)
    {
      steps++;
        
      int mid = left + (right - left)/2;

      System.out.println("Step " + steps);
      System.out.println("Left = " + left + " | Mid = " + mid + " | Right = " + right); 
      if (arr[mid] == target){
        found = true;
        targetIndex = mid;
        break;
      } else if (arr[mid] > target){
        right = mid - 1;
      } else {
        left = mid + 1;
      }

    }

    if (!found) {
      System.out.println("Target number not Found.");
    } else {
      System.out.println("The Target is at Index " + targetIndex);
    }

    System.out.println("Total Steps : " + steps);

  }

}
