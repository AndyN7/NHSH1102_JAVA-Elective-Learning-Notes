import java.security.SecureRandom;
import java.util.Scanner;

public class add_drill_4 {
  public static void main(String[] args) {
   SecureRandom sr = new SecureRandom();
   Scanner input = new Scanner(System.in);
   int n1=0,n2= 0;
   int ans= 0, score=0, i=1, cnt=0;
   String err="";
   n1 = sr.nextInt(10);//出題
   n2 = sr.nextInt(10);//出題
   System.out.print("作答題數:");
   int n = input.nextInt();
   while (i<=n) {
    //i=i+1;
    //n1 = sr.nextInt(10);
    //n2 = sr.nextInt(10);
    System.out.print("第"+i+"題: "+n1+"+"+n2+"=");//顯示題目
    ans = input.nextInt();
    if (ans== n1+n2) {
       score=score+(10-cnt);
       System.out.println("答對，GREAT!! 分數:"+score+"分.");
       n1 = sr.nextInt(10);//出下一題
       n2 = sr.nextInt(10);//出下一題
       cnt=0;//答錯次數
       i=i+1;//答對，紀錄題次
        }
    else{ 
        cnt++;//cnt=cnt+1;答錯次數
		if (cnt==1)err=err+"第"+i+"題: "+n1+"+"+n2+"\n";
        System.out.println("答錯，加油! 分數:"+score+"分.");
        System.out.println("答錯: "+cnt+"次.");
         }    
     //i=i+1;
     }//while
	 System.out.println("答錯題目:\n===================\n"+err);
	}//main
}//class
