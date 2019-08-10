//WAP to read array elements from the user and define a method to return the average of n elements.
import java.util.Scanner;
public class AverageOfArrayUsingMethod{
  public static int averageofNumber(int arr[])
  {
    int sum = 0;
    for(int i=0;i<arr.length;i++)
    {
      sum=sum+arr[i];
    }
    int avg = sum/arr.length;
    return avg;
    //System.out.println("The average of entered element is : "+avg);
  }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    System.out.println("Enter the "+n+" Elements in Array : ");
    int arr[] = new int[n];
    //for(int i=0;i<n;i++)
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    int avg = averageofNumber(arr);
    System.out.println("The average of entered element is : "+avg);
  }
}
