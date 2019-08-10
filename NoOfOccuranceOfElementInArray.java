import java.util.Scanner;
public class NoOfOccuranceOfElementInArray{
  public static void main(String[] args) {
    int arr[] = readArr();
    noOfOccuranceOfElementInArray(arr);
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" Elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static void noOfOccuranceOfElementInArray(int arr[])
  {
    int n = arr.length;
    for(int i=0;i<n;i++)
    {
      int count = 1;
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]==arr[j])
        {
          count++;
          arr[j]=arr[n-1];
          n--;
          j--;
        }
      }
      System.out.println("No of Occurance of Element "+arr[i]+" is : "+count+" times.");
    }
  }
}
