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
    System.out.print("�q�Ʀr(1~100)�G");
    b = input.nextInt();
    if (a == b) 
       System.out.println("���߲q��!");
    else
       System.out.println("�q���o\n");
	
     System.out.println("�üƬ�"+a);
	}//main
}//class
