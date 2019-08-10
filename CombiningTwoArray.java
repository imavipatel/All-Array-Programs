//WAP to combine two arrays.
import java.util.Scanner;
public class CombiningTwoArray{
  public static void main(String[] args) {
    int arr1[] = readArr();
    int arr2[] = readArr();
    int arr3[] = combiningTwoArray(arr1,arr2);
    displayArr(arr3);
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static int[] combiningTwoArray(int arr1[], int arr2[])
  {
    int arr3[] = new int[arr1.length+arr2.length];
    for(int i=0;i<arr1.length;i++)
    {
      arr3[i] = arr1[i];
    }
    for(int i=0;i<arr2.length;i++)
    {
      arr3[arr1.length+i] = arr2[i];
    }
    System.out.println("The combined array size is : "+arr3.length);
    return arr3;
  }
  public static void displayArr(int arr3[])
  {
    System.out.println("Array After Combining Two Array is : ");
    for(int i=0;i<arr3.length;i++)
    {
      System.out.println(arr3[i]);
    }
  }
}
