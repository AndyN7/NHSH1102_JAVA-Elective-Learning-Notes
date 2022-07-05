import java.security.SecureRandom;
import java.util.Scanner;
public class GuessN_a {
  public static void main(String[] args) {	
    SecureRandom sr;
    Scanner input = new Scanner(System.in);		
    int a = 0;
    int b = 0;
    sr = new SecureRandom();
    a = sr.nextInt(100)+1;
    System.out.print("猜數字(1~100)：");
    b = input.nextInt();
    if (a == b) 
       System.out.println("恭喜猜對!");
    else
       System.out.println("猜錯囉\n");
	
     System.out.println("亂數為"+a);
	}//main
}//class
