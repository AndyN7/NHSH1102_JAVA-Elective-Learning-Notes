import java.util.Scanner;
public class Charstar4_ps {
static void printstar(String sym1){
	int level = 7;		
	//for�j�� ����L�X level�浲�����r��
	for (int i = 0; i < level; i++) {
		//�L�X�ť�
		for (int j = 0; j < 7-i; j++)
		   System.out.print(" ");
		//�b�L�X*
		for (int j = 0; j < 2*i+1; j++)
		   System.out.print(sym1);
		//�C�h��������
		System.out.println("");
		}
   }//printstar()

 public static void main(String[] args) {
//�ܼ�level�����r�𪺼h��,�C��*�Ӽ�,�C��Ů��
    //printstar("*");
	//printstar("$");
	String s1;  
    Scanner input = new Scanner(System.in);
    System.out.print("��J�Ÿ�(�p*)�G");
    s1 = input.next();	  
	printstar(s1);
    Charstar4_ps.printstar("&");	
	}//main

}//class
