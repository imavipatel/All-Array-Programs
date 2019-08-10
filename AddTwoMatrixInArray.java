//WAP in java define a method to add two matrix int Array.
import java.util.Scanner;
public class AddTwoMatrixInArray{
  public static void main(String[] args) {
    int x[][] = readMatrix();
    int y[][] = readMatrix();
    int z[][] = addTwoMatrixInArray(x,y);
    displayMatrix(z);
  }
  public static int[][] readMatrix(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows you want : ");
    int r = sc.nextInt();
    System.out.println("Enter the number of column you want : ");
    int c = sc.nextInt();
    int mat[][] = new int[r][c];
    System.out.println("Enter "+r*c+" elements row wise : ");
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        mat[i][j]=sc.nextInt();
      }
    }
    return mat;
  }
  public static void displayMatrix(int z[][])
  {
    System.out.println("The Addition of two matrix is : ");
    for(int i=0;i<z.length;i++)
    {
      for(int j=0;j<z[i].length;j++)
      {
        System.out.print(z[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static int [][] addTwoMatrixInArray(int x[][], int y[][])
  {
    if(x.length!=y.length||x[0].length!=y[0].length)
    {
      System.out.println("Addition is not possible!, Rows and columns must be same.");
      return null;
    }
    int z[][] = new int[x.length][x[0].length];
    for(int i=0;i<x.length;i++)
    {
      for(int j=0;j<x[i].length;j++)
      {
        z[i][j] = x[i][j]+y[i][j];
      }
    }
    return z;
  }
}
