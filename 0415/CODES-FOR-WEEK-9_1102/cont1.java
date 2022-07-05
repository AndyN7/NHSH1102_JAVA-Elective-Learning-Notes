import java.util.Scanner;
public class cont1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=7,i=0, s=0;
    while (n>=1) {
    System.out.print("輸入奇數(-1:end)：");		
    n = input.nextInt();
    if (n%2==0) {
      System.out.println("輸入錯誤，須為奇數!"); 
      //n=-1;     
      continue;}
    if (n<=-1)  break;
   }//while
     System.out.println("bye===");
	}//main
}//class