import java.util.*;//匯入函式庫

public class bmi_0325 { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    Scanner input = new Scanner(System.in);// 產生Scanner
    double height, weight;// 宣告身高及體重之變數
    do { // 使用do while，以確保第一次能執行
      System.out.print("輸入身高（公分）：");// 輸出不換行
      height = input.nextDouble();// 輸入身高存入height
      System.out.print("輸入體重（公斤）：");
      weight = input.nextDouble();// 輸入體重存入weight
      if (height >= 20 && weight >= 20) {// 若身高或體重小於20則跳過
        double bmi = Math.round(weight / (height * height / 10000) * 100.0) / 100.0;// 計算BMI
        System.out.println("BMI: " + bmi);// 輸出BMI值
        if (bmi < 18.5) {// 依BMI判斷體位狀況
          System.out.println("體重過輕！\n");
        } else if (bmi < 24) {
          System.out.println("健康體位！\n");
        } else if (bmi < 27) {
          System.out.println("體位異常！過重啦！\n");
        } else if (bmi < 30) {
          System.out.println("體位異常！輕度肥胖！\n");
        } else if (bmi < 35) {
          System.out.println("體位異常！中度肥胖！\n");
        } else {
          System.out.println("體位異常！重度肥胖！\n");
        }
      }
    } while (height >= 20 && weight >= 20);// 若身高及體重均>=20才重複迴圈
  } // main()
} // class
