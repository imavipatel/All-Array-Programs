//WAP to first and second biggest element from the array without sorting
import java.util.Scanner;
public class LargestAndSecondLargestNumberInArray2{
  public static int largestAndSecondLargest(int arr[], int n)
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
      if(count==n)
      return arr[i];
    }
    return -1;
  }
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
    int largest = largestAndSecondLargest(arr,0);
    int secondlargest = largestAndSecondLargest(arr,1);
    int thirdlargest = largestAndSecondLargest(arr,2);
    System.out.println("The Largest element in array is : "+largest);
    System.out.println("The second largest element in array is : "+secondlargest);
    System.out.println("The third largest element in array is : "+thirdlargest);
  }
  }
