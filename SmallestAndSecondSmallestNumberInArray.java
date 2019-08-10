//WAP to first and second smallest element from the array without sorting
import java.util.Scanner;
public class SmallestAndSecondSmallestNumberInArray{
  public static void smallestAndSecondSmallest(int arr[])
  {

    int smallest = Integer.MAX_VALUE;
    int secondsmallest = Integer.MAX_VALUE;
    /*if(arr.length<2)
    {
      System.out.println("The size of array is too Short enter greater than 2");
      return ;
    }*/
    for(int i=0;i<arr.length;i++)
    {
      if(smallest>arr[i])
      {
        secondsmallest = smallest;
        smallest = arr[i];
      }
      else if(secondsmallest>arr[i]&&smallest!=arr[i])
      {
        secondsmallest = arr[i];
      }
    }
    //if(secondsmallest==Integer.MAX_VALUE)
    //System.out.println("There is no second smallest element.");
    //else
    //System.out.println("The "+smallest+" is the smallest number and "+secondsmallest+" is the second smallest number.");
    System.out.println("The smallest Number in the Array is : "+smallest);
    System.out.println("The Second smallest Number in the Array is : "+secondsmallest);
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
