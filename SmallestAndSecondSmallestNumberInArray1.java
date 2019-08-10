//WAP to first and second smallest element from the array without sorting
import java.util.Scanner;
public class SmallestAndSecondSmallestNumberInArray1{
  public static void smallestAndSecondSmallest(int arr[])
  {
    int temp;
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]>arr[j])
        {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println("The smallest Number in the Array is : "+arr[0]);
    System.out.println("The Second smallest Number in the Array is : "+arr[1]);
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
    smallestAndSecondSmallest(arr);
  }
}
