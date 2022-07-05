import java.util.Scanner;

public class sum_odd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=0;
    System.out.println("輸入整數n,求S=1+3+.........+n\n");	
    System.out.print("(1-while)輸入整數：");		
    n = input.nextInt();
    int i=1,s=0;
    while (i<=n) {
       s=s+i;
       i=i+2;}
    System.out.println("1+3+...+"+n+"="+s);

    System.out.print("(2-while)輸入整數：");		
    n = input.nextInt();
    i=1;s=1;
    while (i<n) {
       i=i+2;
       s=s+i; }
    System.out.println("1+3+...+"+n+"="+s);
    System.out.println("===================");
    for(i=1,s=0;i<=n;i=i+2) 
       s=s+i;
    System.out.println("1+3+...+"+n+"="+s);
   }//main
 }//class
