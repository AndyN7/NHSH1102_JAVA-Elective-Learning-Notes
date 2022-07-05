import java.util.Scanner;
public class Tendata_noarray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,mean,max;
		x1=input.nextInt();
		x2=input.nextInt();
		x3=input.nextInt();
		x4=input.nextInt();
		x5=input.nextInt();
		x6=input.nextInt();
		x7=input.nextInt();
		x8=input.nextInt();
		x9=input.nextInt();
		x10=input.nextInt();
		mean=(x1+x2+x3+x4+x5+x6+x7+x8+x9+x10)/10;
		max=x1;
		max=(max<x2)?x2:max;
		max=(max<x3)?x3:max;
		max=(max<x4)?x4:max;
		max=(max<x5)?x5:max;
		max=(max<x6)?x6:max;
		max=(max<x7)?x7:max;
		max=(max<x8)?x8:max;
		max=(max<x9)?x9:max;
		max=(max<x10)?x10:max;

		System.out.println("x1 = "+x1);
		System.out.println("x2 = "+x2);
		System.out.println("x3 = "+x3);
		System.out.println("x4 = "+x4);
		System.out.println("x5 = "+x5);
		System.out.println("x6 = "+x6);
		System.out.println("x7 = "+x7);
		System.out.println("x8 = "+x8);
		System.out.println("x9 = "+x9);
		System.out.println("x10 = "+x10);
		System.out.println("mean = "+mean);
		System.out.println("max = "+max);
	}
}


