import java.util.*; 

public class input_int{ 
public static void main(String args[]){ 
  System.out.print("Please input a 3-digit decimal:");
  Scanner ipt = new Scanner(System.in);//產生Scanner物件 
  int nn = ipt.nextInt();
  int n1=nn%10;
  int n2=(int)nn/10;
  System.out.print("You input nn="+nn+"; first digit="+n1+";");
  System.out.println("higher digit="+n2);

 }//main()
}//class