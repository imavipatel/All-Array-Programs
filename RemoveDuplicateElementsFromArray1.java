// WAP to delete the duplicate elements from the array.
import java.util.Scanner;
public class RemoveDuplicateElementsFromArray1{
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static int[] removeDuplicate(int arr[])
  {
    int arr1[] = new int[arr.length];
    arr1[0] = arr[0];
    int k=1;
    for(int i=0;i<arr.length;i++)
    {
      boolean find = true;
      for(int j=0;j<k;j++)
      {
        if(arr[i]==arr1[j])
        {
          find = false;
          break;
        }
      }
      if(find)
      arr1[k++]=arr[i];
    }
    int finalarr[] = new int[k];
    for(int i=0;i<k;i++)
    {
      finalarr[i]=arr1[i];
    }
    return finalarr;
  }
  public static void displayFinalArray(int finalarr[])
  {
    System.out.println("Final Array After Removing Duplicate Elements  : ");
    for(int i=0;i<finalarr.length;i++)
    {
      System.out.println(finalarr[i]);
    }
  }
  public static void main(String[] args) {
    int arr[] = readArr();
    int finalarr[] = removeDuplicate(arr);
    System.out.println("The Size of Final Array is : "+finalarr.length);
    displayFinalArray(finalarr);
  }
}
