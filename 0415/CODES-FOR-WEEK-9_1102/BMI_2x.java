import java.util.Scanner;

public class BMI_2x {
public static void main(String[] args) {	
    Scanner input = new Scanner(System.in);
    System.out.print("��J�����G");
    double height = input.nextDouble();
    System.out.print("��J�魫�G");
    double weight = input.nextDouble();
    //double bmi = Math.round((weight/ (height*height) )* 100) / 100.0;
    double bmi = weight/ (height*height);
    String status;
    if (bmi>=24) {
	status = "�L��Overweight";
	}
    else if (bmi>=18.5 && bmi<24)
         {
	status = "���`Normal";
         }
    else 
	status = "�魫�L��Underweight";
   System.out.println("BMI�G"+bmi+"�A���A: "+status);
   //===================================================
    if (bmi>=24)
	status = "�L��Overweight";
    else if (bmi >= 18.5) 
	status = "���`Normal";
    else 
	status = "�魫�L��Underweight";
   System.out.println("BMI�G"+bmi+"�A���A: "+status);


  }//main
}//class
