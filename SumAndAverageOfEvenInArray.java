// WAP to calculate the sum and average of the even element of the array.
import java.util.Scanner;
public class SumAndAverageOfEvenInArray{
  public static void main(String[] args) {
    int arr[] = readArr();
    sumAndAverageOfEvenInArray(arr);
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size Of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static void sumAndAverageOfEvenInArray(int arr[])
  {
    int sum=0,count=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]%2==0)
      {
        sum = sum+arr[i];
        count++;
      }
    }
    System.out.println("The sum of Even Number in Array is : "+sum);
    int avg = sum/count;
    System.out.println("The average of Even Number int Array is : "+avg);
  }
}
