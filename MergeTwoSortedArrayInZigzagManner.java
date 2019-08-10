// WAP to merge two array element in zigzag manner.
import java.util.Scanner;
public class MergeTwoSortedArrayInZigzagManner{
  public static int[] zigZagArray(int a[], int b[])
  {
    int c[] = new int[a.length+b.length];
    int i=0,j=0,k=0;
    for(i=0;i<c.length;)
    {
      if(j<a.length && k<b.length)
      {
        c[i]=a[j];
        j++;
        i++;
        c[i]=b[k];
        k++;
        i++;
      }
      if(j<a.length)
      {
        c[i]=a[j];
        j++;
        i++;
      }
      if(k<b.length)
      {
        c[i]=b[k];
        k++;
        i++;
      }
  }
  return c;
}
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static void main(String[] args) {
    int a[] = readArr();
    int b[] = readArr();
    int c[] = zigZagArray(a,b);
    System.out.print("The zigzag array is : ");
    for(int i=0;i<c.length;i++)
    {
      System.out.print(c[i]+" ");
    }
  }
}
