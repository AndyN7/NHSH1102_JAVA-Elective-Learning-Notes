import java.util.Scanner;

public class BMI_2 {
public static void main(String[] args) {	
    Scanner input = new Scanner(System.in);
    System.out.print("��J�����G");
    double height = input.nextDouble();
    System.out.print("��J�魫�G");
    double weight = input.nextDouble();
    //double bmi = Math.round((weight/ (height*height) )* 100) / 100.0;
    double bmi = weight/ (height*height);
    String status;

    if (bmi < 18.5) {
	status = "�魫�L��Underweight";
	}
    else if (bmi>=18.5 && bmi<24) //
         {
	status = "���`Normal";
         }
    else 
	status = "�L��Overweight";
   System.out.println("BMI�G"+bmi+"�A���A: "+status);
//==================================
    if (bmi < 18.5) {
	status = "�魫�L��Underweight";
	}
    else if (18.5<=bmi && bmi<24) //
         {
	status = "���`Normal";
         }
    else 
	status = "�L��Overweight";
   System.out.println("BMI�G"+bmi+"�A���A: "+status);
  }//main
}//class
