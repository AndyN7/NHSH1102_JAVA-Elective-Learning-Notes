public class loop_1d {
  public static void main(String[] args) {
    int i=0;
    System.out.println("i="+i);
    while (true) {
        i=i+1;
	System.out.println("i="+i);
        if (i>=500) break;
     }//while
    System.out.println("i="+i);

}//class
