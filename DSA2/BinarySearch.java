public class BinarySearch
{

  public static void main (String[] args)
  {

    int[] arr = {5, 12, 19, 28, 33, 47, 56};

    int target = 56;

    int left = 0;
    int right = arr.length - 1;
    int targetIndex = 0;

    boolean found = false;

    while (left <= right)
    {
      int mid = left + (right - left)/2;

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

  }

}
