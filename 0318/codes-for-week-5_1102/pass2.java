import java.util.*; 
public class pass2{ 
public static void main(String args[]){ 
 int math, chin;
  Scanner inp;
  inp = new Scanner(System.in);
  System.out.print("Please input your math score:");
  math = inp.nextInt();
  System.out.print("Please input your Chinese score:");
  chin = inp.nextInt();
  String feed=""; //empty string, not space character
  System.out.print("判斷結果:"+feed+"\n");
  if (math<60)
     feed="數學不及格,";
  else 
     feed="數學及格,";
  System.out.print("判斷結果:"+feed+"\n");
  if (chin<60)
     feed=feed+"國語不及格";
  else 
     feed=feed+"國語及格";
  System.out.print("判斷結果:"+feed+"\n");
 }//main()
}