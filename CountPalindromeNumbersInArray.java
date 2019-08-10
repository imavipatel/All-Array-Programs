// WAP to define a method to return how many palindrome are there in the array.
import java.util.Scanner;
public class CountPalindromeNumbersInArray{
  public static void main(String[] args) {
    int arr[] = readArr();
    int count = countPalindromeNumbersInArray(arr);
    System.out.println("The Palindrome Numbers present in Array is : "+count);
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Size Of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static int isReverse(int n)
  {
    int rem,rev=0;
    while(n!=0)
    {
      rem = n%10;
      rev = rev*10+rem;
      n = n/10;
    }
    return rev;
  }
  public static int countPalindromeNumbersInArray(int arr[])
  {
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
      int j = isReverse(arr[i]);
      if(arr[i]==j)
      {
        count++;
      }
    }
    return count;
  }
}
