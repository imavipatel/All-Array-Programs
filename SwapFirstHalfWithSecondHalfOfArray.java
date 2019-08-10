//WAP to swap the first half elements of an array with the second half of an array.
import java.util.Scanner;
public class SwapFirstHalfWithSecondHalfOfArray{
  public static void main(String[] args) {
    int arr[] = readArr();
    swapFirstHalfWithSecondHalfOfArray(arr);
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
  public static void swapFirstHalfWithSecondHalfOfArray(int arr[])
  {
    int temp, n=arr.length;
    for(int i=0;i<n/2;i++)
    {
      temp=arr[i];
      arr[i]=arr[i+n/2+n%2];
      arr[i+n/2+n%2]=temp;
    }
  }
  public static void displayArr(int arr[])
  {
    System.out.println("Array After swaping first half with second half Element Of Array : ");
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
