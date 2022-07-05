import java.util.Scanner;
public class evennumber_1b {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    System.out.print("块计");
    int n = input.nextInt();
    if (n%2==0) 
       System.out.println(n+"琌案计!");
    else
       System.out.println(n+"琌计!");   
    if (n%2==1)
       System.out.println(n+"琌计!");
    else
       System.out.println(n+"琌案计!");
    if (!(n%2==0)) 
       System.out.println(n+"琌计!");
    else
       System.out.println(n+"琌案计!");  
    if (n%2!=0) 
       System.out.println(n+"琌计!");
    else
       System.out.println(n+"琌案计!");  
    if (!(n%2==1))
       System.out.println(n+"琌案计!");
    else
       System.out.println(n+"琌计!");
    if (n%2!=1)
       System.out.println(n+"琌案计!");
    else
       System.out.println(n+"琌计!");
//=========================
    System.out.println("(n%2==0):"+(n%2==0));
    System.out.println("(n%2==1):"+(n%2==1));
    System.out.println("(!(n%2==0)):"+(!(n%2==0)));
    System.out.println("(!(n%2==1)):"+(!(n%2==1)));
    System.out.println("(n%2!=0):"+(n%2!=0));
    System.out.println("(n%2!=1):"+(n%2!=1));

  }
}