import java.util.Scanner;

public class scorerank_1_loop {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int score = 90;
   while (score>=0) {
        System.out.print("��J����(���)�G");
        score = input.nextInt();
	if (score<=100 && score>=90) 
		System.out.println("���ġG�u\n");
	else if (score <90 && score >= 80)
		System.out.println("���ġG��\n");
	else if (score <80 && score >= 70)
		System.out.println("���ġG�A\n");
	else if (score <70 && score >= 60)
		System.out.println("���ġG��\n");
	else if (score <60 && score >= 50)
		System.out.println("���ġG�B\n");
	else if (score <50 && score >= 40)
		System.out.println("���ġG��\n");
	else if (score <40 && score >= 30) 
		System.out.println("���ġG�v\n");
	else if (score <30 && score >= 20)
		System.out.println("���ġG��\n");
	else if (score <20 && score >= 10) {
		System.out.println("���ġG��\n");
	else if (score <10 && score >0)
		System.out.println("���ġG��\n");
	else if (score == 0) 
		System.out.println("���ġG��\n");
	//�Y���ũM�W���϶��A�i��"�L�k�PŪ"
	else
		System.out.println("�L�k�PŪ�ABYE!\n");
     }//while
   }//main
 }//class
