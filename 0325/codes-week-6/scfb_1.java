import java.util.Scanner;
public class scfb_1 {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("輸入分數：");
   int sc = input.nextInt();
   if (sc<0)
       System.out.println("分數要>=0");
   else
    {
      if (sc>=90)
       System.out.println("表現優異!");
      else if (sc<90 && sc>=80)
        System.out.println("表現佳!");       
      else if (sc<80 && sc>=60)
       System.out.println("表現尚可");
      else
       System.out.println("令人煩惱");
    }
      if (sc>=90)
       System.out.println("表現優異!");
      else if (sc<90 && sc>=80)
        System.out.println("表現佳!");       
      else if (sc<80 && sc>=60)
       System.out.println("表現尚可");
      else if (sc<60 && sc>=0)
       System.out.println("令人煩惱");
      else
        System.out.println("分數要>=0");  
   if (sc>=0)    {
      if (sc>=90)
       System.out.println("表現優異!");
      else if (sc<90 && sc>=80)
        System.out.println("表現佳!");       
      else if (sc<80 && sc>=60)
       System.out.println("表現尚可");
      else
       System.out.println("令人煩惱");
    }
   else
      System.out.println("分數要>=0");
     
	}//end of main
}//end of class