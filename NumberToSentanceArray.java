//WAP to display the enter number in the form of sentence.
import java.util.Scanner;
public class NumberToSentanceArray{
  public static String one[] = {"","One","Two","Three","Four","Five","Six",
  "Seven","Eight","Nine","Ten ","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
public static String two[] = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};

public static void numToWord(int n, String s)
{
  if(n<20)
  {
    System.out.print(one[n]);
  }
  else
  {
    System.out.print(two[n/10]+one[n%10]+" ");
  }
  if(n!=0)
  {
    System.out.print(s+" ");
  }
}

public static void main(String[] args)
{
  NumberToSentanceArray nw = new NumberToSentanceArray();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number : ");
  int n = sc.nextInt();
  numToWord(n/10000000%100," Crore ");
  numToWord(n/100000%100," Lakh ");
  numToWord(n/1000%100," Thousand ");
  numToWord(n/100%10," Hundred ");
  numToWord(n%100," ");
}
}
