//WAP in java to define a method to perform minus of two array.
import java.util.Scanner;
public class MinusOfTwoArray{
  public static void main(String[] args) {
    int arr1[] = readArr();
    int arr2[] = readArr();
    int finalarr[] = minusOfTwoArray(arr1,arr2);
    displayArr(finalarr);
  }
  public static int[] minusOfTwoArray(int arr1[], int arr2[])
  {
    int arr3[] = new int[arr1.length];
    int k=0;
    for(int i=0;i<arr1.length;i++)
    {
      boolean find = true;
      for(int j=0;j<arr2.length;j++)
      {
        if(arr1[i]==arr2[j])
        {
          find = false;
          break;
        }
      }
      if(find)
      arr3[k++]=arr1[i];
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
    System.out.println("Final Array After Performig the Minus of Two Array : ");
    for(int i=0;i<finalarr.length;i++)
    {
      System.out.println(finalarr[i]);
    }
  }
}
