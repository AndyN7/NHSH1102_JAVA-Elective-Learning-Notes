import java.util.*;

public class GuessN_0b {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();		
    int a, b;
    a = random.nextInt(100)+1;

    System.out.print("�q�Ʀr(1~100)�G");
    b = input.nextInt();
    if (a == b) {
       System.out.println("���߲q��!");
	}
    else if (a > b)
	System.out.println("�q���Ӥp�o\n");
    else
	System.out.println("�q���Ӥj�o\n");
	
     System.out.println("�üƬ�"+a);
	}//main
}//class
