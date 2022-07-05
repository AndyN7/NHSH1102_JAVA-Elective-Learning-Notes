public class loop_1c {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int i=0;
    System.out.println("i="+i);
    while (b>a) {
        i=i+1;
	System.out.println("i="+i);
        if (i>=500) break;
     }//while
    System.out.println("i="+i);
	}//main
}//class
