import java.util.Scanner;
public class BMI_1f {
public static void main(String[] args) {	
    double height,weight, bmi;
    String status;
    Scanner input = new Scanner(System.in);
    System.out.println("輸入身高：");
    height = input.nextDouble();
    System.out.print("輸入體重：");
    weight = input.nextDouble();
    bmi = weight/ (height*height);
    //if (bmi < 18.5 || bmi >= 24) 
    if (bmi >= 18.5 && bmi < 24)  
      {
	status = "體重正常";
	}
    else 
	status = "體重不正常";

   System.out.println("BMI："+bmi+"，狀態: "+status);
  }//main
}//class
