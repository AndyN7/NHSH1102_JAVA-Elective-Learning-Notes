import java.util.Scanner;

public class all_loop_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=0;
    System.out.println("��J���n,�DS=1+2+3+.........+n\n");	
    System.out.print("(1-while)��J��ơG");		
    n = input.nextInt();
    int i=0,s=0;
    while (i<=n) {
       s=s+i;
       i++;}
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(2-while)��J��ơG");		
    n = input.nextInt();
    i=0;s=0;
    while (i<n) {
       i++;
       s=s+i; }
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(3-while)��J��ơG");		
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

    System.out.print("(4-for)��J��ơG");		
    n = input.nextInt();
    s= 0;
    for(i=1;i<=n;++i)
       s=s+i;
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(5-for)��J��ơG");		
    n = input.nextInt();
    s= 0;i=1;
    for(;i<=n;s=s+i,++i)
       ;
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(6-for)��J��ơG");		
    n = input.nextInt();
    s= 0;i=1;
    for(;i<=n;s=s+(i++));
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(7-for)��J��ơG");		
    n = input.nextInt();
    s= 0;i=1;
    for(;i<=n;s=s+(++i));
    System.out.println("1+2+...+"+n+"="+s);


    System.out.print("(8. ����)��J��ơG");		
    n = input.nextInt();
    s= ((1+n)*n)/2;
    System.out.println("1+2+...+"+n+"="+s);


    System.out.print("(9-do while)��J��ơG");		
    n = input.nextInt();
    i=1;
    s=0;
     do {
       s=s+i;
       i++;
       }while (i<=n);
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(10-do while)��J��ơG");		
    n = input.nextInt();
    i=1;
    s=1;
     do {
       i++;
       s=s+i;
       }while (i<n);
    System.out.println("1+2+...+"+n+"="+s);

    System.out.print("(11-do while)��J��ơG");		
    n = input.nextInt();
    i=1;
    s=0;
     do {
       s=s+i;
       i+=2;
       }while (i<=n);
    System.out.println("1+3+...+"+n+"="+s);

    System.out.print("(12-do while)��J��ơG");		
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
