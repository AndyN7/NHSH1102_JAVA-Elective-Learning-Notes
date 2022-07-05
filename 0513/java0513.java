import java.util.*;//匯入函式庫

public class java0513 { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    Scanner scanner = new Scanner(System.in);// 建立Scanner
    int n, n1, i, fac;// 宣告變數
    int[] f = new int[1000];// 宣告陣列儲存數字
    while (true) {// 無窮迴圈
      fac = 2;// 因數從2開始找
      i = 0;// 計數歸零
      System.out.print("輸入整數（輸入小於2可結束）：");// 輸出敘述
      n = scanner.nextInt();// 輸入整數存入n
      if (n < 2)// 若輸入數字不符合規則
        break;// 跳出迴圈
      while (fac < n) {// 當fac尚未達到n
        if (n % fac == 0) {// 若此數可被整除
          f[i] = fac;// 陣列加上此數
          i++;// 計數
        } // if
        fac++;// 找下一因數
      } // while
      System.out.print("所有因數：");// 輸出不換行
      for (int a = 0; a < (i - 1); a++) {// 輸出陣列，除了最後一項
        System.out.print(f[a] + ",");// 輸出該陣列值
      } // for
      System.out.print(f[i - 1] + "\n");// 輸出最後一項
      i = 0;// 計數歸零
      n1 = n;// 複製n至n1
      fac = 2;// 從2開始找
      while (fac <= n1) {// 小於n1時持續找
        if (n1 % fac == 0) {// 若此數可整除
          f[i] = fac;// 此數存入f陣列
          n1 = n1 / fac;// 除以此數
          fac = 2;// 重新從2開始找
          i++;// 計數+1
        } else {// 若不整除
          fac++;// 找下一數
        } // if else
      } // while
      System.out.print(n + "=");// 輸出
      for (int a = 0; a < (i - 1); a++) {// 重複輸出，除最後一項
        System.out.print(f[a] + "*");// 輸出陣列值
      } // for
      System.out.println(f[i - 1] + "\n");// 輸出最後一項
    } // while
    System.out.println("系統結束！");// 輸出
  }// main()
}// class
