import java.util.Scanner;

public class BMI_1 {
 public static void main(String[] args) {
  int x=3, y=4; 
  float z1;
  z1=(x+y)/2;
  System.out.println(z1);
  z1=((float)(x+y))/2;
  System.out.println(z1);
  float height, weight, bmi;
   Scanner input = new Scanner(System.in);
   System.out.print("輸入身高(公尺)：");
   height = input.nextFloat();
   System.out.print("輸入體重(公斤)：");
   weight = input.nextFloat();
   //bmi = Math.round((weight/ (height*height) )* 100) / 100.00;
   bmi = weight/ (height*height);
   System.out.println("身高："+height+"公尺, 體重："+weight+"公斤");
   System.out.println("BMI："+bmi);
	}//end of main
}//end of class
