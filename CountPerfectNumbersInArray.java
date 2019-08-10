//WAP to define a method to return how many perfect numbers are there in the array.
import java.util.Scanner;
public class CountPerfectNumbersInArray{
  public static void main(String[] args) {
    int arr[] = readArr();
    int count = countPerfectNumbersInArray(arr);
    System.out.println("The Numbers of Perfect Number in the Array is : "+count);
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size Of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static boolean isPerfect(int n)
  {
    int sum=0;
    for(int i=1;i<n-1;i++)
    {
      if(n%i==0)
      {
        sum = sum+i;
      }
    }
    if(sum==n)
    return true;
    else
    return false;
  }
  public static int countPerfectNumbersInArray(int arr[])
  {
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
      if(isPerfect(arr[i]))
      {
        count++;
      }
    }
    return count;
  }
}
