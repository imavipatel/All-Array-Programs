// WAP to insert and array in the existing array to the specified index.
import java.util.Scanner;
public class InsertAnArrayInArrayAtSpecifiedIndex1{
  public static int[] readArr()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the "+n+" element of Array : ");
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    return arr;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = readArr();
    int arr1[] = readArr();
    System.out.println("Enter the specified index at which you want to insert the Array : ");
    int ind = sc.nextInt();
    int arr2[] = insertAnArrayInArrayAtSpecifiedIndex1(arr,arr1,ind);
    displayArray(arr2);
  }
  public static void displayArray(int arr2[])
  {
    System.out.println("The final Array After Inserting the Array At specified index is : ");
    for(int i=0;i<arr2.length;i++)
    {
      System.out.println(arr2[i]);
    }
  }
  public static int[] insertAnArrayInArrayAtSpecifiedIndex1(int arr[],int arr1[],int ind)
  {
    int arr2[] = new int[arr.length+arr1.length];
    if(ind<0||ind>arr.length)
    {
      System.out.println("Sorry! Wrong Index, Please enter a valid Index.");
      return arr;
    }
    for(int i=0;i<arr.length;i++)
    {
      if(i<ind)
        arr2[i] = arr[i];
      else
        arr2[i+arr1.length]=arr[i];
      }
      for(int i=0;i<arr1.length;i++)
      {
        arr2[ind+i]=arr1[i];
      }
    return arr2;
  }
}


































































/*public class Avc{
  public  static int[] insert(int a[], int b[], int in)
  {
    if(in<0||in>a.length)
    {
      System.out.println("Insertion is not possible");
      return a;
    }
    int na[]=new int[a.length+b.length];
    for(int i=0;i<a.length;i++)
    {
      if(i<in)
      {
        na[i]=a[i];
        else
        na[i+b.length]=a[i];
      }
      for(int i=0;i<b.length;i++)
      {
        na[in+i]=b[i];
      }

    }
    return na;
  }
}
  */
