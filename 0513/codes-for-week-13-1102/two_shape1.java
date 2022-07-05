import java.util.Scanner;
public class two_shape1 {
   public static void main(String[] args) {
	int level = 5,star = 1,space = 7;
        String sign="*";
	for (int k = 1; k <= level; k++) {
	    for (int i = 1; i<=k; i++)
                System.out.print(sign);
	    for (int mid = 1; mid<=(2*level-2*k); mid++)
                System.out.print(" ");
	    for (int i = 1; i<=k; i++)
                System.out.print(sign);
            System.out.print("\n");	
	}
    while (level>=3){
    Scanner input = new Scanner(System.in);
    System.out.print("¿é¤Jlevel:");
    level=input.nextInt();
    if (level<=3) break;
	for (int k = 1; k <= level; k++) {
	    for (int i = 1; i<=k; i++)
                System.out.print(sign);
	    for (int mid = 1; mid<=(2*level-2*k); mid++)
                System.out.print(" ");
	    for (int i = 1; i<=k; i++)
                System.out.print(sign);
            System.out.print("\n");	
	}
     }//while
 }//main
}
