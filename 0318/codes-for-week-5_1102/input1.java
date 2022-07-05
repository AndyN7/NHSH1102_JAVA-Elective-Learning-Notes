import java.util.*; 
public class input1{ 
public static void main(String args[]){ 
  Scanner inp = new Scanner(System.in);
  System.out.print("Please input integer value:");
  int i1 = inp.nextInt();
  System.out.print("Please input float value:");
  float f1 = inp.nextFloat();
  System.out.print("Please input double value:");
  double d1 = inp.nextDouble();
  System.out.print("Please input String:");
  String s1 = inp.next();
   i1 = 100/3;
   f1 = (float)(100.0/3.0);
   d1= (double)(100.0/3.0);
  System.out.print("i1=="+i1+" ,f1=="+f1+" ,d1=="+d1);   
  }//main()
 }