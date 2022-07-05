import java.util.Scanner;
public class array_pa{
  public static void main(String[] args){
        String [] n={"cat","dog","fox","zebra","pig","bear","cow","lion","fish","horse"};
        int [] x={70,90,55,66,12,27,34,47,80,100};
        int [] y={60,80,55,65,62,57,84,97,50,40};
        int [] z=new int[10];
        int i=0;
        while (i<x.length) {
          z[i]=x[i]+y[i];
          System.out.println("name :"+n[i]+","+x[i]+","+y[i]+", sum="+z[i]);
          i++;}

	}//main
}//class


