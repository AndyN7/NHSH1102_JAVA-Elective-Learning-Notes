import java.util.Scanner;
public class Tendata_array1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	int [] x=new int[10];
        int mean=0,max=0,i=0, sum=0, flunk=0;
        while (i<=9) {
          System.out.print("input data for x["+i+"] :");
	  x[i]=input.nextInt();
          i++;}
        System.out.print("\n");
        for(i=0;i<x.length;i++) {
          System.out.println("x["+i+"] :"+x[i]);
          sum=sum+x[i];    
          max=(max<x[i])?x[i]:max; 
          if (x[i]<60) flunk++;
          }       
	mean=sum/10;
	System.out.println("mean = "+mean);
	System.out.println("max = "+max);
        System.out.println("不及格人數: "+flunk);
	}//main
}//class


