import java.util.Scanner;
public class leap_year_0b {
public static void main(String[] args) {
  String status;	
  System.out.println("==========�w��==========");
  Scanner input = new Scanner(System.in);
  int year=2000;
    System.out.print("��J�����~�G");
    year = input.nextInt();
    if (year%400==0) 
	status = "�|�~(leap year)!";
    else if (year%100!=0)
     {
      if (year%4==0) 
	status = "�|�~(leap year)!";
      else //can be omitted
	status = "���~(common year)!"; //can be omitted
	}
    else
	status = "���~(common year)!";
    if (year>=0)
        System.out.println("�A��J�G����"+year+"�~�A�O "+status);
     else 
        System.out.println("�A��J���~!");
  System.out.println("==========bye==========");
  }//main
}//class