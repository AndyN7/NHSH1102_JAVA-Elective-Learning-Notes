import java.util.Scanner;
public class loop_debug_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=7,i=0, s=0;
    System.out.println("��J�_��n,�DS=1+3+5+.........+n\n");	
    while (n>=1) {
    System.out.print("��J�_��(-1:end)�G");		
    n = input.nextInt();
    if (n%2==0) {
      System.out.println("��J���~�A�����_��!");      
      continue;}
    for(i=1;i<=n;++i)
       s=s+i;
    System.out.println("1+3+5+...+"+n+"="+s);
   }//while
 
	}//main
}//class
