//WAP in java define a method to return the biggest element in the matrix.
import java.util.Scanner;
public class BiggestElementInMatrix
{
  public static void main(String[] args) {
    int mat[][] = readMatrix();
    displayMatrix(mat);
    int big = biggestElementInMatrix(mat);
    System.out.println("The biggest element in the matrix is : "+big);
  }
  public static int[][] readMatrix()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows you want : ");
    int r = sc.nextInt();
    System.out.println("Enter the number of column you want : ");
    int c = sc.nextInt();
    int mat[][] = new int[r][c];
    System.out.println("Enter the "+r*c+" elements row wise : ");
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        mat[i][j] = sc.nextInt();
      }
    }
    return mat;
  }
  public static void displayMatrix(int mat[][])
  {
    System.out.println("The user entered matrix is : ");
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static int biggestElementInMatrix(int mat[][])
  {
    int big = mat[0][0];
    for(int i = 0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        if(mat[i][j]>big)
        {
          big = mat[i][j];
        }
      }
    }
    return big;
  }
}
