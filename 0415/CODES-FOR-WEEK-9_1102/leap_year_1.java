import java.util.Scanner;
//�|�~:�|�~�O�񴶳q�~���h�X�@�q�ɶ����~��
public class leap_year_1 {

public static void main(String[] args) {
  String status;	
  System.out.println("==========�w��==========");
  Scanner input = new Scanner(System.in);
  int year=2000;
  while (year>=0) {  
    System.out.print("��J�����~(-1:����)�G");
    year = input.nextInt();
    if (year == -1) break;
    if ((year%4==0 && year%100!=0)|| year%400==0) {
	status = "�|�~(leap year)!";
	}
    else
	status = "���~(common year)!";
    if (year>=0)
        System.out.println("�A��J�G����"+year+"�~�A�O "+status);
  }//while
  System.out.println("==========bye==========");
  }//main
}//class