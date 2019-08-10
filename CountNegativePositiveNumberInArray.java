//WAP to count and display how many negative and positive numbers present in your array.
import java.util.Scanner;
public class CountNegativePositiveNumberInArray{
  public static void countNegativePositive(int arr[])
  {
    int neg=0,pos=0,zero=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>0)
      {
        pos++;
      }
      else if (arr[i]<0)
      {
        neg++;
      }
      else
      {
        zero++;
      }
    }
    System.out.println("The Count of Postive Number is : "+pos);
    System.out.println("The Count of Negative Number is : "+neg);
    System.out.println("The Count zero is : "+zero);
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
    countNegativePositive(arr);
  }
}
