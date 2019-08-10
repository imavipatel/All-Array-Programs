// WAP to delete the duplicate elements from the array.
import java.util.Scanner;
public class RemoveDuplicateElementsFromArray{
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
  public static int removeDuplicate(int arr[])
  {
    int n = arr.length;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]==arr[j])
        {
          /*for(int k=j;k<n;k++)//Shifting the values to left.
          {
            arr[k]=arr[k+1];
          }*/
          arr[j] = arr[n-1]; //This will exchange the values with the least one.
          j--;
          n--;
        }
      }
    }
    return n;
  }
  public static void displayFinalArray(int arr[], int n)
  {
    System.out.println("Final Array After Removing Duplicate Elements  : ");
    for(int i=0;i<n;i++)
    {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    int arr[] = readArr();
    int n = removeDuplicate(arr);
    System.out.println("The Size of Final Array is : "+n);
    displayFinalArray(arr,n);
  }
}
