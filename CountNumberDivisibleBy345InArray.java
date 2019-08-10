// WAP check how many numbers are divisible by 4,3and 5 in the array
import java.util.Scanner;
public class CountNumberDivisibleBy345InArray{
  public static void main(String[] args) {
    int arr[] = readArr();
    int count3 = countNumberDivisibleBy345InArray(arr,3);
    int count4 = countNumberDivisibleBy345InArray(arr,4);
    int count5 = countNumberDivisibleBy345InArray(arr,5);
    System.out.println("Count of Number divisible by 3 : "+count3);
    System.out.println("Count of Number divisible by 4 : "+count4);
    System.out.println("Count of Number divisible by 5 : "+count5);
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static int countNumberDivisibleBy345InArray(int arr[],int n)
  {
    int count = 0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%n==0)
      {
        count++;
      }
    }
    return count;
  }
}
