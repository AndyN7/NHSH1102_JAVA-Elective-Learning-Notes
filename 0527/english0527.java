import java.util.*;//匯入函式庫
import java.security.SecureRandom;//隨機函式庫

public class english0527 { // 類別名稱（class name）要與檔案名稱相同
  public static void main(String args[]) { // 主程式名稱、引數、小寫
    String[][] list = { // 題庫
        { "blow up", "bring up", "bring up", "call off", "do over", "fill out", "fill up", "find out", "give away",
            "give back", "hand in", "hang up", "hold up", "hold up", "leave out", "look over", "look up", "make up",
            "make out", "pick out", "pick up", "point out", "put away", "put off", "put on", "put out", "read over",
            "set up", "take down", "take off", "talk over", "throw away", "try on", "try out", "turn down", "turn down",
            "turn off", "turn off", "turn on", "turn up", "use up", "call on", "call on", "get over", "go over",
            "go through", "look after", "look into", "run across", "run into", "take after", "wait on", "break in on",
            "catch up with", "check up on", "come up with", "cut down on", "drop out of", "get along with",
            "get away with", "get rid of", "get through with", "keep up with", "look forward to", "look down on",
            "look in on", "look out for", "look up to", "make sure of", "put up with", "run out of", "take care of",
            "talk back to", "think back on", "walk out on", "break down", "catch on", "come back", "come in", "come to",
            "come over", "drop by", "eat out", "get by", "get up", "go back", "go on", "go on", "grow up", "keep away",
            "keep on", "pass out", "show off", "show up", "wake up" },
        { "爆炸(2)", "提起(2)", "養育，扶養(2)", "取消(2)", "重複，重做(2)", "填好(2)", "填滿(2)", "發現(2)", "贈送(2)", "歸還(2)", "呈遞，繳交(2)",
            "懸掛；掛斷電話(2)", "使延遲(2)", "搶劫(2)", "省略，遺漏(2)", "檢查，查看(2)", "尋找 (某物)，在 (字典中) 查明(2)", "虛構，捏造(2)", "聽到，瞭解(2)",
            "挑選(2)", "舉起，抬起(2)", "引起注意(2)", "儲蓄，儲存(2)", "延期(2)", "穿、戴 (衣物、帽子等)(2)", "熄滅(2)", "詳讀(2)", "布置，開始(2)",
            "記下(2)", "脫去 (衣、帽)(2)", "討論(2)", "丟棄，拋棄(2)", "試穿，試戴(2)", "嚴格地試驗(2)", "降低音量(2)", "拒絕(2)", "關掉 (電燈等)(2)",
            "排斥(2)", "打開 (電燈等)(2)", "調高音量(2)", "用光，用盡(2)", "叫 (學生) 背誦；要求做(2)", "拜訪(2)", "(自生病或失望中) 復原，痊癒(2)", "複習(2)",
            "用完，耗盡(2)", "照顧，照料(2)", "調查(2)", "偶遇(2)", "偶遇，遇見(2)", "像，相似(2)", "伺候，服務(2)", "打斷 (交談)(3)", "追及，趕上(3)",
            "檢查，調查(3)", "建議，捐獻(3)", "縮減 (開支)(3)", "中途退學(3)", "相處融洽(3)", "逃避處罰(3)", "除去(3)", "完成(3)",
            "趕得上，保持與.....同樣的速度(3)", "快樂地期盼，盼望(3)", "輕視，瞧不起(3)", "順道拜訪 (某人)(3)", "注意查看，預見(3)", "尊敬(3)", "查明(3)", "忍耐(3)",
            "耗盡(3)", "負責，照顧(3)", "反唇相譏，頂嘴(3)", "憶起，記起(3)", "遺棄(3)", "損壞，故障(2)", "變得流行(2)", "回到 (某地)(2)", "進入(2)",
            "恢復知覺(2)", "訪問(2)", "未事先約定地造訪(2)", "在 (餐廳等) 用餐(2)", "存活(2)", "起床，起來(2)", "回到 (某地)(2)", "繼續(2)", "發生(2)",
            "長大(2)", "遠離(2)", "繼續 (做某事)(2)", "昏厥，失去知覺(2)", "炫耀(2)", "出現(2)", "起床，喚醒(2)" },
        { "The terrorists tried to blow up the railroad station.",
            "My mother brought up that little matter of my prison record again.",
            "It isn't easy to bring up children nowadays.", "They called off this afternoon's meeting",
            "Do this homework over.", "Fill out this application form and mail it in.",
            "She filled up the grocery cart with free food.",
            "My sister found out that her husband had been planning a surprise party for her.",
            "The filling station was giving away free gas.",
            "My brother borrowed my car. I have a feeling he's not about to give it back.",
            "The students handed in their papers and left the room.",
            "She hung up the phone before she hung up her clothes.",
            "I hate to hold up the meeting, but I have to go to the bathroom.",
            "Three masked gunmen held up the Security Bank this afternoon.",
            "You left out the part about the police chase down Asylum Avenue.",
            "The lawyers looked over the papers carefully before questioning the witness. (They looked them over carefully.)",
            "You've misspelled this word again. You'd better look it up.",
            "She knew she was in trouble, so she made up a story about going to the movies with her friends.",
            "He was so far away, we really couldn't make out what he was saying.",
            "There were three men in the line-up. She picked out the guy she thought had stolen her purse.",
            "The crane picked up the entire house. (Watch them pick it up.)",
            "As we drove through Paris, Francoise pointed out the major historical sites.",
            "We put away money for our retirement. She put away the cereal boxes.",
            "We asked the boss to put off the meeting until tomorrow. (Please put it off for another day.)",
            "I put on a sweater and a jacket. (I put them on quickly.)",
            "The firefighters put out the house fire before it could spread. (They put it out quickly.)",
            "I read over the homework, but couldn't make any sense of it.",
            "My wife set up the living room exactly the way she wanted it. She set it up.",
            "These are your instructions. Write them down before you forget.",
            "It was so hot that I had to take off my shirt.",
            "We have serious problems here. Let's talk them over like adults.",
            "That's a lot of money! Don't just throw it away.",
            "She tried on fifteen dresses before she found one she liked.",
            "I tried out four cars before I could find one that pleased me.",
            "Your radio is driving me crazy! Please turn it down.",
            "He applied for a promotion twice this year, but he was turned down both times.",
            "We turned off the lights before anyone could see us.",
            "It was a disgusting movie. It really turned me off.", "Turn on the CD player so we can dance.",
            "Grandpa couldn't hear, so he turned up his hearing aid.",
            "The gang members used up all the money and went out to rob some more banks.",
            "The teacher called on students in the back row.",
            "The old minister continued to call on his sick parishioners.",
            "I got over the flu, but I don't know if I'll ever get over my broken heart.",
            "The students went over the material before the exam. They should have gone over it twice.",
            "They country went through most of its coal reserves in one year. Did he go through all his money already?",
            "My mother promised to look after my dog while I was gone.",
            "The police will look into the possibilities of embezzlement.",
            "I ran across my old roommate at the college reunion.",
            "Carlos ran into his English professor in the hallway.", "My second son seems to take after his mother.",
            "It seemed strange to see my old boss wait on tables.",
            "I was talking to Mom on the phone when the operator broke in on our call.",
            "After our month-long trip, it was time to catch up with the neighbors and the news around town.",
            "The boys promised to check up on the condition of the summer house from time to time.",
            "After years of giving nothing, the old parishioner was able to come up with a thousand-dollar donation.",
            "We tried to cut down on the money we were spending on entertainment.",
            "I hope none of my students drop out of school this semester.",
            "I found it very hard to get along with my brother when we were young.",
            "Janik cheated on the exam and then tried to get away with it.",
            "The citizens tried to get rid of their corrupt mayor in the recent election.",
            "When will you ever get through with that program?",
            "It's hard to keep up with the Joneses when you lose your job!",
            "I always look forward to the beginning of a new semester.",
            "It's typical of a jingoistic country that the citizens look down on their geographical neighbors.",
            "We were going to look in on my brother-in-law, but he wasn't home.",
            "Good instructors will look out for early signs of failure in their students",
            "First-graders really look up to their teachers.",
            "Make sure of the student's identity before you let him into the classroom.",
            "The teacher had to put up with a great deal of nonsense from the new students.",
            "The runners ran out of energy before the end of the race.",
            "My oldest sister took care of us younger children after Mom died.",
            "The star player talked back to the coach and was thrown off the team.",
            "I often think back on my childhood with great pleasure.",
            "Her husband walked out on her and their three children.",
            "That old Jeep had a tendency to break down just when I needed it the most.",
            "Popular songs seem to catch on in California first and then spread eastward.",
            "Father promised that we would never come back to this horrible place.",
            "They tried to come in through the back door, but it was locked.",
            "He was hit on the head very hard, but after several minutes, he started to come to again.",
            "The children promised to come over, but they never do.",
            "We used to just drop by, but they were never home, so we stopped doing that.",
            "When we visited Paris, we loved eating out in the sidewalk cafes.",
            "Uncle Heine didn't have much money, but he always seemed to get by without borrowing money from relatives.",
            "Grandmother tried to get up, but the couch was too low, and she couldn't make it on her own.",
            "It's hard to imagine that we will ever go back to Kaohsiung.",
            "He would finish one Dickens novel and then just go on to the next.",
            "The cops heard all the noise and stopped to see what was going on.",
            "Charles grew up to be a lot like his father.",
            "The judge warned the stalker to keep away from his victim's home.",
            "He tried to keep on singing long after his voice was ruined.",
            "He had drunk too much; he passed out on the sidewalk outside the bar.",
            "Whenever he sat down at the piano, we knew he was going to show off.",
            "Day after day, Efrain showed up for class twenty minutes late.", "I woke up when the rooster crowed." } };// 題庫end
    int[] record = new int[list[0].length];// 建立一與題庫等長之陣列紀錄答題狀況
    int[] roundrecord = new int[list[0].length];// 紀錄此輪答過之題目
    Scanner answerIn = new Scanner(System.in);// 建立Scanner
    Scanner numIn = new Scanner(System.in);// 輸入數值的Scanner
    SecureRandom sr = new SecureRandom();// 建立隨機變數SecureRandom
    int num, qunum = 0, misrecord = 0, times = 0, ifallpass = 0, ifallplay = 0, ifmisans = 0;
    String ans;// 字串ans用於存取輸入值
    boolean ask = true;// 布林
    while (ask) {// 遊戲迴圈
      misrecord = 0;// 錯題數歸零
      while (true) {// 輸入題數迴圈
        System.out.print("請輸入測驗題數（1~" + list[0].length + ")：");// 輸入作答題數，最大值為題庫長度
        num = numIn.nextInt();// 輸入一整數
        if (num < 1 || num > list[0].length) {// 若輸入錯誤
          System.out.println("請重新輸入！");// 輸出
        } else {// 若輸入正確
          break;// 跳出while
        } // if else
      } // while
      Arrays.fill(roundrecord, 0);
      for (int a = 1; a <= num; a++) {// 出題迴圈
        ifallpass = 1;// 初始值
        ifallplay = 1;// 全部都出過？
        ifmisans = 1;// 此輪錯題都玩過？
        for (int i = 0; i < list[0].length; i++) {// 重複檢查每個紀錄
          if (record[i] > 0) {// 若有任何一大於零代表還有錯題沒練
            ifallpass = 0;// 設為０
            ifallplay = 0;
          } else if (record[i] > -1) {// 若有任一大於-1代表還有題目沒答過
            ifallplay = 0;// 設為0
          } // else if
          if (record[i] > 0 && roundrecord[i] == 0)
            ifmisans = 0;
        } // for
        while (true) {// 隨機取數
          qunum = sr.nextInt(list[0].length);// 取變數，長度為題庫長度
          if (ifallplay == 1)
            break;// 全部題目都出現過則不限
          if (ifallpass == 1 || ifmisans == 1) {// 全部都已答對（or初始）
            if (record[qunum] == 0)// 選沒答過的
              break;
          } else {// 有錯題
            if (record[qunum] > 0) {// 若此題有答錯紀錄
              record[qunum] = 0;// 選此題並歸零
              break;// 跳出while
            }
          } // if else
        } // while
        System.out.print("｜第 " + a + " 題｜" + list[1][qunum] + "：");// 出題
        while (true) {// 回答迴圈
          ans = answerIn.nextLine();// 輸入答案
          if (ans.toLowerCase().equals(list[0][qunum])) {// 答對
            System.out
                .println("答對！\n\n【正解】\n" + list[0][qunum] + "\n" + list[1][qunum] + "\ne.g. " + list[2][qunum] + "\n");// 輸出答對
            if (record[qunum] == 0) {// 若沒答錯過
              record[qunum] = -1;// 設為-1代表第一次就答對
            } // if
            roundrecord[qunum] = 1;// 此題答過
            break;// 答對就跳出
          } else {// 答錯
            misrecord = misrecord - record[qunum] + 1;// 答錯題數不能重複計算
            record[qunum]++;// 答錯次數
            System.out.print("答錯！提示 ");// 提示
            if (record[qunum] == 1) {// 若第一次答錯提示字首
              System.out.print(list[0][qunum].charAt(0) + "＿＿：");
            } else {// 超過一次提示字尾
              System.out
                  .print(list[0][qunum].charAt(0) + "＿＿" + list[0][qunum].charAt(list[0][qunum].length() - 1) + "：");
            } // if else第幾次答錯
          } // if else答對與否
        } // while回答
      } // 出題迴圈
      System.out.println("【結果統計】\n測驗" + num + "題\n答對" + (num - misrecord) + "題\n" + "答錯" + misrecord + "題\n答對率"
          + ((num * 100 - misrecord * 100) / num)
          + "%\n\n");// 統計輸出
      if (misrecord > 0) {
        System.out.println("【錯誤題目】\n英文 — 中文 — 答錯次數\n––––––––––––––––––––––––––––––––––––––––");
        for (int i = 0; i < record.length; i++) {// 重複輸出錯題
          if (record[i] > 0) {// 若有答錯紀錄
            System.out.println(list[0][i] + " — " + list[1][i] + " — " + record[i] + "次");// 輸出
          } // if有無答錯紀錄
        } // for重複找錯題
      } // if有錯題
      times++;// 遊戲輪數
      System.out.print("\n是否要繼續挑戰？[Y/N]");// 輸出
      while (true) {// 輸入是否繼續挑戰
        String ifContinue = answerIn.nextLine();// 使用者輸入
        if (ifContinue.toLowerCase().equals("n")) {// 若輸入n則不重複
          ask = false;
          break;
        } else if (ifContinue.toLowerCase().equals("y")) {// 若為y則重複
          ask = true;
          break;
        } else {
          System.out.println("請重新輸入：");
        }
      } // while
    } // while重複遊戲
    System.out.println("祝你學習英文順利！");
  }// main()
}// class
