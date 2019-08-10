public class TwoDimensionArray{
  public static void main(String[] args) {
    int arr[][] = {{5,6,7,8},{7,9,3},{4,3,2,1}};
    System.out.println(arr);
    System.out.println(arr.length);
    System.out.println(arr[0].length);
    System.out.println(arr[1].length);
    System.out.println(arr[arr.length-2].length);
    System.out.println(arr[0][0]);
    System.out.println(arr[arr.length-1][0]);
    System.out.println("-------------------");
    int x[][];
    x = new int[][]{{3,4,5},{4,8,6,4},{7,9}};
    System.out.println(x[1][0]);
    System.out.println(x[1][x[1].length-1]);
    for(int i=0; i<x.length;i++)
    {
      for(int j=0;j<x[i].length;j++)
      {
        System.out.print(x[i][j]+" ");
      }
      System.out.println();
    }
  }
}
