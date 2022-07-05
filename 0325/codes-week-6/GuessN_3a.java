import java.security.SecureRandom;
import java.util.Scanner;
public class GuessN_3a {
  public static void main(String[] args) {	
    SecureRandom sr;
    Scanner input = new Scanner(System.in);	
    sr = new SecureRandom();	
    int a = 0,b = 10, n=0;
	String badg="猜錯: ", feed1="";
	a = sr.nextInt(100)+1;
	while (a!=b){
    System.out.print("猜數字(1~100)：");
    b = input.nextInt();
    if (a!= b) { //nested if
	if (a > b)
	   feed1="猜的太小囉\n";
	else 
	   feed1="猜的太大囉\n";
	badg=badg+b+"  "; 
    //System.out.println("亂數為"+a);       
	} //if(a!= b)
    else 
       feed1="恭喜猜對!\n";
   	n++;
	System.out.println(feed1+"猜"+n+"次\n"+badg);
     //System.out.println("亂數為"+a);
	   }
	System.out.println("TKS for testing!");
	}//main
}//class
