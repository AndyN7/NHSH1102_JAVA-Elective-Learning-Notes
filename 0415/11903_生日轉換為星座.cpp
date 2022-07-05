#include <stdio.h>
#include <stdlib.h>

int main()
{
    int m,d,n;
    printf("星座判斷程式\n-----------\n請輸入月份及日期\n並用空格隔開：");
    scanf("%d%d",&m,&d);
    n=m*100+d;
    if(n<120){
        printf("%d月%d號是摩羯座！",m,d);
    }
    else if(n<219){
        printf("%d月%d號是水瓶座！",m,d);
    }
    else if(n<321){
        printf("%d月%d號是雙魚座！",m,d);
    }
    else if(n<421){
        printf("%d月%d號是白羊座！",m,d);
    }
    else if(n<521){
        printf("%d月%d號是金牛座！",m,d);
    }
    else if(n<622){
        printf("%d月%d號是雙子座！",m,d);
    }
    else if(n<723){
        printf("%d月%d號是巨蟹座！",m,d);
    }
    else if(n<823){
        printf("%d月%d號是獅子座！",m,d);
    }
    else if(n<923){
        printf("%d月%d號是處女座！",m,d);
    }
    else if(n<1023){
        printf("%d月%d號是天秤座！",m,d);
    }
    else if(n<1122){
        printf("%d月%d號是天蠍座！",m,d);
    }
    else if(n<1222){
        printf("%d月%d號是射手座！",m,d);
    }
    else if(n<1232){
        printf("%d月%d號是摩羯座！",m,d);
    }
    else{
    	printf("哪有%d月%d號啦！",m,d); 
	}
    return 0;
}
