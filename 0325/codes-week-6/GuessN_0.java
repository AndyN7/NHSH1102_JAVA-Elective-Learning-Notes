import java.security.SecureRandom;
import java.util.Scanner;

public class GuessN_0 {
  public static void main(String[] args) {
		
    SecureRandom sr = new SecureRandom();
    Scanner input = new Scanner(System.in);
		
    int a = 0;
    int b = 0;
    a = sr.nextInt(100)+1;

    System.out.print("猜數字(1~100)：");
    b = input.nextInt();
    if (a == b) 
       System.out.println("恭喜猜對!");
    else if (a > b)
	System.out.println("猜的太小囉\n");
    else
	System.out.println("猜的太大囉\n");
	
     System.out.println("亂數為"+a);
	}//main
}//class
