import java.util.*;//匯入函式庫

public class java0610_score { // 類別名稱（class name）要與檔案名稱相同
  static int[] chinese = new int[100];// 宣告整數陣列
  static int[] english = new int[100];
  static int[] math = new int[100];
  static String[][] personal = new String[100][6];// [i][0]->國等第/[i][1]->英等第/[i][2]->數等第/[i][3]->總分/[i][4]->平均/[i][5]->平均等第
  public static float[][] calculate = new float[3][5];// [i][0]->max；[i][1]->min；[i][2]->ave；[i][3]->failed；[i][4]->pass

  static String getRank(int score) {// 判斷等第
    switch (score / 10) {// switch判斷
      case 10:// 100
      case 9:// 90up
        return "優";
      case 8:// 80up
        return "甲";
      case 7:// 70up
        return "乙";
      case 6:// 60up
        return "丙";
      default:// 0~59
        return "丁";
    }// switch
  }// getRank

  static void export() {
    for (int a = 0; a < 3; a++) {
      System.out.print("\n【全班");
      switch (a) {
        case 0:
          System.out.print("國文");
          break;
        case 1:
          System.out.print("英文");
          break;
        case 2:
          System.out.print("數學");
          break;
      }
      System.out.print("成績】\n最高分：" + Math.round(calculate[a][0]) + "\t最低分：" + Math.round(calculate[a][1]) + "\t平均："
          + Math.round(calculate[a][2]) + "\t不及格人數：" + Math.round(calculate[a][3]) + "\t及格人數："
          + Math.round(calculate[a][4]));
    }
  }

  public static void main(String args[]) { // 主程式名稱、引數、小寫
    Scanner scanner = new Scanner(System.in);// 建立Scanner
    String[] name = new String[100];// 宣告字串陣列name
    int num = 0;// 宣告整數num計數
    while (true) {// 無窮迴圈
      System.out.print("輸入姓名：");// 輸出
      name[num] = scanner.nextLine();// 輸入值存入
      if (name[num].toLowerCase().equals("bye") || name[num].toLowerCase().equals("0"))// 若輸入bye or 0
        break;// 跳出while
      System.out.print("輸入國文成績：");// 輸出
      chinese[num] = Integer.parseInt(scanner.nextLine());// 輸入國文
      personal[num][0] = getRank(chinese[num]);// 計算等第
      System.out.print("輸入英文成績：");// 輸出
      english[num] = Integer.parseInt(scanner.nextLine());// 輸入英文
      personal[num][1] = getRank(english[num]);// 計算等第
      System.out.print("輸入數學成績：");// 輸出
      math[num] = Integer.parseInt(scanner.nextLine());// 輸入數學
      personal[num][2] = getRank(math[num]);// 計算等第
      personal[num][3] = Integer.toString(chinese[num] + english[num] + math[num]);// 計算總分
      personal[num][4] = Integer.toString((chinese[num] + english[num] + math[num]) / 3);// 計算平均
      personal[num][5] = getRank((chinese[num] + english[num] + math[num]) / 3);// 計算平均等第
      System.out.print("\n");// 輸出一換行
      num++;// 計數加一
    } // while
    System.out.println("輸入結束！\n\n全班共" + num + "位學生成績");// 輸出人數
    for (int a = 0; a < num; a++) {// for執行num次
      System.out
          .println("【" + name[a] + "】\t國文：" + chinese[a] + "（" + personal[a][0] + "）\t英文：" + english[a] + "（"
              + personal[a][1] + "）\t數學：" + math[a] + "（" + personal[a][2] + "）\t平均：" + personal[a][4] + "（"
              + personal[a][5] + "）");// 輸出同學姓名成績等第
    }

    // chinese max min failed pass
    calculate[0][0] = chinese[0];// max預設值
    calculate[0][1] = chinese[0];// min預設值
    for (int a = 0; a < num; a++) {// for執行num次
      if (chinese[a] > calculate[0][0])// 若大於max
        calculate[0][0] = chinese[a];// max設為此數
      if (chinese[a] < calculate[0][1])// 若小於min
        calculate[0][1] = chinese[a];// min社為此數
      calculate[0][2] = calculate[0][2] + chinese[a];// 計算所有人總分
      if (chinese[a] < 60)// 若小於60
        calculate[0][3] = calculate[0][3] + 1;// 不及格人數加一
      else// 若及格
        calculate[0][4] = calculate[0][4] + 1;// 及格人數加一
    } // for
    calculate[0][2] = calculate[0][2] / num;// 計算平均

    // english max min failed pass
    calculate[1][0] = english[0];
    calculate[1][1] = english[0];
    for (int a = 0; a < num; a++) {
      if (english[a] > calculate[1][0])
        calculate[1][0] = english[a];
      if (english[a] < calculate[1][1])
        calculate[1][1] = english[a];
      calculate[1][2] = calculate[1][2] + english[a];
      if (english[a] < 60)
        calculate[1][3] = calculate[1][3] + 1;
      else
        calculate[1][4] = calculate[1][4] + 1;
    }
    calculate[1][2] = calculate[1][2] / num;

    // math max min failed pass
    calculate[2][0] = math[0];// max
    calculate[2][1] = math[0];// min
    for (int a = 0; a < num; a++) {
      if (math[a] > calculate[2][0])
        calculate[2][0] = math[a];
      if (math[a] < calculate[2][1])
        calculate[2][1] = math[a];
      calculate[2][2] = calculate[2][2] + math[a];
      if (math[a] < 60)
        calculate[2][3]++;
      else
        calculate[2][4]++;
    }
    calculate[2][2] = calculate[2][2] / num;

    // 輸出報表
    export();
    // System.out.println("\n【全班國文成績】\n" + export(0));
    // System.out.println("\n【全班英文成績】\n" + export(1));
    // System.out.println("\n【全班數學成績】\n" + export(2));
    while (true) {// 無窮迴圈
      int ifFind = 0;// 紀錄是否有搜尋結果
      String name_search;// 宣告字串搜尋名
      System.out.print("\n輸入姓名（查詢成績）：");// 輸出
      name_search = scanner.nextLine();// 輸入名稱
      if (name_search.toLowerCase().equals("bye") || name_search.toLowerCase().equals("0"))// 若輸入bye or 0
        break;// 跳出迴圈
      for (int a = 0; a < num; a++) {// 重複執行比對num次
        if (name_search.equals(name[a])) {// 若找到相同值
          System.out
              .println("【查詢結果】\n國文：" + chinese[a] + "（" + personal[a][0] + "）\n英文：" + english[a] + "（" + personal[a][1]
                  + "）\n數學：" + math[a] + "（" + personal[a][2] + "）\n平均：" + personal[a][4] + "（" + personal[a][5] + "）");// 輸出該項目之成績概況
          ifFind = 1;// 設為1表示找到
        } // if
      } // for
      if (ifFind == 0)// 若沒找到
        System.out.println("查無資料，請重新輸入！");// 輸出
    } // while
    System.out.println("系統結束！");// 輸出
  }// main()
}// class
