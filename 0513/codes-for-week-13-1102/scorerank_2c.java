import java.util.Scanner;
public class scorerank_2c {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int score = 0; String rank="";
    while (score>=0) {
      System.out.print("��J����(���>=0)�G");
      score = input.nextInt();
      if (score<0) 
         {System.out.print("Bye\n");break;}
      //100~90�u 89~80�� 79~70�A 69~60�� 59~0�B
      if (score<=100 && score>=0) {
      switch ((10-(score)/10) { //(100-score)/10 not good
	case 0:
	case 1:
		rank="�u";
		break;//��������,break switch�P�_;
	case 2:
		rank="��");
		break;
	case 3:
		rank="�A");
		break;
	case 4:	
		rank="��");
		break;
	case 3:
        default:
		rank="�B");
		break;
		    } //switch
       }
    else
        System.out.print("�W�L�d��\n");
    System.out.print("���ġG"+rank+"\n");
	}//while
  }//main
}//class