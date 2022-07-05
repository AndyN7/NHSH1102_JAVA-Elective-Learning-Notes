import java.util.Scanner;

public class BMI_2 {
public static void main(String[] args) {	
    Scanner input = new Scanner(System.in);
    System.out.print("輸入身高：");
    double height = input.nextDouble();
    System.out.print("輸入體重：");
    double weight = input.nextDouble();
    //double bmi = Math.round((weight/ (height*height) )* 100) / 100.0;
    double bmi = weight/ (height*height);
    String status;

    if (bmi < 18.5) {
	status = "體重過輕Underweight";
	}
    else if (bmi>=18.5 && bmi<24) //
         {
	status = "正常Normal";
         }
    else 
	status = "過重Overweight";
   System.out.println("BMI："+bmi+"，狀態: "+status);
//==================================
    if (bmi < 18.5) {
	status = "體重過輕Underweight";
	}
    else if (18.5<=bmi && bmi<24) //
         {
	status = "正常Normal";
         }
    else 
	status = "過重Overweight";
   System.out.println("BMI："+bmi+"，狀態: "+status);
  }//main
}//class
