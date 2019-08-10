//WAP to first and second biggest element from the array without sorting
import java.util.Scanner;
public class LargestAndSecondLargestNumberInArray{
  public static void largestAndSecondLargest(int arr[])
  {
    int largest = 0;
    int secondlargest = 0;
    for(int i=0;i<arr.length;i++)
    {
      if(largest<arr[i])
      {
        secondlargest = largest;
        largest = arr[i];
      }
      else if(secondlargest<arr[i])
      {
        secondlargest = arr[i];
      }
    }
    System.out.println("The largest Number in the Array is : "+largest);
    System.out.println("The Second Largest Number in the Array is : "+secondlargest);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    largestAndSecondLargest(arr);
  }
}
