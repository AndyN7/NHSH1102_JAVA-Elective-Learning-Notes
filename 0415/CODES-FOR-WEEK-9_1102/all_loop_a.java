import java.util.Scanner;

public class all_loop_a {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=5, i=0;
     //System.out.println("¿é¤J¾ã¼Æn,¦L1 2 3 ...~n\n");	
    //System.out.print("(1-while)¡G");		
    //n = input.nextInt();
    i=0;
    while (i<n) {
        i++;
        System.out.print(i+"  ");
      }
    System.out.println("\n i="+i);
    System.out.println("=================");
   i=0;
    while (i<n) {
        System.out.print(i+"  ");
        i++;
      }
    System.out.println("\n i="+i);
    System.out.println("=================");
    i=0;
    while (i<n) {
        n--;
        System.out.print(n+"  ");
        //n--;
      }
    System.out.println("\n n="+n);
    System.out.println("=================");
    i=0; 
    n=5;
    while (i<n) {
        //n--;
        System.out.print(n+"  ");
        n--;
      }
    System.out.println("\n n="+n);

	}//main
}//class
