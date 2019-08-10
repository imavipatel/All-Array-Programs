// WAP to merge two sorted array in the sorted form.
import java.util.Scanner;
public class MergeTwoSortedArrayInSortedForm{
  public static int[] mergedArray(int a[],int b[])
  {
    int c[] = new int[a.length+b.length];
    int i=0,j=0,k=0;
    for(i=0;i<c.length;i++)
    {
      if(j<a.length && k<b.length)
      {
        if(a[j]<b[k])
        {
          c[i]=a[j];
          j++;
        }
        else
        {
          c[i]=b[k];
          k++;
        }
      }
      else if(j<a.length)
      {
        c[k]=a[j];
        j++;
      }
      else
      {
        c[i]=b[k];
        k++;
      }
    }
    return c;
  }
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" sorted elements of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static void main(String[] args) {
    int a[] = readArr();
    int b[] = readArr();
    int c[] = mergedArray(a,b);
    System.out.print("The Sorted Merged Array is : ");
    for(int i=0;i<c.length;i++)
    {
      System.out.print(c[i]+" ");
    }
  }
}
