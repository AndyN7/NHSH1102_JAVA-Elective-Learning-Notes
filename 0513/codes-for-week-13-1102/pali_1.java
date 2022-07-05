import java.util.Scanner;
public class pali_1 {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   String str1="aaa", dif;
   System.out.println("輸入字串，判斷是否為迴文?\n");
   while (str1.length()>=1) {
    System.out.print("輸入字串：");		
    str1 = input.nextLine();
    if (str1.length()==0) break;
    int left=0,right=0, i=0;
    boolean palindrome=false;
    while (i<=str1.length()-1) {
       System.out.print(str1.charAt(i));
       i++;}

    System.out.print("\n");
    i=str1.length()-1;
    while (i>=0) {
       System.out.print(str1.charAt(i));
       i--;}
    System.out.println("\n");

    left=0;right=str1.length()-1;
    palindrome=true;
    while (left<right) {
       if (str1.charAt(left)!=str1.charAt(right)) 
          {palindrome=false; break;}
       left++;right--;}

    dif=(palindrome)?"是迴文!":"不是迴文!";
    System.out.println(str1+dif);
   //System.out.print(str1+"是迴文!"); 
    //else System.out.print(str1+"不是迴文!"); 
    }//while
	}//main
}//class
