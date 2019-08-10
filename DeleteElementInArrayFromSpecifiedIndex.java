// WAP to delete the element at a particular index.
import java.util.Scanner;
public class DeleteElementInArrayFromSpecifiedIndex{
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static int[] deleteElementInArrayFromSpecifiedIndex(int arr[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the index of Element You want to Delete : ");
    int ind = sc.nextInt();
    int n = arr.length;
    int arr1[] = new int[n-1];
    for(int i=0;i<n-1;i++)
    {
      if(i<ind)
      arr1[i]=arr[i];
      else
      arr1[i]=arr[i+1];
    }
    return arr1;
  }
  public static void displayArray(int arr1[])
  {
    System.out.println("Final Array After Deleting the index From Orginal Array : ");
    for(int i=0;i<arr1.length;i++)
    {
      System.out.println(arr1[i]);
    }
  }
  public static void main(String[] args) {
    int arr[] = readArr();
    int arr1[] = deleteElementInArrayFromSpecifiedIndex(arr);
    displayArray(arr1);
  }
}
