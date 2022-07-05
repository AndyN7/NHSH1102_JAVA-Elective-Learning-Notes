import java.util.Scanner;

public class gcd_2 {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int n1=1, n2=1, gcd=1, i=2;
   System.out.println("輸入整數n1 & n2,輾轉相除法:求GCD(n1, n2) and LCM(n1, n2)");
   while (true) {
    gcd=1; i=2;
    System.out.print("輸入整數n1：");		
    n1 = input.nextInt();
    System.out.print("輸入整數n2：");		
    n2 = input.nextInt();
    if (n1<1 || n2<1) {
      System.out.println("bye!!");
      break;
     }
    int t,m,n; 
    m=n1; n=n2;
    do {
        t=m%n; m=n; n=t;
        } while (n!=0);
    gcd=m;
    System.out.println("輾轉相除法: GCD("+n1+","+n2+")="+gcd);
    System.out.println("輾轉相除法: LCM("+n1+","+n2+")="+n1*n2/gcd);

    //show the process of 輾轉相除法
    m=n1; n=n2;
    do {
        System.out.println("被除數"+m+"除以除數"+n+"得餘數"+m%n);
        System.out.println("被除數變為"+n+",除數變為"+m%n);
        t=m%n; m=n; n=t;
        if (t==0)
          System.out.println("除數變為"+t+",輾轉相除法已完成");
        } while (n!=0);
    gcd=m;
    System.out.println("輾轉相除法: GCD("+n1+","+n2+")="+gcd);
    System.out.println("輾轉相除法: LCM("+n1+","+n2+")="+n1*n2/gcd);



   System.out.println("\n輸入整數n1 & n2,輾轉相減法:求GCD(n1, n2) and LCM(n1, n2)");   
   m=n1; n=n2;
   while (m!=n) {   
        while (m>n)  m=m-n;      
        while (m<n)  n=n-m;  }    
   gcd=m;
   System.out.println("輾轉相減法: GCD("+n1+","+n2+")="+gcd);
   System.out.println("輾轉相減法: LCM("+n1+","+n2+")="+n1*n2/gcd+"\n");

   //show the process of 輾轉相減法
   m=n1; n=n2;
   while (m!=n) {   
        while (m>n) {
           System.out.println(m+">"+n+":被減數"+m+"減掉減數"+n+" 剩"+(m-n)); 
           m=m-n;   }   
        while (m<n)  {
           System.out.println(m+"<"+n+":被減數"+n+"減掉減數"+m+" 剩"+(n-m)); 
           n=n-m; }
     }  
   if (m==n) System.out.println(m+"=="+n+":如果被減數"+m+"==減數"+n+", gcd="+m); 
   gcd=m;
   System.out.println("輾轉相減法: GCD("+n1+","+n2+")="+gcd);
   System.out.println("輾轉相減法: LCM("+n1+","+n2+")="+n1*n2/gcd);

   }//while 
	}//main
}//class
