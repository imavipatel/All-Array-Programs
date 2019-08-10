//WAP in java to take some number from user and store in array and return the smallest number from the array.
import java.util.Scanner;
public class SmallestNumberInArray{
  public static void smallestNumber(int arr[])
  {
    int smallest=arr[0];
    for(int i=0;i<arr.length;i++)
    {
      if(smallest>arr[i])
      {
        smallest=arr[i];
      }
    }
    System.out.println("The smallest number is : "+smallest);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" element of array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    smallestNumber(arr);
  }
}
