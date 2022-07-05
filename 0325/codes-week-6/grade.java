import java.util.*;
public class grade{
public static void main(String args[]){
 float sum,a,c,m,e;
 Scanner keyb = new Scanner(System.in);
 System.out.println("告訴我你國文考多爛:");
 c = keyb.nextInt();
 System.out.println("那你的數學的狀況呢兄弟:");
 m = keyb.nextInt();
 System.out.println("your English grade dude:");
 e = keyb.nextInt();
 sum=m+c+e;
 a=sum/3;
 System.out.println("你的平均是"+a+"呢~");
 System.out.print("你這次的總分只有"+sum+"分喔呵呵");
}
}