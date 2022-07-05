import java.util.Scanner;
public class sum0fsquare {
  public static void main(String[] args) {
    int n=5, i=0, s=0;
    Scanner input = new Scanner(System.in);
    while (n>=1){
        i=s=0;
        System.out.print("1.輸入整數n:");
        n=input.nextInt();
        if (n<=0) break;
        while (i<n) {
             i++;            
             s=s+i*i;
             if (i!=n)
                 System.out.print(i*i+"+");
             else 
                 System.out.print(i*i);
           }
         System.out.print("="+s+"\n");
        //=============================
        i=s=0;
        System.out.print("2.輸入整數n:");
        n=input.nextInt();
        if (n<=0) break;
         do {
             i++;            
             s=s+i*i;
             if (i!=n)
                 System.out.print(i*i+"+");
             else 
                 System.out.print(i*i);
           } while (i<n);
         System.out.print("="+s+"\n");
      }
    System.out.println("bye=====");

  }
}