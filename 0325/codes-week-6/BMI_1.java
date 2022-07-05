import java.util.Scanner;

public class BMI_1 {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("輸入身高(公尺)：");
   double height = input.nextDouble();
   System.out.print("輸入體重(公斤)：");
   double weight = input.nextDouble();
   double bmi = Math.round((weight/ (height*height) )* 100) / 100.00;
   System.out.println("身高："+height+"公尺, 體重："+weight+"公斤");
   System.out.println("BMI："+bmi);
	}//end of main
}//end of class
