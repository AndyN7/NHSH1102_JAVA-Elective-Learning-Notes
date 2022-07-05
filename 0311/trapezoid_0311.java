import java.util.*;

public class trapezoid_0311 { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    Scanner sca = new Scanner(System.in);// 產生Scanner物件，鍵盤輸入
    float up, down, high, area;// 宣告四個變數
    System.out.print("輸入梯形上底（公分）：");// 輸出、換行
    up = sca.nextFloat();// 抓取輸入變數「上底」
    System.out.print("輸入梯形下底（公分）：");// 輸出、換行
    down = sca.nextFloat();// 抓取輸入變數「下底」
    System.out.print("輸入梯形高（公分）：");// 輸出、換行
    high = sca.nextFloat();// 抓取輸入變數「高」
    System.out.println("/n以下為你輸入的內容：");
    System.out.println("上底：" + up + "公分/n下底：" + down + "公分/n高：" + high + "公分");// 先輸出三個數值
    area = (up + down) * high / 2;// 計算面積
    System.out.println("/n面積是：" + area + "平方公分");// 輸出面積變數area
  }// main()
}// class
