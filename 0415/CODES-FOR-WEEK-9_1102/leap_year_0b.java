import java.util.Scanner;
public class leap_year_0b {
public static void main(String[] args) {
  String status;	
  System.out.println("==========歡迎==========");
  Scanner input = new Scanner(System.in);
  int year=2000;
    System.out.print("輸入公元年：");
    year = input.nextInt();
    if (year%400==0) 
	status = "閏年(leap year)!";
    else if (year%100!=0)
     {
      if (year%4==0) 
	status = "閏年(leap year)!";
      else //can be omitted
	status = "平年(common year)!"; //can be omitted
	}
    else
	status = "平年(common year)!";
    if (year>=0)
        System.out.println("你輸入：公元"+year+"年，是 "+status);
     else 
        System.out.println("你輸入錯誤!");
  System.out.println("==========bye==========");
  }//main
}//class