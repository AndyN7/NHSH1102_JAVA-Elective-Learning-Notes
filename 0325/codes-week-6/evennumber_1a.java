import java.util.Scanner;
public class evennumber_1a {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    System.out.print("輸入數值：");
    int n = input.nextInt();
    if (n%2==0) 
       System.out.println(n+"是偶數!");
    else
       System.out.println(n+"是奇數!");   
    if (n%2==1)
       System.out.println(n+"是奇數!");
    else
       System.out.println(n+"是偶數!");
    if (!(n%2==0)) 
       System.out.println(n+"是奇數!");
    else
       System.out.println(n+"是偶數!");   
    if (!(n%2==1))
       System.out.println(n+"是偶數!");
    else
       System.out.println(n+"是奇數!");
    if (n%2!=1)
       System.out.println(n+"是偶數!");
    else
       System.out.println(n+"是奇數!");
//=========================
    System.out.println("(n%2==0):"+(n%2==0));
    System.out.println("(n%2==1):"+(n%2==1));
    System.out.println("(!(n%2==0)):"+(!(n%2==0)));
    System.out.println("(!(n%2==1)):"+(!(n%2==1)));
  }
}