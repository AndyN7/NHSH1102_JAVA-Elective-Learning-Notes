import java.util.Scanner;
public class dec_bin1_process {
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
      System.out.println(z+"/2=(��)"+z/2+"...."+z%2+"(�l��)");
      System.out.println("�ثe�ഫ�o"+bin1);
      z=z/2; 
     }
    System.out.println("����ഫ�o�G"+bin1);
    System.out.println("======================");
    while (fract>0) {
      System.out.print(fract+"*2=(���)");
      fract=fract*2;
      tmp=(int)fract;
      fract=fract-tmp;
      System.out.println(tmp+"   (�l��)"+fract);
      bin2=bin2+tmp;
      System.out.println("�ثe�ഫ�o"+bin2);
          }
    System.out.println("�p���ഫ�o�G"+bin2);
    System.out.println(rn+"�ഫ���G�i��o"+bin1+"."+bin2);
    }//while
  }//main
}//class
