import java.util.Scanner;
public class dec_bin1 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int z, tmp;
  double rn=0, fract;
  String bin1="", bin2="";
  while (rn>=0) {
    bin1=""; bin2="";
    System.out.print("��J�ƭȧt�p�ơG");
    rn = input.nextDouble();
    z=(int) rn;
    System.out.println(rn+" �g(int)��type casting�ܦ�"+z);
    fract=rn-z;
    while (z>0) {
      bin1=z%2+bin1;
      z=z/2; }
    System.out.println("��ơG"+bin1);

    while (fract>0) {
      fract=fract*2;
      tmp=(int)fract;
      fract=fract-tmp;
      bin2=bin2+tmp;
          }
    System.out.println("�p�ơG"+bin2);
    System.out.println(rn+"�ഫ���G�i��o"+bin1+"."+bin2);
    }//while
  }//main
}//class
