import java.util.Scanner;

public class gcd_2 {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int n1=1, n2=1, gcd=1, i=2;
   System.out.println("��J���n1 & n2,����۰��k:�DGCD(n1, n2) and LCM(n1, n2)");
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
    int t,m,n; 
    m=n1; n=n2;
    do {
        t=m%n; m=n; n=t;
        } while (n!=0);
    gcd=m;
    System.out.println("����۰��k: GCD("+n1+","+n2+")="+gcd);
    System.out.println("����۰��k: LCM("+n1+","+n2+")="+n1*n2/gcd);

    //show the process of ����۰��k
    m=n1; n=n2;
    do {
        System.out.println("�Q����"+m+"���H����"+n+"�o�l��"+m%n);
        System.out.println("�Q�����ܬ�"+n+",�����ܬ�"+m%n);
        t=m%n; m=n; n=t;
        if (t==0)
          System.out.println("�����ܬ�"+t+",����۰��k�w����");
        } while (n!=0);
    gcd=m;
    System.out.println("����۰��k: GCD("+n1+","+n2+")="+gcd);
    System.out.println("����۰��k: LCM("+n1+","+n2+")="+n1*n2/gcd);



   System.out.println("\n��J���n1 & n2,����۴�k:�DGCD(n1, n2) and LCM(n1, n2)");   
   m=n1; n=n2;
   while (m!=n) {   
        while (m>n)  m=m-n;      
        while (m<n)  n=n-m;  }    
   gcd=m;
   System.out.println("����۴�k: GCD("+n1+","+n2+")="+gcd);
   System.out.println("����۴�k: LCM("+n1+","+n2+")="+n1*n2/gcd+"\n");

   //show the process of ����۴�k
   m=n1; n=n2;
   while (m!=n) {   
        while (m>n) {
           System.out.println(m+">"+n+":�Q���"+m+"����"+n+" ��"+(m-n)); 
           m=m-n;   }   
        while (m<n)  {
           System.out.println(m+"<"+n+":�Q���"+n+"����"+m+" ��"+(n-m)); 
           n=n-m; }
     }  
   if (m==n) System.out.println(m+"=="+n+":�p�G�Q���"+m+"==���"+n+", gcd="+m); 
   gcd=m;
   System.out.println("����۴�k: GCD("+n1+","+n2+")="+gcd);
   System.out.println("����۴�k: LCM("+n1+","+n2+")="+n1*n2/gcd);

   }//while 
	}//main
}//class
