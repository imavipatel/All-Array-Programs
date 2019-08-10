//WAP to count and display how many negative and positive numbers present in your array.
import java.util.Scanner;
public class CountNegativePositiveNumberInArray1{
  public static int[] countNegativePositive(int arr[])
  {
    int count[] = new int[3];
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>0)
      {
        count[0]++;
      }
      else if (arr[i]<0)
      {
        count[1]++;
      }
      else
      {
        count[2]++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements in the Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    int count[]=countNegativePositive(arr);
    System.out.println("The Count of Postive Number is : "+count[0]);
    System.out.println("The Count of Negative Number is : "+count[1]);
    System.out.println("The Count of zero is : "+count[2]);
  }
}
