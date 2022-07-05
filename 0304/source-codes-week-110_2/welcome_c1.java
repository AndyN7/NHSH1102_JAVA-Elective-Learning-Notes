import java.util.*; 
public class welcome_c1{ 
public static void main(String args[]){ 
  System.out.print("Please input your name輸入姓名:");
  Scanner ipt; 
  ipt =new Scanner(System.in);//產生Scanner物件 
  String name1;
   name1= ipt.next();

  System.out.println("welcome "+name1+"!!");
 }//main()
}//class