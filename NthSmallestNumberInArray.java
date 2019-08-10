// WAP to define a method to return nth smallest element.
import java.util.Scanner;
public class NthSmallestNumberInArray{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = readArr();
    System.out.println("Enter the n value to find the Nth Smallest Number In Array : ");
    int n = sc.nextInt();
    int nth = nthSmallestNumberInArray(arr,n);
    if(nth==-1)
    System.out.println("Invalid Input");
    else
    System.out.println("The "+n+" Smallest Number In Array is : "+nth);
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static int nthSmallestNumberInArray(int arr[], int n)
  {
    for(int i=0;i<arr.length;i++)
    {
      int count=0;
      for(int j=0;j<arr.length;j++)
      {
        if(arr[i]<arr[j])
        {
          count++;
        }
      }
      if(count==arr.length-n)
      return arr[i];
    }
    return -1;
  }
}
