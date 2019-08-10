//WAP to define a method to return how many even and odd numbers in the passed array.
import java.util.Scanner;
public class EvenOddCountInArray{
  public static void evenOddCount(int arr[])
  {
    int evencount=0,oddcount=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2==0)
        evencount++;
      else
        oddcount++;
    }
    System.out.println("The Count of Even number is : "+evencount);
    System.out.println("The Count of Odd number is : "+oddcount);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements in Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    evenOddCount(arr);
  }
}
