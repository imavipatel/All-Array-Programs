//WAP in java to take some number from user and store in array and return the largest number from the array.
import java.util.Scanner;
public class LargestNumberInArray{
  public static void largestNumber(int arr[])
  {
    int largest = arr[0];
    for(int i=0;i<arr.length;i++)
    {
      if(largest<arr[i])
      {
        largest=arr[i];
      }
    }
    System.out.println("The Largest Number in Array is : "+largest);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    largestNumber(arr);
  }
}
