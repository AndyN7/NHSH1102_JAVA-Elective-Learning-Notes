import java.util.Scanner;
public class true_false{
  public static void main(String args[]){ 
   Scanner input = new Scanner(System.in);    
   System.out.print("¿é¤J¼Æ­È¡G");
   int n = input.nextInt(); 
   System.out.println("(n%2==0):"+ (n%2==0) );
   System.out.println("(n%2==1):"+ (n%2==1) );
   System.out.println("(!(n%2==0)):"+ (!(n%2==0)) );
   System.out.println("(!(n%2==1)):"+ (!(n%2==1)));
   boolean logic;
   logic=n%2==0; //logic=(n%2==0);
   System.out.println("after (n%2==0),  logic is " + logic); 
   int n1=9, n2=9;
   logic=(!(n1==n2));
   System.out.println("after (!(n1==n2)),  logic is " + logic);
   logic=(n1!=n2);
   System.out.println("after (n1!=n2),  logic is " + logic);


              
      }
}