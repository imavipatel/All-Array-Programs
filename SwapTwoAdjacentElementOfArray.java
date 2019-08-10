// WAP to Swap Two Adjacent Element Of Array.
import java.util.Scanner;
public class SwapTwoAdjacentElementOfArray{
  public static void main(String[] args) {
    int arr[] = readArr();
    swapTwoAdjacentElementOfArray(arr);
    displayArr(arr);
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static void swapTwoAdjacentElementOfArray(int arr[])
  {
    int temp, n=arr.length;
    for(int i=0;i<n-1;i+=2)
    {
      temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
    }
  }
  public static void displayArr(int arr[])
  {
    System.out.println("Array After swaping Two Adjacent Element Of Array : ");
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
