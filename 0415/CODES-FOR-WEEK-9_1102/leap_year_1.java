import java.util.Scanner;
//閏年:閏年是比普通年分多出一段時間的年分
public class leap_year_1 {

public static void main(String[] args) {
  String status;	
  System.out.println("==========歡迎==========");
  Scanner input = new Scanner(System.in);
  int year=2000;
  while (year>=0) {  
    System.out.print("輸入公元年(-1:結束)：");
    year = input.nextInt();
    if (year == -1) break;
    if ((year%4==0 && year%100!=0)|| year%400==0) {
	status = "閏年(leap year)!";
	}
    else
	status = "平年(common year)!";
    if (year>=0)
        System.out.println("你輸入：公元"+year+"年，是 "+status);
  }//while
  System.out.println("==========bye==========");
  }//main
}//class