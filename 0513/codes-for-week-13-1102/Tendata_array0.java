public class Tendata_array0{
  public static void main(String[] args){
	int [] x={70,90,55,66,12,27,34,47,80,100};
        int mean=0,max=0,i=0, sum=0, flunk=0;
        for(i=0;i<x.length;i++) {
          System.out.println("x["+i+"] :"+x[i]);
          sum=sum+x[i];    
          max=(max<x[i])?x[i]:max; 
          if (x[i]<60) flunk++;
          }       
	mean=sum/10;
        System.out.println("陣列長度: "+x.length);
	System.out.println("mean = "+mean);
	System.out.println("max = "+max);
        System.out.println("不及格人數: "+flunk);
	}//main
}//class


