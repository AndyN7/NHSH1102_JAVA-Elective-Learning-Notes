import java.util.*;//匯入函式庫
import java.security.SecureRandom;

public class division_0401 { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    SecureRandom random = new SecureRandom();// 產生隨機變數
    Scanner input = new Scanner(System.in);// 產生Scanner
    System.out.println("★歡迎來到乘、減法練習器★\n系統會隨機出題，\n若第一次答對即可獲得10分，\n每答錯一次該題得分會減少1分。\n");// 輸出不換行
    System.out.print("請輸入測驗題數：");// 輸出不換行
    int num = input.nextInt(), n1 = 0, n2 = 0, score = 0, score_get, ans_1, ans_2, ques;// 宣告多組變數，並要求使用者輸入題數num
    String mis = "";// 宣告字串mis負責儲存錯題
    for (int a = 0; a < num; a++) {// 重複執行num次
      n1 = random.nextInt(890) + 100;// 百位數(100~999)
      n2 = random.nextInt(90) + 10;// 十位數(10~99)
      ques = random.nextInt(2);// 0或1，0為減法、1為除法
      score_get = 10;// 每題分預設10
      if (ques == 0) {// 減法
        do {// do while迴圈
          // 出題
          System.out.print("\n➤第" + (a + 1) + "題：\n請問" + n1 + "－" + n2 + "＝");// 輸出題目
          ans_1 = input.nextInt();// 輸入答案
          // 對答案
          if (ans_1 == n1 - n2) {// 若答案正確
            System.out.println("✔︎答對了！獲得" + score_get + "分！\n");// 輸出反饋
            score = score + score_get;// 分數加score_get分
          } else {// 若答案錯誤
            System.out.println("✘答錯了！請重新作答。\n");// 輸出反饋
            if (score_get == 10) {// 若第一次答錯
              mis = mis + "◎" + n1 + "－" + n2 + "＝\n";// 於mis字串加入此題並換行
            }
            score_get = score_get - 1;// 答錯後題分扣1
          }
        } while (ans_1 != n1 - n2);// 答案不正確時重複迴圈
      } else if (ques == 1) {// 除法
        do {// do while迴圈
          // 出題
          System.out.print("\n➤第" + (a + 1) + "題：\n請問" + n1 + "÷" + n2 + "＝\n輸入商數：");// 輸出題目
          ans_1 = input.nextInt();// 輸入答案
          System.out.print("輸入餘數：");// 輸出題目不換行
          ans_2 = input.nextInt();// 輸入答案
          // 對答案
          if (ans_1 == n1 / n2 && ans_2 == n1 % n2) {// 若答案正確
            System.out.println("✔︎答對了！獲得" + score_get + "分！\n");// 輸出反饋
            score = score + score_get;// 分數加score_get分
          } else {// 若答案錯誤
            System.out.println("✘答錯了！請重新作答。\n");// 輸出反饋
            if (score_get == 10) {// 若第一次答錯
              mis = mis + "◎" + n1 + "÷" + n2 + "＝\n";// 於mis字串加入此題並換行
            }
            score_get = score_get - 1;// 答錯後題分扣1
          }
        } while (ans_1 != n1 / n2 || ans_2 != n1 % n2);// 答案不正確時重複迴圈
      }
    }
    if ("".equals(mis)) {// 判斷mis變數中是否有內容，若無則執行
      System.out.println("總共獲得" + score + "分\n沒有答錯任何一題！\n");// 無任何錯題之反饋
    } else {// 若有錯題
      System.out.println("總共獲得" + score + "分\n\n答錯題目有：\n" + mis);// 有錯題反饋錯題內容
    }
  }// main()
} // class
