import java.util.Scanner;
public class prime_1 {
 static Scanner input = new Scanner(System.in);
 public static void main(String[] args) {
   System.out.println("��J>=2��ơA�P�_�O�_�����?\n");
   int n=3, i;
   String dif;
   boolean prime;
   while (n>2) {
    System.out.print("��J>=2��ơG");		
    n = input.nextInt();
    if (n<=0) break;
    i=2;
    prime=true;
    while (i*i<=n) {
      if (n%i==0) {prime=false; break;}     
      ++i;    
       }   
    dif=(prime)?"�O���!":"���O���!";
    System.out.println(n+dif);   
    }//while
	}//main
}//class