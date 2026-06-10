public class BinaryAssignment2
{
  public static void main (String[] args)
  {
    
    int[] array = {4, 9, 17, 26, 38, 54, 72};
    int target = 26;

    int left = 0;
    int right = array.length - 1;
    int result = -1;

    int steps = 0;

    while (left <= right)
    {
      steps++;
      int mid = left + (right - left)/2;

      if (array[mid] == target){
        result = mid;
        break;
      } else if (array[mid] > target){
        right = mid - 1;
      } else {
        left = mid + 1;
      }

    }

    if (result == -1) {
      System.out.println("Target number not Found.");
    } else {
      System.out.println("The Target is at Index " + result);
    }
    
    System.out.println("Steps Taken = " + steps);
  }
}
