import java.util.Scanner;
public class prime_0 {
 static Scanner input = new Scanner(System.in);
 public static void main(String[] args) {
   System.out.println("====輸入>=2整數，判斷是否為質數?=====");
   int n=3, i;
   String dif;
   //boolean prime;
    int prime;
    System.out.print("輸入>=2整數：");		
    n = input.nextInt();
    i=2;
    //prime=true;
    prime=0;
    while (i<=n-1) {
      if (n%i==0) 
         {prime=1; //prime=false;
          System.out.println(n+"可被"+i+"整除。");
          break;}  
      else
          System.out.println(n+"不可被"+i+"整除。"); 
      ++i;    
       }   
    if (prime==0) dif="是質數!";
    else       dif="不是質數!";
    System.out.println(n+dif);   
	}//main
}//class