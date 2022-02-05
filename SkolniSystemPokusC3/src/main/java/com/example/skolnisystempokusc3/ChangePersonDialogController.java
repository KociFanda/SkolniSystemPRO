package com.example.skolnisystempokusc3;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChangePersonDialogController  {
    @FXML
    private TextField tfId;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfAge;

    private ObservableList<Person> appMainObservableList;

    public void setAppMainObservableList(ObservableList<Person> tvObservableList) {
        this.appMainObservableList = tvObservableList;

    }

    private void closeStage(ActionEvent event) {
        Node  source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void btnChangePersonClicked(ActionEvent actionEvent) {
        System.out.println("btnChangePersonClicked");


        int id = Integer.valueOf(tfId.getText().trim());
        String name = tfName.getText().trim();
        int iAge = Integer.valueOf(tfAge.getText().trim());
        Person data = new Person(id, name, iAge);

        for (int i = 0; i < appMainObservableList.size(); i++) {
            if (id == appMainObservableList.get(i).getId()) {

                appMainObservableList.remove(i);
                appMainObservableList.add(data);
            }
            else{
                System.out.printf("Couldnt find the id that was entered");
            }
        }
        closeStage(actionEvent);
    }

}
