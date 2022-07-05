import java.util.*;//匯入函式庫

public class java0408 { // 類別名稱（class name）要與檔案名稱相同
    public static void main(String args[]) { // 主程式名稱、引數、小寫
        Scanner scanner = new Scanner(System.in);// 建立Scanner
        int num;// 宣告變數num
        do {// do while迴圈
            int times = 0, sum = 0;// 宣告變數times、sum，並於每次迴圈起始歸零
            System.out.print("輸入一個整數判斷完全數（輸入-1可結束）：");// 輸出不換行
            num = scanner.nextInt();// 使用者輸入值存入num
            int factor[] = new int[200];// 宣告陣列factor，用於存取因數，預設長度為200
            if (num > -1) {// if判斷式，若num>1才執行程式，若<1則跳出迴圈
                for (int a = 1; a <= num; a++) {// for迴圈，起始值為1，執行num次
                    if (num % a == 0 && num != a) {// 若該數為num之因數才執行
                        System.out.print(num + "可被" + a + "整除，");// 輸出因數，不換行
                        sum += a;// sum＝sum+a，紀錄目前加總值
                        times += 1;// times=times+1，紀錄因數數量
                        factor[times] = a;// 將a存入factor陣列之times項
                    } // if (num % a == 0 && num != a)
                } // for (int a = 1; a <= num; a++)
                System.out.print(num);// 輸出num不換行
                if (sum == num) {// 若sum＝num，即此數為完全數
                    System.out.print("==");// 輸出「等於」，不換行
                } else {// if (sum == num)
                    System.out.print("!=");// 輸出「不等於」，不換行
                } // else
                for (int a = 1; a <= times; a++) {// for迴圈，起始值為1，執行次數<=times
                    if (times - a >= 1) {// 若尚未輸出到最後一數
                        System.out.print(factor[a] + "+");// 輸出因數，陣列之a項，句末加上加號
                    } else {// if (times - a >= 1)
                        System.out.print(factor[a]);// 輸出因數，陣列之a項，句末不加上加號
                    } // else
                } // for (int a = 1; a <= times; a++)
                if (sum == num) {// 若sum＝num，即此數為完全數
                    System.out.print("，" + num + "為完全數！\n\n");// 輸出敘述不換行
                } else {// if (sum == num)
                    System.out.print("，" + num + "非完全數！\n\n");// 輸出敘述不換行
                } // else
                continue;// 繼續迴圈
            } else {// if (num > -1)
                System.out.println("結束！");// 輸出結束敘述
                break;// 跳出迴圈
            } // else
        } while (num > -1);// 當num>-1才繼續執行
    }// main()
} // class
