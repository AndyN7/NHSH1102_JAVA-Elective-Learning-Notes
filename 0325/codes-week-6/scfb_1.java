import java.util.Scanner;
public class scfb_1 {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("��J���ơG");
   int sc = input.nextInt();
   if (sc<0)
       System.out.println("���ƭn>=0");
   else
    {
      if (sc>=90)
       System.out.println("��{�u��!");
      else if (sc<90 && sc>=80)
        System.out.println("��{��!");       
      else if (sc<80 && sc>=60)
       System.out.println("��{�|�i");
      else
       System.out.println("�O�H�дo");
    }
      if (sc>=90)
       System.out.println("��{�u��!");
      else if (sc<90 && sc>=80)
        System.out.println("��{��!");       
      else if (sc<80 && sc>=60)
       System.out.println("��{�|�i");
      else if (sc<60 && sc>=0)
       System.out.println("�O�H�дo");
      else
        System.out.println("���ƭn>=0");  
   if (sc>=0)    {
      if (sc>=90)
       System.out.println("��{�u��!");
      else if (sc<90 && sc>=80)
        System.out.println("��{��!");       
      else if (sc<80 && sc>=60)
       System.out.println("��{�|�i");
      else
       System.out.println("�O�H�дo");
    }
   else
      System.out.println("���ƭn>=0");
     
	}//end of main
}//end of class