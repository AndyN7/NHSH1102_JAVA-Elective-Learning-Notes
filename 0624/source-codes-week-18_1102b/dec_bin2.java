import java.util.Scanner;
public class dec_bin2 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int z;
  double rn=0, fract;
  String bin1="", bin2="";
  while (rn>=0) {
    bin1=""; bin2="";
    System.out.print("块计计");
    rn = input.nextDouble();
    z=(int) rn;
    fract=rn-z;
    bin1=convert(z);
    System.out.println("俱计"+bin1);
    bin2=convert(fract);
    System.out.println("计"+bin2);
    System.out.println(rn+"锣传秈眔"+bin1+"."+bin2);
    }//while
  }//main
 static String convert(int x) {
  //俱计
    String bin="";
    while (x>0) {
      bin=x%2+bin;
      x=x/2; }
    return(bin);
 }//convert(int x)
 static String convert(double x){
  //计
    String bin="";
    int tmp;
    while (x>0) {
      x=x*2;
      tmp=(int)x;
      x=x-tmp;
      bin=bin+tmp;
          }
     return(bin); 
 }//convert(double x)
}//class
