import java.util.Scanner;

public class BMI_2b {
public static void main(String[] args) {	
    Scanner input = new Scanner(System.in);
    System.out.print("輸入身高(公尺)：");
    double height = input.nextDouble();
    System.out.print("輸入體重(公斤)：");
    double weight = input.nextDouble();
    double bmi = Math.round((weight/ (height*height) )* 100) / 100.000;
    String status;

    if (bmi < 18.5) 
	status = "體重過輕Underweight";
    else if (bmi>=18.5 && bmi < 24)
	status = "正常Normal (18.5<=BMI<24)";
     else 
	status = "過重Overweight";

   System.out.println("BMI："+bmi+"，狀態: "+status);
  }//main
}//class
