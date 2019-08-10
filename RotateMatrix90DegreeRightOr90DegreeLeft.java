/*WAP to rotate the matrix 90 Degree left or right.
 1 2 3
 4 5 6
 7 8 9
90 Degree Right
 7 4 1
 8 5 2
 9 6 3
90 Degree Left
 3 6 9
 2 5 8
 1 4 7
 */
import java.util.Scanner;
public class RotateMatrix90DegreeRightOr90DegreeLeft{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mat[][] = readMatrix();
    System.out.println("The user Entered matrix is : ");
    displayMatrix(mat);
    transposeOfMatrix(mat);
    System.out.println("The transpose matrix is : ");
    displayMatrix(mat);
    System.out.println("Press 1 to rotate 90 Degree Right : ");
    System.out.println("Press 2 to rotate 90 Degree Left : ");
    int n = sc.nextInt();
    if(n==1)
    {
      System.out.println("After rotating 90 degree right the matrix is : ");
      rotate90DegreeRight(mat);
      displayMatrix(mat);
    }
    else if(n==2)
    {
      System.out.println("After rotating 90 degree left the matrix is : ");
      rotate90DegreeLeft(mat);
      displayMatrix(mat);
    }
    else
    {
      System.out.println("Wrong choice! Please Enter valid number.");
    }
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
  for(int i=0;i<mat.length;i++)
  {
    for(int j=0;j<mat[i].length;j++)
    {
      System.out.print(mat[i][j]+" ");
    }
    System.out.println();
  }
}
public static void rotate90DegreeRight(int mat[][])
{
  reverseRows(mat);
}
public static void rotate90DegreeLeft(int mat[][])
{
  reverseColumn(mat);
}
public static void transposeOfMatrix(int mat[][])
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
public static int[][] reverseRows(int mat[][])
{
  for(int i=0;i<mat.length;i++)
  {
    for(int j=0;j<mat[i].length/2;j++)
    {
      int temp = mat[i][j];
      mat[i][j] = mat[i][mat[i].length-j-1];
      mat[i][mat[i].length-j-1]=temp;
    }
  }
  return mat;
}
public static int[][] reverseColumn(int mat[][])
{
  for(int i=0;i<mat.length/2;i++)
  {
    for(int j=0;j<mat[i].length;j++)
    {
      int temp = mat[i][j];
      mat[i][j] = mat[mat[i].length-i-1][j];
      mat[mat[i].length-i-1][j] = temp;
    }
  }
  return mat;
}
}
