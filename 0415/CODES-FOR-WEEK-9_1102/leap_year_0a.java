import java.util.Scanner;
//�|�~:�|�~�O�񴶳q�~���h�X�@�q�ɶ����~��
public class leap_year_0a {

public static void main(String[] args) {
  String status;	
  System.out.println("==========�w��==========");
  Scanner input = new Scanner(System.in);
  int year=2000;
    System.out.print("��J�����~�G");
    year = input.nextInt();

    if (year%400==0) 
	status = "�|�~(leap year)!";
    else if (year%100==0)
	status = "���~(common year)!";
    else if (year%4==0) 
	status = "�|�~(leap year)!";
    else
	status = "���~(common year)!";
    if (year>=0)
        System.out.println("�A��J�G����"+year+"�~�A�O "+status);
  System.out.println("==========bye==========");
  }//main
}//class
