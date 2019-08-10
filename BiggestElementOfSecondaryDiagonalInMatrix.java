//WAP in java to define a method to return the biggest element of Secondary diagonal in matrix.
import java.util.Scanner;
public class BiggestElementOfSecondaryDiagonalInMatrix{
  public static void main(String[] args) {
    int mat[][] = readMatrix();
    displayMatrix(mat);
    int big = biggestElementOfSecondaryDiagonalInMatrix(mat);
    System.out.println("The biggest element of Secondary Diagonal In Matrix is : "+big);
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
  public static int biggestElementOfSecondaryDiagonalInMatrix(int mat[][])
  {
    int big = mat[0][mat[0].length-1];
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        if(i+j==mat.length-1)
        {
          if(mat[i][j]>big)
          {
            big = mat[i][j];
          }
        }
      }
    }
    return big;
  }
}
