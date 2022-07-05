public class trest_dec_inc {
  public static void main(String args[]){
     int x, y, z=5;
     x=7+z++; 
     System.out.println("after z=5;x=7+z++;\n"+"x=="+x+" z=="+z);
     y=9;
     x=10+(++y);
     System.out.println("after y=9;x=10+(++y);\n"+"x=="+x+" y=="+y);
     y=x; 
     System.out.println("after y=x;\n the boolean value of (y==x) is "+(y==x));
     y=x++; 
     System.out.println("after y=x++;\n the boolean value of (y==x) is "+(y==x));
  }//main
}//class