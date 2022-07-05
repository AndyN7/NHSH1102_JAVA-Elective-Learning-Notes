import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VocQuiz2Gui extends Application {
	Label question = new Label("");
	Label feedbackText = new Label("-------------------------feedback-------------------------");
	TextField anstf = new TextField("");
	Button quizcheck = new Button("check");
	Button quiznext = new Button("next");
	Label questionfeedback1 = new Label("");
	Label questionfeedback2 = new Label("");
	TextArea review = new TextArea("");
	Boolean ifn = true;
	Boolean ifc = true;

	// three parallel arrays
	int[] record = new int[10];
	String[] prob = { "羞愧", "尊敬", "濕氣", "空閒的", "勤勉的", "藥", "獨佔", "鋼鐵", "刮鬍刀", "代理人" };
	String[] ans = { "shame", "respect", "moisture", "idle", "diligent", "medicine",
			"monopoly", "steel", "razor", "agent" };

	String response;
	int score = 0, i = 0, n = 0;

	public void start(Stage primaryStage) {
		review.setEditable(false);
		for (i = 0; i < record.length; i++) {
			record[i] = 0;

		}
		i = 0;

		setQuestion(ifn);

		quizcheck.setOnAction(e -> {
			response = anstf.getText();
			checkAns(ifc);
		});

		quiznext.setOnAction(e -> {
			anstf.setText("");// input String type data from anstf textfield
			setQuestion(ifn);
		});

		HBox hbox1 = new HBox(question, anstf, quizcheck, quiznext);
		HBox hbox2 = new HBox(questionfeedback1, questionfeedback2);
		VBox vbox = new VBox(hbox1, hbox2, feedbackText, review);
		hbox1.setSpacing(5);
		hbox2.setSpacing(5);
		vbox.setSpacing(5);
		Scene scene = new Scene(vbox, 400, 300);
		primaryStage.setTitle("voc_quiz2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void setQuestion(Boolean ifnext) {
		if (ifnext) {
			if (i < 10 && n == 0) {
				question.setText("'" + prob[i] + "'的英文字彙:");
			} else {
				ifn = false;
				ifc = false;
				question.setText("");
				if (score != 100)
					questionfeedback2.setText("===請加強下列英文字彙==== ");
				for (i = 0; i < prob.length; i++) {
					if (record[i] <= 0)
						review.appendText("'" + prob[i] + "'的英文字彙: " + ans[i] + "\n");
				}
			}
		}
	}

	public void checkAns(Boolean ifnext) {
		if (ifnext) {
			if (response.toLowerCase().equals(ans[i])) {
				record[i]++;// ==1 第一次就答對
				score = (n <= 10) ? score + 10 - n : score;
				questionfeedback2.setText("");
				questionfeedback1.setText("Correct! Your score:" + score);
				i++;
				n = 0;
				ifn = true;
				if (i < 10 && n != 0)
					questionfeedback2.setText("'" + prob[i] + "'的英文字彙:" + "(" + ans[i].charAt(0) + "....)");// hint the first char
			} else {
				record[i]--;
				n++;
				questionfeedback1.setText("Incorrect! Your score:" + score);
				ifn = false;
				if (i < 10 && n != 0)
					questionfeedback2.setText("'" + prob[i] + "'的英文字彙:" + "(" + ans[i].charAt(0) + "....)");// hint the first char
			}
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
