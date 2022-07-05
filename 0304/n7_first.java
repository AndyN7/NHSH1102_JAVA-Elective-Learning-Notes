import java.util.*;//匯入函式庫

public class n7_first { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    System.out.print("Please Input Your NAME:");
    Scanner sca = new Scanner(System.in);// 產生Scanner物件，鍵盤輸入
    String name = sca.next();
    System.out.println("嗨 " + name + "！我是N.7.");// 輸出、換行
    System.out.println("在現在資訊時代，資訊在未來可看性相當高。\n");// 輸出、換行
    System.out.print("而我想學Java是因為以前時常看到\n網路上有高手製作java程式來解決問題，\n我也希望我能製作出簡單的程式讓生活更方便。\n\n");// 輸出不換行
    System.out.print("寫完第一支程式，看到實際執行成果後，\n我覺得很有成就感，相信未來能寫出更多更專業、好用的程式。\n\n");
    System.out.print(
        "我一開始寫Java時遇到頗大的問題，\n因為我使用Mac電腦，有些地方不太相容，\n所幸在我上網研究後成功解決問題。\n\n而我目前使用Visual Studio Code撰寫程式碼，\n而後再用VS Code內建或Mac終端機編譯執行。");// 全部以;結束
  }// main()
}// class
