//WAP to define a method to display the pair of elements who’s sum is equal to n.
import java.util.*;
public class PairSumEqualToN{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the sum you want : ");
    int sum = sc.nextInt();
    System.out.println("The all Pair of Sum Equal to n is : ");
    pairSumEqualToN(arr,sum);
    System.out.println("The all pair of sum equal to n is : ");
    pairSumEqualToN1(arr,sum);
  }
  public static void pairSumEqualToN(int arr[], int sum)
  {
    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]+arr[j]==sum)
        {
          System.out.println(arr[i]+","+arr[j]);
        }
      }
    }
  }
  public static void pairSumEqualToN1(int arr[],int sum)
  {
    Set <Integer> mySet = new HashSet<>();
    for(int i=0;i<arr.length;i++)
    {
      if(mySet.contains(arr[i]))
      {
        System.out.println(+(sum-arr[i])+","+arr[i]);

      }
      mySet.add(sum-arr[i]);
    }
  }
}
