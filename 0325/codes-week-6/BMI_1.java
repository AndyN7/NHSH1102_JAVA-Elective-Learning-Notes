import java.util.Scanner;

public class BMI_1 {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("��J����(����)�G");
   double height = input.nextDouble();
   System.out.print("��J�魫(����)�G");
   double weight = input.nextDouble();
   double bmi = Math.round((weight/ (height*height) )* 100) / 100.00;
   System.out.println("�����G"+height+"����, �魫�G"+weight+"����");
   System.out.println("BMI�G"+bmi);
	}//end of main
}//end of class
