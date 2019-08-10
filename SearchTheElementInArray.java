//WAP to define a method to search an element in the array.
import java.util.Scanner;
public class SearchTheElementInArray{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the elements you want to find : ");
    int ele = sc.nextInt();
    int eleIndex = searchTheElementInArray(arr,ele);
    System.out.println("Your element index is : "+eleIndex);
  }
  public static int searchTheElementInArray(int arr[], int ele)
  {
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==ele)
      {
        return i;
      }
    }
    return -1;
  }
}
