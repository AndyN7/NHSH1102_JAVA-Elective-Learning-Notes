import java.util.Scanner;

public class BMI_2b {
public static void main(String[] args) {	
    Scanner input = new Scanner(System.in);
    System.out.print("��J����(����)�G");
    double height = input.nextDouble();
    System.out.print("��J�魫(����)�G");
    double weight = input.nextDouble();
    double bmi = Math.round((weight/ (height*height) )* 100) / 100.000;
    String status;

    if (bmi < 18.5) 
	status = "�魫�L��Underweight";
    else if (bmi>=18.5 && bmi < 24)
	status = "���`Normal (18.5<=BMI<24)";
     else 
	status = "�L��Overweight";

   System.out.println("BMI�G"+bmi+"�A���A: "+status);
  }//main
}//class
