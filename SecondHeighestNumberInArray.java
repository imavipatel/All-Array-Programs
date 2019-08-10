/*
Mrs. Sofia as imported container of shoes. The container has different size of shoes and needs to know the second highest shoes
size in the container. Could you help Sofia by writing a method to find the second highest size of shoes in the container?
*/
import java.util.Scanner;
public class SecondHeighestNumberInArray{
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static int secondHeighestNumberInArray(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      int count = 0;
      for(int j=0;j<arr.length;j++)
      {
        if(arr[i]<arr[j])
        {
          count++;
        }
      }
      if(count==1)
      return arr[i];
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = readArr();
    int secondHeighest = secondHeighestNumberInArray(arr);
    System.out.println("The Second Heighest Elements in the Array is : "+secondHeighest);
  }
}
