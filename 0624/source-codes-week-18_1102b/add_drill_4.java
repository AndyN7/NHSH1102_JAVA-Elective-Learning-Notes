import java.security.SecureRandom;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class add_drill_4 extends Application{
  Label question = new Label("");
  Label feedbackText = new Label("--feedback---");
  TextField reply = new TextField("");
  Button quizcheck = new Button("check");
  Button quiznext = new Button("next");
  Label review = new Label("");
  int n1=0,n2= 0, response, score=0, i=0;

  public void start(Stage primaryStage) {
	reply.setEditable(true);
	genQuestion();
	quizcheck.setOnAction(e->{
	   response =  Integer.valueOf(reply.getText());
//input data from reply textfield
	   checkAns(); //Integer.parseInt
	});		
	quiznext.setOnAction(e->{
	   reply.setText("");//clear reply textfield
	   genQuestion();
	});
	HBox hbox1 = new HBox(question,reply,quizcheck,quiznext);
	VBox vbox = new VBox(hbox1,feedbackText,review);
	hbox1.setSpacing(5);
	vbox.setSpacing(5);
	Scene scene = new Scene(vbox,400,150);//����
	primaryStage.setTitle("�[�k�m��");
	primaryStage.setScene(scene);//�R�O������
	primaryStage.show();//�R�O
  }//start
 public void genQuestion(){
   SecureRandom sr = new SecureRandom();
   i++;
   n1 = sr.nextInt(10);//�X�D
   n2 = sr.nextInt(10);//�X�D
   question.setText("��"+i+"�D: "+n1+"+"+n2+"=");//����D��
  }//genQuestion
 public void checkAns(){
    if (response== n1+n2) {
          score=score+10;
          feedbackText.setText("����AGREAT!! \nYour score:"+score+"��.");}
    else
          feedbackText.setText("inCorrect! \nYour score:"+score);
  }//checkAns

 public static void main(String[] args){
		launch(args); 
	}//main
}//class
