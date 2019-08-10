// WAP to create the duplicate of existing array.
 import java.util.Scanner;
 public class DuplicateOfExistingArray{
   public static void main(String[] args) {
     int arr[] = readArr();
     int arrcopy[] = duplicateOfExistingArray(arr);
     displayArr(arrcopy);
   }
   public static int[] readArr()
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Size Of Array : ");
     int n = sc.nextInt();
     int arr[] = new int[n];
     System.out.println("Enter the "+n+" Elements of Array : ");
     for(int i=0;i<n;i++)
     {
       arr[i] = sc.nextInt();
     }
     return arr;
   }
   public static int[] duplicateOfExistingArray(int arr[])
   {
     int arrcopy[] = new int[arr.length];
     for(int i=0;i<arr.length;i++)
     {
       arrcopy[i]=arr[i];
     }
     return arrcopy;
   }
   public static void displayArr(int arrcopy[])
   {
     System.out.println("The Duplicate array is : ");
     for(int i=0;i<arrcopy.length;i++)
     {
       System.out.println(arrcopy[i]);
     }
   }
 }
