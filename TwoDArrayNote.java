2-D ARRAY
/*
int a[][];
int [][]a;
int[][] a;
int mat[][];
mat=new int[3][2];     (3->number of rows, 2->number of elements in each row.)

mat[1][1]=456;
SOP(“Number of rows:”+mat.length);
SOP(“Number of elements in 1st row:”+mat[0].length);
SOP(“Number of elements in 2nd row:”+mat[1].length);
SOP(“Number of elements in 2nd row:”+mat[mat.length-1].length);


1. It allocates the continuous memory for 2-D array.
2.Default value will be 0 at any index.

Index Value Address
00     0     8000
01     0     8004
10     0     8008
11    456    8012
20     0     8016
21     0     8020

int a[][]={ {23,64,23},{56,78,89,20},{56,78} }
 for(int i=0;i<a.length;i++)
 {
   for(int j=0;j<a[i].length;j++)
  {
    SOPrint(ar[i][j];
  }
  SOPrintln();
}

In following questions I have made a separate class for Matrix Input() and Matrix Output().
I have made object in each of the following question to read and display the Matrix.

This is the following class for which object is created in following question.

*/
import java.util.Scanner;
public class Matrix {
  void displayMatrix(int mat[][])
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
  int[][] readMatrix()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows you want : ");
    int r=sc.nextInt();
    System.out.println("Enter the number of column you want : ");
    int c=sc.nextInt();
    System.out.println("Enter the "+r*c+" elements row wise : ");
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    return arr;
  }
}
