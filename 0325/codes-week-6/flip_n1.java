import java.util.*; 

public class flip_n1{ 
public static void main(String args[]){ 
  System.out.print("Please input a decimal:");
  Scanner ipt = new Scanner(System.in);//產生Scanner物件 
  int n= ipt.nextInt();
  int orig=n, fn=0, n1=0;
  while (n>=10)
  {
    n1=n%10;
    n=n/10;
    fn=(fn+n1)*10;
  }
  fn=fn+n;
  System.out.println("You input n="+orig);
  System.out.println("after flipping, it becomes "+fn);
 }//main()
}//class