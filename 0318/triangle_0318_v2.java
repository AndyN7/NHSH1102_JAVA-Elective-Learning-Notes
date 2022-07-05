import java.util.*;//匯入函式庫

public class triangle_0318_v2 { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    double a, b, c;
    Scanner n = new Scanner(System.in);// 產生Scanner
    System.out.print("請輸入三角形之第一邊：");// 輸出不換行
    a = n.nextDouble();// 輸入a
    System.out.print("請輸入三角形之第二邊：");// 輸出不換行
    b = n.nextDouble();// 輸入b
    System.out.print("請輸入三角形之第三邊：");// 輸出不換行
    c = n.nextDouble();// 輸入c
    double s = (a + b + c) / 2;// 計算s
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));// 計算面積area，Math.sqrt -> 根號
    String reason = "reason";// 建立字串，內有預設文字
    double clen = a + b + c;// 計算邊長clen
    // 排序
    if (b > a) {
      double re = b;
      b = a;
      a = re;
    }
    if (c > a) {
      double re = c;
      c = a;
      a = re;
    }
    if (c > b) {
      double re = c;
      c = b;
      b = re;
    }
    // 排序結束

    String feed_tri = "", feed_sam = "", reason_sam = "", feed_angle = "";// 若無值無法執行

    // 是不是三角形feed_tri
    if (a >= b + c) {// 兩邊之和小於等於第三邊，不是三角形
      feed_tri = "不是";
      reason = a + ">=" + b + "+" + c;
      System.out.println("判斷結果：\n因" + reason + "，所以" + a + ", " + b + ", " + c + "不是三角形");
      System.out.println("周長：無法計算");
      System.out.println("面積：無法計算");
      System.exit(0);// 結束程式
    } else {// 是三角形
      feed_tri = "是";
    }

    // 是不是等腰or正三角形feed_sam
    if (a == b && b == c) {// 三邊等長為正三角形
      feed_sam = "正";
      reason = a + "=" + b + "=" + c;
    } else if (b == c) {// 若兩小邊等長則為等腰
      feed_sam = "等腰";
      reason_sam = "，且" + b + "=" + c;// 若為等腰必須加上此因素
    }

    // 是鈍角銳角直角feed_angle
    if (c * c + b * b == a * a) {// 畢氏定理判斷正三角形
      reason = a + "^2=" + b + "^2+" + c + "^2";
      feed_angle = "直角";
    } else if (c * c + b * b > a * a && !(a == b & b == c)) {// 兩小邊平方合大於第三邊平方且排除正三角形則為銳角
      reason = a + "^2<" + b + "^2+" + c + "^2";
      feed_angle = "銳角";
    } else if (c * c + b * b < a * a) {// 兩小邊平方合小於第三邊平方則為鈍角
      reason = a + "^2>" + b + "^2+" + c + "^2";
      feed_angle = "鈍角";
    }
    System.out.println(
        "判斷結果：\n因" + reason + reason_sam + "，所以" + a + ", " + b + ", " + c + feed_tri + feed_sam + feed_angle + "三角形");// 合併前述之原因及結果，一併輸出
    System.out.println("周長：" + clen);// 輸出換行
    System.out.println("面積：" + Math.round(area * 100.0) / 100.0);// 四捨五入至小數點後二位
  }// main()
}// class
