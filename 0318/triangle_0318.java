import java.util.*;//匯入函式庫

public class triangle_0318 { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    double a, b, c;
    Scanner n = new Scanner(System.in);// 產生Scanner
    System.out.print("請輸入三角形之第一邊：");// 輸出不換行
    a = n.nextFloat();// 輸入a
    System.out.print("請輸入三角形之第二邊：");// 輸出不換行
    b = n.nextFloat();// 輸入b
    System.out.print("請輸入三角形之第三邊：");// 輸出不換行
    c = n.nextFloat();// 輸入c
    double s = (a + b + c) / 2;//計算s
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));//計算面積area，Math.sqrt -> 根號
    String reason = "reason", result = "result";//建立字串，內有預設文字
    double clen = a + b + c;//計算邊長clen
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
    if (a > b + c) {
      reason = a + ">" + b + "+" + c;
      result = "不是三角形";
      clen = 0;
      area = 0;
    } else if (a == b && b == c) {
      reason = a + "=" + b + "=" + c;
      result = "是正三角形";
    } else if (c * c + b * b > a * a && c == b) {
      reason = a + "^2<" + b + "^2+" + c + "^2";
      result = "是等腰直角三角形";
    } else if (c * c + b * b == a * a) {
      reason = a + "^2=" + b + "^2+" + c + "^2";
      result = "是直角三角形";
    } else if (c * c + b * b > a * a && c == b) {
      reason = a + "^2<" + b + "^2+" + c + "^2";
      result = "是等腰銳角三角形";
    } else if (c * c + b * b < a * a && c == b) {
      reason = a + "^2>" + b + "^2+" + c + "^2";
      result = "是等腰鈍角三角形";
    } else if (c * c + b * b < a * a) {
      reason = a + "^2>" + b + "^2+" + c + "^2";
      result = "是鈍角三角形";
    } else if (c * c + b * b > a * a) {
      reason = a + "^2<" + b + "^2+" + c + "^2";
      result = "是銳角三角形";
    }
    System.out.println("判斷結果：\n因" + reason + "，所以" + a + ", " + b + ", " + c + result);
    System.out.println("周長：" + clen);
    System.out.println("面積：" + area);
  }// main()
}// class
