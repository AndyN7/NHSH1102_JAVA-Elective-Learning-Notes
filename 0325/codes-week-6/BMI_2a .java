import java.util.Scanner;

public class BMI_2a {
public static void main(String[] args) {	
    Scanner input = new Scanner(System.in);
    System.out.print("��J�����G");
    double height = input.nextDouble();
    System.out.print("��J�魫�G");
    double weight = input.nextDouble();
    double bmi = weight/ (height*height);
    String status;

    if (bmi >= 18.5 && bmi < 24 ) {
	status = "�魫�L��Underweight";
    else 
	status = "���`Normal";

   System.out.println("BMI�G"+bmi+"�A���A: "+status);
  }//main
}//class