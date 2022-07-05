public class loop_1e {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.print("before loop: b="+b+" ,");
    System.out.println((b>a));
    while (b>a) {
        //a++;
        b--;//--b;
        System.out.print("inside loop:b="+b+" ,");
        System.out.println((b>a));
     }//while
    System.out.print("after loop:b="+b+" ,");
    System.out.println((b>a));
	}//main
}//class
