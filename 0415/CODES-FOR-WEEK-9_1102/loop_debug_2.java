import java.util.Scanner;
public class loop_debug_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=7,i=0, s=0;
    System.out.println("��J���n,�DS=1*2*3*.........*n\n");	
    while (n>=1) {
    System.out.print("��J���(-1:end)�G");		
    n = input.nextInt();
    for(i=1;i<=n;++i)
       s=s*i;
    System.out.println("1*2*3*...*"+n+"="+s);
   }//while
  }//main
}//class
