import java.security.SecureRandom;
import java.util.Scanner;
public class GuessN_3a {
  public static void main(String[] args) {	
    SecureRandom sr;
    Scanner input = new Scanner(System.in);	
    sr = new SecureRandom();	
    int a = 0,b = 10, n=0;
	String badg="�q��: ", feed1="";
	a = sr.nextInt(100)+1;
	while (a!=b){
    System.out.print("�q�Ʀr(1~100)�G");
    b = input.nextInt();
    if (a!= b) { //nested if
	if (a > b)
	   feed1="�q���Ӥp�o\n";
	else 
	   feed1="�q���Ӥj�o\n";
	badg=badg+b+"  "; 
    //System.out.println("�üƬ�"+a);       
	} //if(a!= b)
    else 
       feed1="���߲q��!\n";
   	n++;
	System.out.println(feed1+"�q"+n+"��\n"+badg);
     //System.out.println("�üƬ�"+a);
	   }
	System.out.println("TKS for testing!");
	}//main
}//class
