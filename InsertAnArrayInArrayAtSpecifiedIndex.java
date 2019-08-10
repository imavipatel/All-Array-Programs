// WAP to insert and array in the existing array to the specified index.
import java.util.Scanner;
public class InsertAnArrayInArrayAtSpecifiedIndex{
  public static void main(String[] args) {
    int arr[] = readArr();
    int arr1[] = readArr();
    int arr2[] = insertAnArrayInArrayAtSpecifiedIndex(arr,arr1);
    displayArray(arr2);
  }
  public static int[] readArr()
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Size of Array : ");
  int n = sc.nextInt();
  int arr[] = new int[n];
  System.out.println("Enter the Elements Of Array : ");
  for(int i=0;i<n;i++)
  {
    arr[i] = sc.nextInt();
  }
  return arr;
}
  public static int[] insertAnArrayInArrayAtSpecifiedIndex(int arr[],int arr1[])
  {
    Scanner sc = new Scanner(System.in);
    //int arr1[] = readArr();
    int n = arr.length;
    System.out.println("Enter the index at which you want to insert the element : ");
    int ind = sc.nextInt();
    int arr2[] = new int[arr.length+arr1.length];
    if(ind<0||ind>n)
    {
      System.out.println("Wrong Index, Please Enter the index  b/w  0 and "+n+".");
      return insertAnArrayInArrayAtSpecifiedIndex(arr,arr1);
    }
    else if (ind>=0||ind<n)
    {
      for(int i=0;i<n;i++)
      {
        if(i<ind)
        arr2[i]=arr[i];
        else
        arr2[i+arr1.length]=arr[i];
      }
      for(int i=0;i<arr1.length;i++)
      {
        arr2[ind+i]=arr1[i];
      }
    }
    return arr2;
  }
  public static void displayArray(int arr2[])
  {
    System.out.println("Array After Inserting the Array at specified index : ");
    for(int i=0;i<arr2.length;i++)
    {
      System.out.println(arr2[i]);
    }
  }
}
