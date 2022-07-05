public class while_1 {
  public static void main(String[] args) {
   int i;
    i=20;
   System.out.println("進入while前,i="+i);
   while (i>=20) {
         System.out.println("while內,i="+i);
        // i=i-3;
     }//while
   System.out.println("離開後, i="+i);



    i=1;
   System.out.println("進入while前,i="+i);
   while (i<=10) {
         System.out.println("while內,i="+i);
         i=i+1;
     }//while
   System.out.println("離開後, i="+i);

   i=1;
   System.out.println("進入while前,i="+i);
   while (i<=10) {
         i=i+1;
         System.out.println("while內,i="+i);
     }//while
   System.out.println("離開後, i="+i);

   i=1;
   System.out.println("進入while前,i="+i);
   while (i<=10) {
         i=i+2;
         System.out.println("while內,i="+i);
     }//while
   System.out.println("離開後, i="+i);

   i=1;
   System.out.println("進入while前,i="+i);
   while (i<=10) {
         System.out.println("while內,i="+i);
         i=i+2;
     }//while
   System.out.println("離開後, i="+i);

   i=0;
   System.out.println("進入while前,i="+i);
   while (i<10) {
         System.out.println("while內,i="+i);
         i=i+2;
     }//while
   System.out.println("離開後, i="+i);
	}//main
}//class