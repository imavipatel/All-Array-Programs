// WAP to insert the element in the existing array to the specified index.
import java.util.Scanner;
public class InsertElementsInArrayAtSpecifiedIndex{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the Elements Of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    int arr1[] = insertElementsInArrayAtSpecifiedIndex(arr);
    displayArray(arr1);
  }
  public static int[] insertElementsInArrayAtSpecifiedIndex(int arr[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Elements You Want To Insert : ");
    int ele = sc.nextInt();
    int n = arr.length;
    System.out.println("Enter the index at which you want to insert the element : ");
    int ind = sc.nextInt();
    int arr1[] = new int[n+1];
    if(ind<0||ind>n)
    {
      System.out.println("Wrong Index, Please Enter the index  b/w  0 and "+n+".");
      return insertElementsInArrayAtSpecifiedIndex(arr);
    }
    else if (ind>=0||ind<n)
    {
      for(int i=0;i<n;i++)
      {
        if(i<ind)
        arr1[i]=arr[i];
        else
        arr1[i+1]=arr[i];
      }
      arr1[ind]=ele;
    }
    return arr1;
  }
  public static void displayArray(int arr1[])
  {
    System.out.println("Array After Inserting the element at specified index : ");
    for(int i=0;i<arr1.length;i++)
    {
      System.out.println(arr1[i]);
    }
  }
}
