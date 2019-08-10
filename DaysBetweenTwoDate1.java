//WAP to calculate the number of days between two dates.
import java.util.Scanner;
class DaysBetweenTwoDate1{
  int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
  int dd,mm,yy;
  Date(int dd, int mm, int yy)
  {
    this.dd = dd;
    this.mm = mm;
    this.yy = yy;
    if(yy%400==0||yy%4==0&&yy%100!=0)
    month[2] = 29;
  }
  int noOfDays()
  {
    int day=dd;
    for(int i=1;i<mm;i++)
    {
      day = day+month[i];
    }
    int y = yy-1;
    day = day+(y*365);
    day = day+(y/400+y/4-y/100);
    return day;
  }
  public String toString()
  {
    return dd+"/"+mm+"/"+yy;
  }
}
class MainDate{
  static Date readDate()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Date(dd mm yyyy)");
    int d = sc.nextInt();
    int m = sc.nextInt();
    int y = sc.nextInt();
    return new Date(d,m,y);
  }
  public static void main(String[] args) {
    System.out.println("Enter the first Date : ");
    Date d1 = readDate();
    System.out.println("Enter the second date : ");
    Date d2 = readDate();
    System.out.println("From Date : "+d1);
    System.out.println("To Date : "+d2);
    int days = d2.noOfDays()-d1.noOfDays();
    System.out.println("No of Days between these two dates : "+days);
  }
}
