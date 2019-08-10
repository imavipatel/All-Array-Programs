//WAP in java to define a method to transpose the matrix.
import java.util.Scanner;
public class TransposeOfMatrix{
  public static void main(String[] args) {
    int mat[][] = readMatrix();
    System.out.println("The User Entered Matrix is  : ");
    displayMatrix(mat);
    int transpose[][] = transposeOfMatrix(mat);
    System.out.println("After transposing the final matrix is : ");
    displayMatrix(transpose);
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
    //System.out.println("The User Entered Matrix is  : ");
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static int[][] transposeOfMatrix(int mat[][])
  {
    int transpose[][] = new int[mat[0].length][mat.length];
    for(int i=0;i<mat.length;i++)
    {
      for(int j=0;j<mat[i].length;j++)
      {
        transpose[j][i] = mat[i][j];
      }
    }
    return transpose;
  }
}
