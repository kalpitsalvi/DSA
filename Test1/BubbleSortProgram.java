public class BubbleSortProgram
{
  public static void main (String[] args)
  {
    int[] arr = {64, 25, 12, 22, 11};

    System.out.print("Initial Array : ");
    printArray(arr);
    
    BubbleSort(arr);

  }

  static void printArray(int[] arr)
  {
    System.out.println();
    for (int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void BubbleSort(int[] arr)
  {
    int n = arr.length;
    int swaps = 0;
    for(int i = 0; i < n - 1; i++)
    {
      System.out.println("\n---Phase " + (i+1) + " ---");

      for(int j = 0; j < n - 1 - i; j++)
      {
        System.out.println("Step " + (j+1));
        if(arr[j] > arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;

          swaps++;
          System.out.print("Swapped");
        }
        else 
        {
          System.out.print("No Swap");
        }

        printArray(arr);
      }
    }

    System.out.print("\n\nFinal Sorted Array : ");
    printArray(arr);
  }
}
