public class selection_sort{
  public static void main(String[] args){
      int max=0,i=0, j=0, tmp=0;
      int [] data={78,66,50,90,45,88,89,40,30,40};
     System.out.println("before sorting");
     for(i=0;i<=data.length-1; i++)
	System.out.println("data["+i+"]="+data[i]);
      for(i=0;i<=data.length-2; i++)
	 for (j=i+1;j<=data.length-1;j++)
	      if (data[i]<data[j]) {
	        tmp=data[i];
	        data[i]=data[j];
	        data[j]=tmp;	
		  }
     System.out.println("after descending sorting");
     for(i=0;i<=data.length-1; i++)
	System.out.println("data["+i+"]="+data[i]);
     System.out.println("max: "+data[0]);
     System.out.println("min: "+data[data.length-1]);

     System.out.println("after ascending sorting");
     for(i=0;i<=data.length-2; i++)
	 for (j=i+1;j<=data.length-1;j++)
	      if (data[i]>data[j]) {
	        tmp=data[i];
	        data[i]=data[j];
	        data[j]=tmp;	
		  }
     for(i=0;i<=data.length-1; i++)
	System.out.println("data["+i+"]="+data[i]);
     System.out.println("min: "+data[0]);
     System.out.println("max: "+data[data.length-1]);
	}//main
}//class
