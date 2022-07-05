public class test_if{
      public static void main(String args[]){
            int x , y , z = 5;  
            x = y = z + 5;  
            z = x + y + z;  
            System.out.println("z = " + z);  

            int x1 = 9, y1 = 8, z1 = 7;  
            x1 = x1 % z1;
            if (x1 < 5)
                  y1 = y1 + 1;  
            else
                  y1 = x1 + 1;  
            System.out.println("y1 = " + y1);  

            x1 = 9; y1=8; z1=7;  
            x1 = x1 % z1;  
            if (!(x1<=5))
                  y1 = y1 + 1;  
            else
                  y1 = x1 + 1;  
            System.out.println("y1 = " + y1);  

            x1 = 9; y1=8; z1=7;  
            x1 = x1 % (z1+1);  
            if (x1>5)
                  y1 = y1 + 1;  
            System.out.println("y1 = " + y1); 


            int w=7, p = 4; 
            x = 3;  
            p = w / x * 2;
            if (p<18 && p>8)
                  x = (x*x)%2;  
            else
                  x = x % 3;  
            System.out.println("x = " + x);  

            w = 7;  p = 4;  x = 3;  
            p = w / x * 2;  
            if (p<18 || p>8)
                  x = (x*x)%2;  
            else
                  x = x % 3;  
            System.out.println("x = " + x);  

            w = 8; p = 6; x = 4;  
            x++;  //x = x + 1;  
            if( w+1 == p+3) x=x+1;  
            System.out.println("x = " + x); 

            w = 8; p = 4; x = 3;
            System.out.println((w>p+x)); 
            System.out.println("(w!=p+x+1):"+(w!=p+x+1));   
            System.out.println("(w==p+x+1):"+(w==p+x+1));  

            w = 8; p = 4; x = 3;   
            x--;  //x = x-1;  
            if ((w+1)!=(p+3))
                  y= (x--);  // (1) y=x; (2) x=x-1;
            else
                  y = x++;  
            System.out.println("y = " + y);  
            System.out.println("x = " + x); 
              
      }
}