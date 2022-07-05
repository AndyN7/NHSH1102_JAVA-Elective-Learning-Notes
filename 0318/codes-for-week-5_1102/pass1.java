import java.util.*; 
public class pass1{ 
public static void main(String args[]){   
 
 int sc;
  Scanner inp = new Scanner(System.in);
  System.out.print("Please input your score:");
  sc = inp.nextInt();
  if (sc>=60)
     System.out.println("及格");
  else 
     System.out.println("不及格");
  if (!(sc>=60))
     System.out.println("不及格");
  else 
     System.out.println("及格");

 }//main()
}
