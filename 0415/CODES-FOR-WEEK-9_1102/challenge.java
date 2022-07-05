public class challenge {
  public static void main(String[] args) {
    int n = 7, i=0;
    while (i<n) {
      System.out.print(i); 
      i++;}
    System.out.println(", i="+i);   
  
    n = 7; i=0;//¤w«Å§i
    while (i<n) {
      i++;
      System.out.print(i); 
      }
    System.out.println(" ,i="+i);  

    n = 7; i=0;
    while (i<n) {
      n--;
      System.out.print(i); 
      }
    System.out.println(" ,i="+i); 

    int a, b;
    a=b=11;
    i=0;
    while (a>=b) {
        ++i;
	a--;
     }//while
    System.out.println("i="+i+" a="+a); 

    a=b=13;
    i=0;
    while (a>5 && a<9) {
        ++i;
	a--;
     }//while
    System.out.println("i="+i+" a="+a); 
 }//main
}//class
