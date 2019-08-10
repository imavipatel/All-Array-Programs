import java.util.Scanner;
public class DoubleTheSizes{
  public static int[] readArr(){
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
  public static void displayArray(int arr[])
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
  public static int doubleTheSizes(int arr[], int num)
  {
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==num)
      {
        num = num*2;
      }
    }
    return num;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = readArr();
    System.out.println("Displaying the Array : ");
    displayArray(arr);
    System.out.println();
    System.out.println("Enter the number you want to double : ");
    int num = sc.nextInt();
    int max = doubleTheSizes(arr,num);
    System.out.println("The maximum number is : "+max);
  }
}
