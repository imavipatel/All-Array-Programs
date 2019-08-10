//WAP to calculate the sum and average of n element.
 import java.util.Scanner;
 public class SumAndAverageOfArray{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double sum=0,avg;
     System.out.println("Enter the number of Elements : ");
     //System.out.println("Enter the size of Array : ");
     int n = sc.nextInt();
     double arr [] = new double[n];
     System.out.println("Enter the Elements : ");
     for(int i=0;i<arr.length;i++)
     {
       arr[i]=sc.nextDouble();
       sum=sum+arr[i];
     }
     avg = sum/n;
     System.out.println("The Sum of Elements is : "+sum);
     System.out.println("The Average of Elements is : "+avg);
   }
 }
