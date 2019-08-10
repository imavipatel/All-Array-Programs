//WAP in java Define a method to find the missing the element of Array with in the range.
import java.util.Scanner;
public class FindTheMissingElementInArray{
  public static void main(String[] args) {
    int arr[] = readArr();
    int num = findTheMissingElementInArray(arr);
    System.out.println("The missing element in array is : "+num);
  }
  public static int findTheMissingElementInArray(int arr[])
  {
    int n = arr.length+1;
    n = n*(n+1)/2;
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
      sum=sum+arr[i];
    }
    return n-sum;
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
}
