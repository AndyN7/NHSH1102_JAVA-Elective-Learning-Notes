import java.util.Scanner;
public class loop_debug_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=7,i=0, s=0;
    System.out.println("輸入奇數n,求S=1+3+5+.........+n\n");	
    while (n>=1) {
    System.out.print("輸入奇數(-1:end)：");		
    n = input.nextInt();
    if (n%2==0) {
      System.out.println("輸入錯誤，須為奇數!");      
      continue;}
    for(i=1;i<=n;++i)
       s=s+i;
    System.out.println("1+3+5+...+"+n+"="+s);
   }//while
 
	}//main
}//class
