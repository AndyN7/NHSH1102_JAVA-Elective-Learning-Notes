import java.util.Scanner;

public class sum_odd_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=1;
    while (n>=1) {
    System.out.println("輸入整數n,求S=1+3+.........+n\n");	
    n = input.nextInt();
    //if (n<=0) System.exit(-1);
    if (n<=0)  break;

    System.out.print("(1-do  while)輸入整數：");		
    n = input.nextInt();
    if (n<=0) System.exit(-1);
    int i=1,s=0;
     do {
       s=s+i;
       i=i+2;}while (i<=n);
    System.out.println("1+3+...+"+n+"="+s);

    System.out.print("(2-do  while)輸入整數：");		
    n = input.nextInt();
    i=1;s=1;
    do {
       i=i+2;
       s=s+i; } while (i<n);
    System.out.println("1+3+...+"+n+"="+s);
    System.out.println("===================");
    for(i=1,s=0;i<=n;i+=2) 
       s+=i; //s=s+i;
    System.out.println("1+3+...+"+n+"="+s);

    int x=1, y=1;
    do {
       System.out.println("enter into loop body!!");    
       System.out.println("(x<y)=="+(x<y));       
      } while (x<y);
    System.out.println("(x<y)=="+(x<y)); 
     } //while
   System.out.println("bye"); 
   }//main
 }//class
