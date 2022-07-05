import java.util.*; 
import java.util.Scanner;
public class welcome_c{ 
public static void main(String args[]){ 
  Scanner input; //宣告
  input = new Scanner(System.in);//產生Scanner物件 
  System.out.print("Please input your name:");
  String namea;//宣告ONLY ONE TIME
  namea = input.next();
  System.out.println("welcome "+namea+"!!");
 }//main()
}//class