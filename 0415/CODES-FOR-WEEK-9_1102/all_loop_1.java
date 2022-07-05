import java.util.Scanner;

public class all_loop_1 {
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

    System.out.print("(3-while)輸入整數：");		
    n = input.nextInt();
    i=1;s= 0;
    while (i<=n) {
       if (i<n)
         System.out.print(i+"+");
       else
          System.out.print(i+"="); 
       s=s+i;
       i++;}
    System.out.println(s);

    System.out.print("(4-for)輸入整數：");		
    n = input.nextInt();
    s= 0;
    for(i=1;i<=n;++i)
       s=s+i;
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(5-for)輸入整數：");		
    n = input.nextInt();
    s= 0;i=1;
    for(;i<=n;s=s+i,++i)
       ;
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(6-for)輸入整數：");		
    n = input.nextInt();
    s= 0;i=1;
    for(;i<=n;s=s+(i++));
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(7-for)輸入整數：");		
    n = input.nextInt();
    s= 0;i=1;
    for(;i<=n;s=s+(++i));
    System.out.println("1+2+...+"+n+"="+s);


    System.out.print("(8. 公式)輸入整數：");		
    n = input.nextInt();
    s= ((1+n)*n)/2;
    System.out.println("1+2+...+"+n+"="+s);


    System.out.print("(9-do while)輸入整數：");		
    n = input.nextInt();
    i=1;
    s=0;
     do {
       s=s+i;
       i++;
       }while (i<=n);
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(10-do while)輸入整數：");		
    n = input.nextInt();
    i=1;
    s=1;
     do {
       i++;
       s=s+i;
       }while (i<n);
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(11-do while)輸入整數：");		
    n = input.nextInt();
    i=1;
    s=0;
     do {
       s=s+i;
       i+=2;
       }while (i<=n);
    System.out.println("1+3+...+"+n+"="+s);

    System.out.print("(12-do while)輸入整數：");		
    n = input.nextInt();
    i=1;
    s=1;
     do {
       i+=2;
       s=s+i;
       }while (i<n);
    System.out.println("1+3+...+"+n+"="+s);

	}//main
}//class
