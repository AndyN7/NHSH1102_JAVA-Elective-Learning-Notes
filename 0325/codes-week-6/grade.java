import java.util.*;
public class grade{
public static void main(String args[]){
 float sum,a,c,m,e;
 Scanner keyb = new Scanner(System.in);
 System.out.println("�i�D�ڧA���Ҧh��:");
 c = keyb.nextInt();
 System.out.println("���A���ƾǪ����p�O�S��:");
 m = keyb.nextInt();
 System.out.println("your English grade dude:");
 e = keyb.nextInt();
 sum=m+c+e;
 a=sum/3;
 System.out.println("�A�������O"+a+"�O~");
 System.out.print("�A�o�����`���u��"+sum+"�������");
}
}