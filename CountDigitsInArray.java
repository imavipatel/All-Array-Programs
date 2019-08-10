// WAP count how many digits in the array (digits not number).
import java.util.Scanner;
public class CountDigitsInArray{
  public static void main(String[] args) {
    int arr[] = readArr();
    int count = countDigitsInArray(arr);
    System.out.println("The total number of Digits in the Array is : "+count);
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static int countDigitsInArray(int arr[])
  {
    int count=0;
    System.out.println("Digits in the array is : ");
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>=0&&arr[i]<=9)
      {
        System.out.println(arr[i]);
        count++;
      }
    }
    return count;
  }
}
