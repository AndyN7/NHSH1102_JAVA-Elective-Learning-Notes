import java.util.Scanner;
public class scorerank_2c {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int score = 0; String rank="";
    while (score>=0) {
      System.out.print("輸入分數(整數>=0)：");
      score = input.nextInt();
      if (score<0) 
         {System.out.print("Bye\n");break;}
      //100~90優 89~80甲 79~70乙 69~60丙 59~0丁
      if (score<=100 && score>=0) {
      switch ((10-(score)/10) { //(100-score)/10 not good
	case 0:
	case 1:
		rank="優";
		break;//結束執行,break switch判斷;
	case 2:
		rank="甲");
		break;
	case 3:
		rank="乙");
		break;
	case 4:	
		rank="丙");
		break;
	case 3:
        default:
		rank="丁");
		break;
		    } //switch
       }
    else
        System.out.print("超過範圍\n");
    System.out.print("等第："+rank+"\n");
	}//while
  }//main
}//class