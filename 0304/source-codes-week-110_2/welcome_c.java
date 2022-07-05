mport java.util.*; 
public class welcome_c{ 
public static void main(String args[]){ 
  System.out.print("Please input your name:");
  Scanner sca = new Scanner(System.in);//產生Scanner物件 
  String name = sca.next();
  System.out.println("welcome "+name+"!!");
 }//main()
}//class