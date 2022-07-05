public class array1 {
  public static void main(String[] args){
    int [] x={70,90,55,66,12,27,34,47,40};
    int i=0, x3=11;
    for(i=0;i<x.length;i++)  x[i]++;      
    System.out.println("x[3]value is "+x[3]);
    System.out.println("x3 value is "+x3);
    for(i=0;i<x.length;i++) x[i]+=5;
    System.out.println("x[3]value is "+x[3]);	
   for(i=0;i<x.length;i++) 
       if (i%2==1)  x[i]+=3;
    System.out.println("x[3]value is "+x[3]);	
	}//main
}//class