import java.util.*; 

public class input_int_a{ 
public static void main(String args[]){ 
  System.out.print("Please input 3-digit decimal:");
  Scanner ipt = new Scanner(System.in);//產生Scanner物件 
  int nn = ipt.nextInt();
  if (nn<100 && nn>999)
      System.out.println("你輸入資料不是三位數!!");   
  else
    {
     int n1=nn%10;
     int n2=nn/10;
     System.out.print("You input nn="+nn+"; first digit="+n1+";");
     System.out.println("higher digit="+n2);
   }


 }//main()
}//class