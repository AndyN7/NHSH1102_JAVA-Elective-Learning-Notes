import java.util.Scanner;
public class bin_search_1 {
 static int [] A={15, 28, 45, 51, 60, 68, 75, 81, 90, 99};  
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int score=99, idx=-1; 
   while (score>=0) {
     System.out.print("�п�J���M�����: "); 
     score = scanner.nextInt();
     if (score<0) break;
     idx=binarysearch(A, score);
     if (idx>=0)
       System.out.println("���M�����"+score+" �bA["+idx+"]"); 
     else
       System.out.println("���M�����"+score+" ���bA�}�C��"); 
   }
}//main()
static int binarysearch(int refsc[],int num) {
  int low=0,mid=0,high=0, cnt=1;
  high=refsc.length-1; 
  while (low<=high) 
   {  System.out.println("�M�䦸��"+cnt+"��");       
      mid=(int)((low+high)/2);
      if (refsc[mid]<num) //Ascending 
	low=mid+1;
      else if (refsc[mid]>num)
	high=mid-1;
      else
	return (mid);
      cnt++;
	}//while
	return (-1); //not found!!
 }//binarysearch
}//class