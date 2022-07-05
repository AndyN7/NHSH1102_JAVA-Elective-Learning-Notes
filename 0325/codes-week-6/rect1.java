import java.util.*; 
public class rect1{ 
public static void main(String args[]){
  int w, h;
  int area;
  Scanner keyb;
  keyb = new Scanner(System.in);//產生Scanner物件
  System.out.print("輸入rectangle的width:");//printf()
  w = keyb.nextInt();//scanf()
  System.out.print("輸入rectangle的的height:");
  h = keyb.nextInt();
  //double area=((double)(height*base))/2; 
  area=(w*h);
  System.out.println("面積:"+area+"!!");
 }//main()
}//class