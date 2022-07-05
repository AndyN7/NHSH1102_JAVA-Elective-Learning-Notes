import java.util.*;//匯入函式庫

public class java0415 { // 類別名稱（class name）要與檔案名稱相同
    public static void main(String args[]) { // 主程式名稱、引數、小寫
        Scanner scanner = new Scanner(System.in);// 建立Scanner
        int y, m, d, md;// 宣告變數num
        String[] animal = { "鼠", "牛", "虎", "兔", "龍", "蛇", "馬", "羊", "猴", "雞", "狗", "豬" };
        String[] starsign = { "摩羯座", "水瓶座", "雙魚座", "白羊座", "金牛座", "雙子座", "巨蟹座", "獅子座", "處女座", "天秤座", "天蠍座", "射手座",
                "摩羯座" };// 宣告星座列表陣列
        int[] starsignmonth = { 0, 120, 219, 321, 421, 521, 622, 723, 823, 923, 1023, 1122, 1222, 1232 };// 宣告星座日期（格式：mmdd）
        do {// do while迴圈
            System.out.print("輸入出生年（民國）：");// 輸出不換行
            y = scanner.nextInt();// 使用者輸入值存入y
            System.out.print("輸入出生月：");// 輸出不換行
            m = scanner.nextInt();// 使用者輸入值存入m
            System.out.print("輸入出生日：");// 輸出不換行
            d = scanner.nextInt();// 使用者輸入值存入d
            if (y > 0 && m > 0 && d > 0) {// if判斷式
                // ----------平閏年----------
                if (((y + 1911) % 4 == 0 && (y + 1911) % 100 != 0) || (y + 1911) % 400 == 0) {// 判斷平閏年
                    System.out.println("\n判斷結果：\n民國" + y + "年為閏年，");// 輸出換行
                } else {// if
                    System.out.println("\n判斷結果：\n民國" + y + "年為平年，");// 輸出換行
                } // else
                  // ----------星座----------
                md = m * 100 + d;// 將月份及日期格式轉換為mmdd格式
                for (int a = 0; a < 13; a++) {// for迴圈比對星座
                    if (starsignmonth[a] < md && md < starsignmonth[a + 1]) {// if判斷星座範圍
                        System.out.println(m + "月" + d + "日是" + starsign[a] + "，");// 輸出星座換行
                    } // if
                } // for
                /*
                 * if (md < 120) {
                 * System.out.println(m + "月" + d + "日是摩羯座，");
                 * } else if (md < 219) {
                 * System.out.println(m + "月" + d + "日是水瓶座，");
                 * } else if (md < 321) {
                 * System.out.println(m + "月" + d + "日是雙魚座，");
                 * } else if (md < 421) {
                 * System.out.println(m + "月" + d + "日是白羊座，");
                 * } else if (md < 521) {
                 * System.out.println(m + "月" + d + "日是金牛座，");
                 * } else if (md < 622) {
                 * System.out.println(m + "月" + d + "日是雙子座，");
                 * } else if (md < 723) {
                 * System.out.println(m + "月" + d + "日是巨蟹座，");
                 * } else if (md < 823) {
                 * System.out.println(m + "月" + d + "日是獅子座，");
                 * } else if (md < 923) {
                 * System.out.println(m + "月" + d + "日是處女座，");
                 * } else if (md < 1023) {
                 * System.out.println(m + "月" + d + "日是天秤座，");
                 * } else if (md < 1122) {
                 * System.out.println(m + "月" + d + "日是天蠍座，");
                 * } else if (md < 1222) {
                 * System.out.println(m + "月" + d + "日是射手座，");
                 * } else if (md < 1232) {
                 * System.out.println(m + "月" + d + "日是摩羯座，");
                 * }
                 */
                // 生肖
                System.out.println("生肖：" + animal[(y % 12) - 1] + "\n");// 藉由陣列輸出生肖
                continue;
            } else {// if
                System.out.println("結束！");// 輸出結束敘述
                break;// 跳出迴圈
            } // else
        } while (y > 0 && m > 0 && d > 0);// 年月日必須大於零才會繼續迴圈
    }// main()
}// class
