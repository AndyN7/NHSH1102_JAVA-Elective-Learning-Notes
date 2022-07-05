import java.util.*;//匯入函式庫
import java.security.SecureRandom;

public class math_0325 { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    SecureRandom random = new SecureRandom();// 產生隨機變數
    Scanner input = new Scanner(System.in);// 產生Scanner
    System.out.print("測驗題數：");// 輸出不換行
    int num = input.nextInt(), diff, n1 = 0, n2 = 0, score = 0, ans;// 宣告多組變數，並要求使用者輸入題數num
    String mis = "";// 宣告字串mis負責儲存錯題
    do {// do while迴圈
      System.out.print("▽ 請選擇難度 ▽\n◉ 難度1：個位數減個位數\n◉ 難度2：十位數減個位數\n◉ 難度3：百位數減十位數\n\n請輸入數字1、2或3：");// 輸出難度選項
      diff = input.nextInt();// 使用者輸入難度
      if (diff > 3 || diff < 1) {// 若輸入錯誤難度數字則輸出錯誤訊息
        System.out.print("\n\n▲難度請輸入數字1、2或3，請重新輸入\n\n");
      }
    } while (diff > 3 || diff < 1);// 若錯誤則重複迴圈
    for (int a = 0; a < num; a++) {// 重複執行num次
      if (diff == 1) {// 若輸入難度1
        n1 = random.nextInt(8) + 2;// 個位數且不為0或1(2~9)
        n2 = random.nextInt(n1 - 1) + 1;// 個位數且小於n1並不為0(1~(n1-1))
      } else if (diff == 2) {// 若輸入難度2
        n1 = random.nextInt(90) + 10;// 十位數(10~99)
        n2 = random.nextInt(9) + 1;// 個位數(1~9)
      } else if (diff == 3) {// 若輸入難度3
        n1 = random.nextInt(890) + 100;// 百位數(100~999)
        n2 = random.nextInt(90) + 10;// 十位數(10~99)
      }
      do {// do while迴圈
        System.out.print("\n➤第" + (a + 1) + "題：\n請問" + n1 + "－" + n2 + "＝");// 輸出題目
        ans = input.nextInt();// 輸入答案存入ans
        if (ans == n1 - n2) {// 若答案正確
          System.out.println("✔︎答對了！獲得10分！\n");// 輸出反饋
          score = score + 10;// 分數加十分
        } else {// 若答案錯誤
          System.out.println("✘答錯了！請重新作答。\n");// 輸出反饋
          mis = mis + "◎" + n1 + "－" + n2 + "＝\n";// 於mis字串加入此題並換行
        }
      } while (ans != n1 - n2);// 當答案不正確時重複迴圈
    }
    if ("".equals(mis)) {// 判斷mis變數中是否有內容，若無則執行
      System.out.println("總共獲得" + score + "分\n\n沒有答錯任何一題！\n");// 無任何錯題之反饋
    } else {// 若有錯題
      System.out.println("總共獲得" + score + "分\n\n答錯題目有：\n" + mis);// 有錯題反饋錯題內容
    }
  }// main()
} // class
