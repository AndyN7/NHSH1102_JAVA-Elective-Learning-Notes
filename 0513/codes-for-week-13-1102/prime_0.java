import java.util.Scanner;
public class prime_0 {
 static Scanner input = new Scanner(System.in);
 public static void main(String[] args) {
   System.out.println("====��J>=2��ơA�P�_�O�_�����?=====");
   int n=3, i;
   String dif;
   //boolean prime;
    int prime;
    System.out.print("��J>=2��ơG");		
    n = input.nextInt();
    i=2;
    //prime=true;
    prime=0;
    while (i<=n-1) {
      if (n%i==0) 
         {prime=1; //prime=false;
          System.out.println(n+"�i�Q"+i+"�㰣�C");
          break;}  
      else
          System.out.println(n+"���i�Q"+i+"�㰣�C"); 
      ++i;    
       }   
    if (prime==0) dif="�O���!";
    else       dif="���O���!";
    System.out.println(n+dif);   
	}//main
}//class