import java.util.*;//匯入函式庫

public class java0506 { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    Scanner scanner = new Scanner(System.in);// 建立Scanner
    int n, gcd, i, min = 0;// 宣告變數
    int[] num = new int[1000];// 宣告陣列儲存數字
    do {
      System.out.print("輸入整數個數：");// 輸出敘述
      n = scanner.nextInt();// 輸入整數存入n
      if (n < 2)
        break;// 若n小於1則跳出while
      num = new int[n];// 建立個數為n的陣列
      for (int a = 0; a < n; a++) {// for迴圈重複n次
        System.out.print("輸入整數" + (a + 1) + "：");// 輸出敘述
        num[a] = scanner.nextInt();// 輸入整數存入陣列
      } // for
      min = num[0];// 先預設第一數為最小值
      for (int a = 1; a < n; a++) {// 重複找出最小值
        if (num[a] < min)// 若此數小於min
          min = num[a];// 將此數存入min
      } // for
      System.out.print("GCD(");// 輸出
      for (int a = 0; a < n; a++) {// 重複輸出每數
        System.out.print(num[a]);// 輸出該數
        if (n - a > 1)// 若還沒到最後一數
          System.out.print(",");// 輸出逗號
      } // for
      System.out.print(") = ");// 輸出

      // 使用while求GCD
      gcd = 1;// GCD預設1
      i = 2;// 從2開始判斷
      String tf;// 宣告字串
      while (i <= min) {// 當i小於等於最小值時
        tf = "t";// tf預設t
        for (int a = 0; a < n; a++) {// 確認陣列每一數
          if (num[a] % i != 0) {// 若無法整除
            tf = "f";// tf設為f
            break;// 跳出for
          } // if
        } // for
        if (tf == "t")// 若每數都可整除
          gcd = i;// 此數設為GCD
        i++;// i加一
      } // while
      System.out.print(gcd + "(while), ");// 輸出GCD

      // 使用do while求GCD
      gcd = 1;// GCD預設1
      i = 2;// 從2開始判斷
      do {
        tf = "t";// tf預設t
        for (int a = 0; a < n; a++) {// 確認陣列每一數
          if (num[a] % i != 0) {// 若無法整除
            tf = "f";// tf設為f
            break;// 跳出for
          } // if
        } // for
        if (tf == "t")// 若每數都可整除
          gcd = i;// 此數設為GCD
        i++;// i加一
      } while (i <= min);// 當i小於等於最小值時
      System.out.print(gcd + "(do while), ");// 輸出GCD

      // 使用for求GCD
      for (gcd = 1, i = 2; i <= min; i++) {// 當i小於等於最小值時重複
        tf = "t";// tf預設t
        for (int a = 0; a < n; a++) {// 確認陣列每一數
          if (num[a] % i != 0) {// 若無法整除
            tf = "f";// tf設為f
            break;// 跳出for
          } // if
        } // for
        if (tf == "t")// 若每數都可整除
          gcd = i;// 此數設為GCD
      } // for
      System.out.println(gcd + "(for)\n");// 輸出GCD
    } while (n > 1);// 輸入大於1時重複執行
    System.out.println("系統結束！");// 輸出
  }// main()
}// class
