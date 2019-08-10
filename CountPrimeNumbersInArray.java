// WAP to count how many prime numbers in the array.
import java.util.Scanner;
public class CountPrimeNumbersInArray{
  public static void main(String[] args) {
    int arr[] = readArr();
    int prime[] = countPrimeNumbersInArray(arr);
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static boolean isPrime(int n)
  {
    for(int i=2;i<=n/2;i++)
    {
      if(n%i==0)
      return false;
    }
    return true;
  }
  public static int[] countPrimeNumbersInArray(int arr[])
  {
    int n = arr.length;
    int count=0;
    System.out.println("Prime Number are : ");
    for(int i=0;i<n;i++)
    {
      if(isPrime(arr[i]))
      {
        System.out.println(arr[i]);
        count++;
      }
    }
    System.out.println("Total Numbers Of Prime Numbers are : "+count);
    return arr;
  }
}
