import java.util.Scanner;
public class dec_bin1_process {
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
      System.out.println(z+"/2=(坝)"+z/2+"...."+z%2+"(緇计)");
      System.out.println("ヘ玡锣传眔"+bin1);
      z=z/2; 
     }
    System.out.println("俱计锣传眔"+bin1);
    System.out.println("======================");
    while (fract>0) {
      System.out.print(fract+"*2=(俱计)");
      fract=fract*2;
      tmp=(int)fract;
      fract=fract-tmp;
      System.out.println(tmp+"   (緇计)"+fract);
      bin2=bin2+tmp;
      System.out.println("ヘ玡锣传眔"+bin2);
          }
    System.out.println("计锣传眔"+bin2);
    System.out.println(rn+"锣传秈眔"+bin1+"."+bin2);
    }//while
  }//main
}//class
