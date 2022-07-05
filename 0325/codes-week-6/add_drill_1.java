import java.security.SecureRandom;
import java.util.Scanner;

public class GuessN_3 {
  public static void main(String[] args) {
		
   SecureRandom sr = new SecureRandom();
   Scanner input = new Scanner(System.in);
		
   int a = 0;
   int b = 100;
   a = sr.nextInt(100)+1;
   while (b>0) {
    System.out.print("猜數字(1~100)：");
    b = input.nextInt();
    if (a!= b) { //nested if
	if (a > b)
	   System.out.println("猜的太小囉");
	else
	   System.out.println("猜的太大囉");
        //System.out.println("亂數為"+a);       
	} //if
    else {
        System.out.println("對!\n");
        a = sr.nextInt(100)+1;
      }
     }//while
	}//main
}//class