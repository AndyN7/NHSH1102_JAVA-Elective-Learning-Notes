import java.util.Scanner;
public class prime_1 {
 static Scanner input = new Scanner(System.in);
 public static void main(String[] args) {
   System.out.println("輸入>=2整數，判斷是否為質數?\n");
   int n=3, i;
   String dif;
   boolean prime;
   while (n>2) {
    System.out.print("輸入>=2整數：");		
    n = input.nextInt();
    if (n<=0) break;
    i=2;
    prime=true;
    while (i*i<=n) {
      if (n%i==0) {prime=false; break;}     
      ++i;    
       }   
    dif=(prime)?"是質數!":"不是質數!";
    System.out.println(n+dif);   
    }//while
	}//main
}//class