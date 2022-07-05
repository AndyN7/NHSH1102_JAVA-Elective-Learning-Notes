import java.util.Scanner;

public class factor_1 {
  public static void main(String[] args) {
    int [] z=new int[100];
   Scanner input = new Scanner(System.in);
   int n1=1, i=2, fac1=2;
    System.out.println("因數分析");
   while (true) {
     System.out.print("輸入整數n：");		
     n1 = input.nextInt();
     if (n1<=1) break;
     fac1=2; i=0;
     while (fac1<=n1) {
        if (n1%fac1==0)  {
            z[i]=fac1;    i++;}
        fac1++;  }//internal while
     for(int j=0;j<i;j++) System.out.print(z[j]+"  ");
     System.out.print("\n");
     for(int j=0;j<i;j++) z[j]=0;
        }//outlayer of while
   System.out.print("bye!!");
	}//main
}//class