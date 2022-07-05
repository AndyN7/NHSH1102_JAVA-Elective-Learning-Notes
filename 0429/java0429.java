import java.util.*;//匯入函式庫

public class java0429 { // 類別名稱（class name）要與檔案名稱相同
    public static void main(String args[]) { // 主程式名稱、引數、小寫
        Scanner scanner = new Scanner(System.in);// 建立Scanner
        int num, time, score, sum, max, min;// 宣告變數
        do {
            sum = 0;
            max = -1;// 成績勢必大於-1
            min = 101;// 成績勢必小於101
            time = 0;// 每次開始變數值初始化
            System.out.print("輸入人數：");// 輸出
            num = scanner.nextInt();// 輸入存入num
            if (num < 1)
                break;// 人數若為0或負數則直接跳出
            do {// do while迴圈
                time++;// 輸入次數計算
                System.out.println("\n輸入第" + time + "位數學段考成績（整數）:");// 輸出引導敘述
                score = scanner.nextInt();// 輸入成績
                if (score <= 100 && score >= 0) {// 若輸入分數正確
                    System.out.println("＞第" + time + "位數學段考成績：" + score);// 輸出分數等第
                    System.out.print("＞等第：");
                    switch (score / 10) {// 判斷成績等第
                        case 10:// 100
                        case 9:// 90~99
                            System.out.println("優");
                            break;
                        case 8:// 80~89
                            System.out.println("甲");
                            break;
                        case 7:// 70~79
                            System.out.println("乙");
                            break;
                        case 6:// 60~69
                            System.out.println("丙");
                            break;
                        default:// 0~59
                            System.out.println("丁");
                            break;
                    }// switch
                    sum = sum + score;// 加入總數
                    if (score > max)// 若成績大於現有最大值
                        max = score;// 取代現有最大值
                    if (score < min)// 若成績小於現有最小值
                        min = score;// 取代現有最小值
                } else {// else
                    System.out.println("＞無法判斷");// 若成績輸入錯誤
                    time = time - 1;// 為免計算平均時錯誤，次數減一，此次不算
                }
            } while (num > time);// 次數尚未到達目標次數時重複
            System.out.println("\n==========REPORT==========");
            System.out.print("平均：" + (sum / time) + "\n平均之等第：");// 輸出平均
            switch (sum / time / 10) {// 判斷平均之等第
                case 10:
                case 9:
                    System.out.println("優");
                    break;
                case 8:
                    System.out.println("甲");
                    break;
                case 7:
                    System.out.println("乙");
                    break;
                case 6:
                    System.out.println("丙");
                    break;
                default:
                    System.out.println("丁");
                    break;
            }// switch
            System.out.println("最高分：" + max + "\n最低分：" + min + "\n");// 輸出最高最低分
        } while (num > 0);// 輸入人數大於０時重複執行
        System.out.println("系統結束！");// 輸出
    }// main()
}// class
