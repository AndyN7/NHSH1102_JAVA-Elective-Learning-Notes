import java.util.Scanner;

public class scorerank_1_loop {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int score = 90;
   while (score>=0) {
        System.out.print("輸入分數(整數)：");
        score = input.nextInt();
	if (score<=100 && score>=90) 
		System.out.println("等第：優\n");
	else if (score <90 && score >= 80)
		System.out.println("等第：甲\n");
	else if (score <80 && score >= 70)
		System.out.println("等第：乙\n");
	else if (score <70 && score >= 60)
		System.out.println("等第：丙\n");
	else if (score <60 && score >= 50)
		System.out.println("等第：丁\n");
	else if (score <50 && score >= 40)
		System.out.println("等第：戊\n");
	else if (score <40 && score >= 30) 
		System.out.println("等第：己\n");
	else if (score <30 && score >= 20)
		System.out.println("等第：庚\n");
	else if (score <20 && score >= 10) {
		System.out.println("等第：辛\n");
	else if (score <10 && score >0)
		System.out.println("等第：壬\n");
	else if (score == 0) 
		System.out.println("等第：癸\n");
	//若不符和上面區間，告知"無法判讀"
	else
		System.out.println("無法判讀，BYE!\n");
     }//while
   }//main
 }//class
