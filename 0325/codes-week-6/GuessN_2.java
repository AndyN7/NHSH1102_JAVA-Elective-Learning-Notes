import java.security.SecureRandom;
import java.util.Scanner;

public class GuessN_2 {
  public static void main(String[] args) {
		
    SecureRandom sr = new SecureRandom();
    Scanner input = new Scanner(System.in);
		
    int a = 0;
    int b = 0;
    a = sr.nextInt(100)+1;
    
    System.out.print("�q�Ʀr(1~100)�G");
    b = input.nextInt();
    if (a!= b) { //nested if
	if (a > b)
	   System.out.println("�q���Ӥp�o\n");
	else
	   System.out.println("�q���Ӥj�o\n");

        System.out.println("�üƬ�"+a);       
	} //if
    else 
        System.out.println("���߲q��!");
	}//main
}//class
