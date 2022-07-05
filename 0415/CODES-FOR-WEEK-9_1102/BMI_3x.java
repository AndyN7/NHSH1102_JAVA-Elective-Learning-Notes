import java.util.Scanner;
public class BMI_3x {
public static void main(String[] args) {	
   Scanner input = new Scanner(System.in);
   double height=150, weight=60, bmi;
   String status;
   while (height>0 && weight>0) {
     System.out.print("輸入身高：");
     height = input.nextDouble();
     System.out.print("輸入體重：");
     weight = input.nextDouble();
     if (height<=0 || weight<=0) break;
     bmi = weight/ (height*height);
     if (bmi>=24)
	status = "過重Overweight";
     else if (bmi >= 18.5) 
	status = "正常Normal";
     else 
	status = "體重過輕Underweight";
    System.out.println("BMI："+bmi+"，狀態: "+status);
   }
  System.out.println("Bye===========");
  }//main
}//class
