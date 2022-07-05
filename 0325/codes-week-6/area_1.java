import java.util.*; 
public class area_1{ 
public static void main(String args[]){
  int base, height;
  float area;
  Scanner keyb;
  keyb = new Scanner(System.in);//產生Scanner物件
  System.out.print("輸入三角形的底:");//printf()
  base = keyb.nextInt();//scanf()
  System.out.print("輸入三角形的高:");
  height = keyb.nextInt();
  //double area=((double)(height*base))/2; 
  area=((float)(height*base))/2;
  System.out.println("面積:"+area+"!!");
 }//main()
}//class