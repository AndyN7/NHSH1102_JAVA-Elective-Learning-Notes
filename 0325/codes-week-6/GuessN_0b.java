import java.util.*;

public class GuessN_0b {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();		
    int a, b;
    a = random.nextInt(100)+1;

    System.out.print("猜數字(1~100)：");
    b = input.nextInt();
    if (a == b) {
       System.out.println("恭喜猜對!");
	}
    else if (a > b)
	System.out.println("猜的太小囉\n");
    else
	System.out.println("猜的太大囉\n");
	
     System.out.println("亂數為"+a);
	}//main
}//class
