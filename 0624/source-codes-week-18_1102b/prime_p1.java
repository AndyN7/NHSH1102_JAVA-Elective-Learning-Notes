import java.util.Scanner;
public class prime_p1 {
 static Scanner input = new Scanner(System.in);
 public static void main(String[] args) {
   int n=3;
   System.out.println("輸入>=2整數，判斷是否為質數?\n");
   while (n>2) {
     System.out.print("輸入>=2整數：");		
     n = input.nextInt();
     if (n<=0) break;
     processprime(n);
  }//while
	}//main

static boolean judgeprime(int n3) {
    boolean prime1=true;
    int i=2;
    while (i*i<=n3) {
      if (n3%i==0) {prime1=false; break;}     
      ++i;    
       } 
    return(prime1);
}
static void processprime(int n2){
    boolean prime2=judgeprime(n2);
    String dif=(prime2)?"是質數!":"不是質數!";
    System.out.println(n2+dif); 
}
}//class