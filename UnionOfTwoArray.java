//WAP in java to define a method to perform union to two array.
import java.util.Scanner;
public class UnionOfTwoArray{
  public static void main(String[] args) {
    //System.out.println("Enter the size of first Array : ");
    int arr1[] = readArr();
    //System.out.println("Enter the size of second Array : ");
    int arr2[] = readArr();
    int finalarr[] = unionOfTwoArray(arr1,arr2);
    displayArr(finalarr);
  }
  public static int[] unionOfTwoArray(int arr1[], int arr2[])
  {
    int arr3[] = new int[arr1.length+arr2.length];
    for(int i=0;i<arr1.length;i++)
    {
      arr3[i] = arr1[i];
    }
    int k = arr1.length;
    for(int i=0;i<arr2.length;i++)
    {
      boolean find = true;
      for(int j=0;j<arr1.length;j++)
      {
        if(arr2[i]==arr1[j])
        {
          find = false;
          break;
        }
      }
      if(find)
      arr3[k++]=arr2[i];
    }
    int finalarr[] = new int[k];
    for(int i=0;i<k;i++)
    finalarr[i]=arr3[i];
    return finalarr;
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
  public static void displayArr(int finalarr[])
  {
    System.out.println("Final Array After Performig the Union of Two Array : ");
    for(int i=0;i<finalarr.length;i++)
    {
      System.out.println(finalarr[i]);
    }
  }
}
