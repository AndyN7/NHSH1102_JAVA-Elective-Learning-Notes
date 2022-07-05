import java.util.*; 
public class welcome_D{ 
public static void main(String args[]){ 
  Scanner input = new Scanner(System.in);//產生Scanner物件 
  //System.out.println("Please input your name:");
 System.out.print("Please input your name:");

  String name = input.next();
  System.out.print("Please input your age:");
  int age;//宣告 
  age= input.nextInt();
  System.out.println("Nice to meet you, "+name+"!!");
  //System.out.print("\n你的年齡: "+age+5+"歲."); 
  age=age+5; 
  System.out.print("\n五年後你的年齡: "+age+"歲.");
 }//main()
}//class