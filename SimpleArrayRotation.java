import java.util.Scanner;
public class SimpleArrayRotation{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" elements of array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the number of times you want to rotate the array : ");
    int r = sc.nextInt();
    /*int output[] = simpleArrayRotation(arr,n,r);
    System.out.println("The rotated array is : ");
    for(int i=0;i<output.length;i++)
    {
      System.out.print(output[i]+" ");
    }*/
    simpleArrayRotation1(arr,n,r);
  }
  /*public static int[] simpleArrayRotation(int arr[],int n, int r)
  {
    int output[] = new int[n];
    for(int i=r-1; i>=0;i--)
    {
      output[n-(r-i)] = arr[i];
    }
    for(int i=0;i<n-r;i++)
    {
      output[i]=arr[r+i];
    }
    return output;
  }
  */
  public static void simpleArrayRotation1(int arr[],int n, int r)
  {
    for(int i=0;i<n;i++)
    {
      final int index = (i+r)%n;
      System.out.print(arr[index]+" ");
    }
  }
}
