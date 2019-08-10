//WAP to first and second smallest element from the array without sorting
import java.util.Scanner;
public class SmallestAndSecondSmallestNumberInArray2{
  public static int smallestAndSecondSmallest(int arr[], int n)
  {
    for(int i=0;i<arr.length;i++)
    {
      int count=0;
      for(int j=0;j<arr.length;j++)
      {
        if(arr[i]>arr[j])
        {
          count++;
        }
      }
      if(count==n)
      return arr[i];
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    int smallest = smallestAndSecondSmallest(arr,0);
    int secondsmallest = smallestAndSecondSmallest(arr,1);
    System.out.println("The smallest element in array is : "+smallest);
    System.out.println("The second smallest element in array is : "+secondsmallest);
  }
}
