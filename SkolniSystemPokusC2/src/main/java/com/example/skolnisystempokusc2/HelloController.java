package com.example.skolnisystempokusc2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {
    public Button changes;
    public Button overview;
    public TextArea inputGrade;
    public TextArea inputName;
    public Label label1JMENO;
    public Label label2ZNAMKA;
    public Label label3;
    public Label label4ZNAMKA;
    public Label label5;
    public Label label6ZNAMKA;
    public Label label7;
    public Label label8ZNAMKA;
    public Label label9;
    public Label label10ZNAMKA;
    public Label label11;
    public Label label12ZNAMKA;
    private String action;

    public void setStageChanges(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("changes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Změny");
        stage.show();

    }
    public void setStageOverview(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage = new Stage();
        stage.setTitle("Studenti rozvrh/známky");
        stage.setScene(scene);
        stage.show();
    }

    public void chossedActionAdd(ActionEvent actionEvent) {
        action = "ADD";
    }

    public void chossedActionDelete(ActionEvent actionEvent) {
        action="DELETE";
    }

    public void chossedActionChange(ActionEvent actionEvent) {
        action = "CHANGE";
    }

    public void ProvestAkci(MouseEvent mouseEvent) {
        System.out.println(action);
        switch (action){
            case "ADD":
                label1JMENO.setText(inputName.getText());
                label2ZNAMKA.setText(inputGrade.getText());
                break;
            case "DELETE":
                label1JMENO.setText("");
                label2ZNAMKA.setText("");
                break;
            case "CHANGE":
                label1JMENO.setText(inputName.getText());
                label2ZNAMKA.setText(inputGrade.getText());
                break;
        }

    }
}
