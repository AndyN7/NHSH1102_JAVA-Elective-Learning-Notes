import java.util.*; 
public class rect1{ 
public static void main(String args[]){
  int w, h;
  int area;
  Scanner keyb;
  keyb = new Scanner(System.in);//����Scanner����
  System.out.print("��Jrectangle��width:");//printf()
  w = keyb.nextInt();//scanf()
  System.out.print("��Jrectangle����height:");
  h = keyb.nextInt();
  //double area=((double)(height*base))/2; 
  area=(w*h);
  System.out.println("���n:"+area+"!!");
 }//main()
}//class