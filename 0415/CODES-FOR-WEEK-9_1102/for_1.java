public class for_1 {
  public static void main(String[] args) {
   int i=0;
   // i=20;
   System.out.println("進入for loop前,i="+i);
   for( i=20;i>=20;i=i-3) {
         System.out.println("for loop內,i="+i);
        // i=i-3;
     }//for loop
   System.out.println("離開後, i="+i);

    //i=1;
   System.out.println("進入for loop前,i="+i);
   for  (i=1;i<=10;i=i+1) {
         System.out.println("for loop內,i="+i);
         //i=i+1;
     }//for loop
   System.out.println("離開後, i="+i);

   //i=1;
   System.out.println("進入for loop前,i="+i);
   for(i=1;i<=10;i=i+1, System.out.println("for loop內,i="+i)) {
         //i=i+1;
        // System.out.println("for loop內,i="+i);
     }//for loop
   System.out.println("離開後, i="+i);

   //i=1;
   System.out.println("進入for loop前,i="+i);
   for (i=1;i<=10;i=i+2, System.out.println("for loop內,i="+i)) {
        // i=i+2;
        // System.out.println("for loop內,i="+i);
     }//for loop
   System.out.println("離開後, i="+i);

   //i=1;
   System.out.println("進入for loop前,i="+i);
   for (i=i;i<=10;i=i+2) {
         System.out.println("for loop內,i="+i);
        // i=i+2;
     }//for loop
   System.out.println("離開後, i="+i);

  // i=0;
   System.out.println("進入for loop前,i="+i);
   for(i=0;i<10;i=i+2) {
         System.out.println("for loop內,i="+i);
         //i=i+2;
     }//for loop
   System.out.println("離開後, i="+i);

   for(i=0;i<10;i=i+2, System.out.println("for loop內,i="+i)) {
         //System.out.println("for loop內,i="+i);
         //i=i+2;
     }//for loop
   System.out.println("離開後, i="+i);
   for(i=0;i<10;System.out.println("for loop內,i="+i),i=i+2) {
         //System.out.println("for loop內,i="+i);
         //i=i+2;
     }//for loop
   System.out.println("離開後, i="+i);

   for(i=0;i<10;) {
         System.out.println("for loop內,i="+i);
         i=i+2;
     }//for loop
   System.out.println("離開後, i="+i);
   for(i=0;i<10;) {
         i=i+2;
         System.out.println("for loop內,i="+i);
     }//for loop
   System.out.println("離開後, i="+i);
   i=0;
   for(;i<10;) {
         i=i+2;
         System.out.println("for loop內,i="+i);
     }//for loop
   System.out.println("離開後, i="+i);

	}//main
}//class