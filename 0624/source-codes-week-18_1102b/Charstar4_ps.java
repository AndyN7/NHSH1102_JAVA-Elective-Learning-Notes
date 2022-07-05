import java.util.Scanner;
public class Charstar4_ps {
static void printstar(String sym1){
	int level = 7;		
	//for迴圈 直到印出 level行結束金字塔
	for (int i = 0; i < level; i++) {
		//印出空白
		for (int j = 0; j < 7-i; j++)
		   System.out.print(" ");
		//在印出*
		for (int j = 0; j < 2*i+1; j++)
		   System.out.print(sym1);
		//每層結束換行
		System.out.println("");
		}
   }//printstar()

 public static void main(String[] args) {
//變數level為金字塔的層數,每行*個數,每行空格數
    //printstar("*");
	//printstar("$");
	String s1;  
    Scanner input = new Scanner(System.in);
    System.out.print("輸入符號(如*)：");
    s1 = input.next();	  
	printstar(s1);
    Charstar4_ps.printstar("&");	
	}//main

}//class
