import java.util.Scanner;
public class dec_bin1 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int z, tmp;
  double rn=0, fract;
  String bin1="", bin2="";
  while (rn>=0) {
    bin1=""; bin2="";
    System.out.print("块计计");
    rn = input.nextDouble();
    z=(int) rn;
    System.out.println(rn+" 竒(int)ぇtype casting跑Θ"+z);
    fract=rn-z;
    while (z>0) {
      bin1=z%2+bin1;
      z=z/2; }
    System.out.println("俱计"+bin1);

    while (fract>0) {
      fract=fract*2;
      tmp=(int)fract;
      fract=fract-tmp;
      bin2=bin2+tmp;
          }
    System.out.println("计"+bin2);
    System.out.println(rn+"锣传秈眔"+bin1+"."+bin2);
    }//while
  }//main
}//class
