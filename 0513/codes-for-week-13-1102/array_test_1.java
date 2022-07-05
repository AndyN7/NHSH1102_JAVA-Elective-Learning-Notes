public class array_test_1{
  public static void main(String[] args){
	int [] x=new int[10];
        int t=0, i=0;
        while (i<=9) {
          x[i]=20-i;
          i++;}
        t=x[1]+x[9];
        System.out.print(x[5]);
        System.out.println(","+t);

	int [] p=new int[10];
        int [] q=new int[10];
        int m=9, n=0;
        while (m>=0) {
          p[m]=m;
          q[m]=5;
          m--;}
        t=p[1]+q[1];
        System.out.println(t);
	}//main
}//class
