public class BubbleSort
{
  public static void main (String[] args)
  {

    int[] arr = {64, 25, 12, 22, 11};

    

  }

  static void printArr(int[] arr)
  {
    System.out.println();
    for (int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i]);
    }
    System.out.print();
  }

  static void bubbleSort(int[] arr)
  {
    int n = arr.length;

    for (int i = 0; i < n-1; i++)
    {
      System.out.println("\n---Pass " + (i+1) + " ---");
      
      for(int j = 0; j < n -1 - i; j++)
      {
        System.out.println("Comparing:")
      }
    }
  }
}
