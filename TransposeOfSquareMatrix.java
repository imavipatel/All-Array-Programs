//WAP in java to define a method to transpose the square matrix.
import java.util.Scanner;
public class TransposeOfSquareMatrix{
  public static void main(String[] args) {
    int mat[][] = readMatrix();
    System.out.println("The User Entered Matrix is  : ");
    displayMatrix(mat);
    transposeOfSquareMatrix(mat);
    System.out.println("After transposing the final matrix is : ");
    displayMatrix(mat);
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
  public static void transposeOfSquareMatrix(int mat[][])
  {
    for(int i=0;i<mat.length;i++)
    {
      for(int j=i+1;j<mat[i].length;j++)
      {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }
    }
  }
}
