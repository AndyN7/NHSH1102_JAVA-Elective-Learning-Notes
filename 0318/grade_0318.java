import java.util.*;//匯入函式庫

public class grade_0318 { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    Scanner input = new Scanner(System.in);// 產生Scanner
    float[] g = new float[3];// 宣告陣列g
    float sum = 0;// 宣告浮點數sum=0
    for (int a = 0; a < 3; a++) {// 運用for向使用者存取三次段考成績
      System.out.print("輸入第" + (a + 1) + "次段考數學成績：");// 輸入提示
      g[a] = input.nextFloat();// 輸入成績
      sum = sum + g[a];// 計算總分
    }
    System.out.println("\n總分：" + sum);// 輸出總分
    System.out.println("平均：" + (sum / 3));// 輸出平均
    for (int a = 0; a < 3; a++) {// 運用for輸出三次段考成績是否及格
      System.out.print("第" + (a + 1) + "次段考數學成績：");
      if (g[a] >= 60)// 大於等於60分則在最後加上「（不）及格」字樣
        System.out.println("及格");
      else
        System.out.println("不及格");
    }
    if ((sum / 3) >= 60)// 判斷平均是否及格
      System.out.println("平均：及格\n");
    else
      System.out.println("平均：不及格\n");
    int min = 0;
    for (int a = 0; a < 2; a++) {// 比大小判斷最小值為陣列之編號，存入min
      if (g[a + 1] < g[min])
        min = a + 1;
    }
    System.out.println("最低分是第" + (min + 1) + "次段考");// 輸出最低分之段考次數
  }// main()
}// class
