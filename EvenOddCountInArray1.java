//WAP to define a method to return how many even and odd numbers in the passed array.
import java.util.Scanner;
public class EvenOddCountInArray1{
  public static int evenOddCount(int arr[])
  {
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2==0)
      {
        count++;
      }
    }
    return count;
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
    int count = evenOddCount(arr);
    System.out.println("The Number of even elements is : "+count);
    System.out.println("The Number of odd elements is : "+(n-count));
  }
}
