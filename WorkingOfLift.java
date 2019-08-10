// WAP to read ‘n’ people’s weights based on that display lift is working or not. Max capacity of your lift is 800kg.
import java.util.Scanner;
public class WorkingOfLift{
  public static int workingOfLift(int arr[])
  {
    int sum = 0;
    for(int i=0;i<arr.length;i++)
    {
      sum=sum+arr[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of person in Lift : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the Weigth of "+n+" Person : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    int sum = workingOfLift(arr);
    if(sum<800)
    System.out.println("Lift is Working Properly.");
    else
    System.out.println("Lift is Overloaded.");
  }
}
