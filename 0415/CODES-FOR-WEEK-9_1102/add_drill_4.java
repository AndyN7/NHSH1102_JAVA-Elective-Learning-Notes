import java.security.SecureRandom;
import java.util.Scanner;

public class add_drill_4 {
  public static void main(String[] args) {
   SecureRandom sr = new SecureRandom();
   Scanner input = new Scanner(System.in);
   int n1=0,n2= 0;
   int ans= 0, score=0, i=1, cnt=0;
   String err="";
   n1 = sr.nextInt(10);//�X�D
   n2 = sr.nextInt(10);//�X�D
   System.out.print("�@���D��:");
   int n = input.nextInt();
   while (i<=n) {
    //i=i+1;
    //n1 = sr.nextInt(10);
    //n2 = sr.nextInt(10);
    System.out.print("��"+i+"�D: "+n1+"+"+n2+"=");//����D��
    ans = input.nextInt();
    if (ans== n1+n2) {
       score=score+(10-cnt);
       System.out.println("����AGREAT!! ����:"+score+"��.");
       n1 = sr.nextInt(10);//�X�U�@�D
       n2 = sr.nextInt(10);//�X�U�@�D
       cnt=0;//��������
       i=i+1;//����A�����D��
        }
    else{ 
        cnt++;//cnt=cnt+1;��������
		if (cnt==1)err=err+"��"+i+"�D: "+n1+"+"+n2+"\n";
        System.out.println("�����A�[�o! ����:"+score+"��.");
        System.out.println("����: "+cnt+"��.");
         }    
     //i=i+1;
     }//while
	 System.out.println("�����D��:\n===================\n"+err);
	}//main
}//class
