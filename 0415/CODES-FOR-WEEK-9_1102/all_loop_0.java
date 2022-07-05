import java.util.Scanner;

public class all_loop_0 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=0, i=0;
    System.out.println("¿é¤J¾ã¼Æn,¦L1 2 3 ...~n\n");	
    System.out.print("(1-while)¡G");		
    n = input.nextInt();
    i=0;
    while (i<n) {
        i++;
        System.out.print(i+"  ");
      }
    System.out.println("\n i="+i);

    System.out.print("(2-while)¡G");		
    n = input.nextInt();
    i=1;
    while (i<=n) {
        System.out.print(i+"  ");
        i++;
      }
    System.out.println("\n i="+i);

    System.out.print("(3-for)¡G");		
    n = input.nextInt();
    i=0;
    for(i=1;i<=n;i++) {
        System.out.print(i+"  ");
      }
    System.out.println("\n i="+i);

    System.out.print("(4-for)¡G");		
    n = input.nextInt();
    i=1;
    for(;i<=n;) {
        System.out.print(i+"  ");
        i++;
      }
    System.out.println("\n i="+i);

    System.out.print("(5-for)¡G");		
    n = input.nextInt();
    i=0;
    for(i=1;i<=n;i++) {
        System.out.print(i+"  ");
        i++;
      }
    System.out.println("\n i="+i);

    System.out.print("(6-do   while)¡G");		
    n = input.nextInt();
    i=0;
    do {
        i++;
        System.out.print(i+"  ");
      } while (i<n);
    System.out.println("\n i="+i);

    System.out.print("(7-do   while)¡G");		
    n = input.nextInt();
    i=1;
    do {
        System.out.print(i+"  ");
        i++;
      } while (i<=n);
    System.out.println("\n i="+i);
	}//main
}//class
