import java.util.Scanner;
public class BMI_3x {
public static void main(String[] args) {	
   Scanner input = new Scanner(System.in);
   double height=150, weight=60, bmi;
   String status;
   while (height>0 && weight>0) {
     System.out.print("��J�����G");
     height = input.nextDouble();
     System.out.print("��J�魫�G");
     weight = input.nextDouble();
     if (height<=0 || weight<=0) break;
     bmi = weight/ (height*height);
     if (bmi>=24)
	status = "�L��Overweight";
     else if (bmi >= 18.5) 
	status = "���`Normal";
     else 
	status = "�魫�L��Underweight";
    System.out.println("BMI�G"+bmi+"�A���A: "+status);
   }
  System.out.println("Bye===========");
  }//main
}//class
