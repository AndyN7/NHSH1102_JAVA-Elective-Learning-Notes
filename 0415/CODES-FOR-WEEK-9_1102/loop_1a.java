public class loop_1a {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int i=0, j=0;
    System.out.println("i="+i);
    while (a>b) {
        i=i+1;
	System.out.println("i="+i);
     }//while
    System.out.println("i="+i);

    System.out.println("j="+j);
    while (a>=30) {
        j=j+1;
	System.out.println("j="+j);
     }//while
    System.out.println("j="+j);

   // while (false) { //cause compile error
   //	   System.out.println("loop-4");
   //  }//while
	}//main
}//class
