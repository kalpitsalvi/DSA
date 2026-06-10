public class BinaryAssignment1
{
  public static void main (String[] args)
  {
    
    int[] array = {3, 11, 23, 37, 52, 68, 79};

    int target = 0;

    int left = 0;
    int right = array.length - 1;
    int targetIndex = 0;

    int steps = 0;

    boolean found = false;

    while (left <= right)
    {
      steps++;
      int mid = left + (right - left)/2;

      if (array[mid] == target){
        found = true;
        targetIndex = mid;
        break;
      } else if (array[mid] > target){
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
    
    System.out.println("Steps Taken = " + steps);
  }
}
