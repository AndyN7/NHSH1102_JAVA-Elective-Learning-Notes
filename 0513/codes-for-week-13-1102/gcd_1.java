import java.util.Scanner;

public class gcd_1 {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int n1=1, n2=1, gcd=1, i=2;
   System.out.println("��J���n1 & n2,�DGCD(n1, n2) and LCM(n1, n2)\n");
   while (true) {
    gcd=1; i=2;
    System.out.print("��J���n1�G");		
    n1 = input.nextInt();
    System.out.print("��J���n2�G");		
    n2 = input.nextInt();
    if (n1<1 || n2<1) {
      System.out.println("bye!!");
      break;
     }
    while (i<=n1 && i<=n2) {
      if (n1%i==0 && n2%i==0) gcd=i;
       i++;} //while
    System.out.println("1-while: GCD("+n1+","+n2+")="+gcd);
    System.out.println("1-while: LCM("+n1+","+n2+")="+n1*n2/gcd);

    gcd=1; i=2;
     do {
       if (n1%i==0 && n2%i==0) gcd=i;
       i++;} while (i<=n1 && i<=n2);
    System.out.println("2-do while: GCD("+n1+","+n2+")="+gcd);
    
    for(gcd=1, i=2;(i<=n1 && i<=n2);i++) 
       if (n1%i==0 && n2%i==0) gcd=i;
    System.out.println("3-for: GCD("+n1+","+n2+")="+gcd+"\n");

    //show the process of obtaining GCD
    gcd=1; i=2;
    while (i<=n1 && i<=n2) {
      if (n1%i==0 && n2%i==0) {
        System.out.println(n1+" and "+n2+"��Q"+i+"�㰣,so �ثegcd�אּ"+i);
        gcd=i;}
       i++;} //while
    System.out.println("1-while: GCD("+n1+","+n2+")="+gcd);
    System.out.println("1-while: LCM("+n1+","+n2+")="+n1*n2/gcd);

   }//while 
	}//main
}//class
