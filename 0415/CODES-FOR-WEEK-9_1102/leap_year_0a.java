import java.util.Scanner;
//閏年:閏年是比普通年分多出一段時間的年分
public class leap_year_0a {

public static void main(String[] args) {
  String status;	
  System.out.println("==========歡迎==========");
  Scanner input = new Scanner(System.in);
  int year=2000;
    System.out.print("輸入公元年：");
    year = input.nextInt();

    if (year%400==0) 
	status = "閏年(leap year)!";
    else if (year%100==0)
	status = "平年(common year)!";
    else if (year%4==0) 
	status = "閏年(leap year)!";
    else
	status = "平年(common year)!";
    if (year>=0)
        System.out.println("你輸入：公元"+year+"年，是 "+status);
  System.out.println("==========bye==========");
  }//main
}//class
