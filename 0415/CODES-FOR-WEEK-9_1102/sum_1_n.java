import java.util.Scanner;

public class sum_1_n {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=0;
    System.out.println("輸入整數n,求S=1+2+3+.........+n\n");	
    System.out.print("(1-while)輸入整數：");		
    n = input.nextInt();
    int i=0,s=0;
    while (i<=n) {
       s=s+i;
       i++;}
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(2-while)輸入整數：");		
    n = input.nextInt();
    i=0;s=0;
    while (i<n) {
       i++;
       s=s+i; }
    System.out.println("1+2+...+"+n+"="+s);
    System.out.println("===================");
   
    for(i=0, s=0;i<=n;s=s+i, i++) 
       ;

    System.out.println("1+2+...+"+n+"="+s);
    for(i=1, s=1;i<=n;s=s*i, i++) 
       ;

    System.out.println("1*2*...*"+n+"="+s);
   }//main
 }//class
