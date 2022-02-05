package com.example.skolnisystempokusc3;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RemovePersonDialogController  {

    @FXML
    private TextField tfId;

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

    public void btnRemovePersonClicked(ActionEvent actionEvent) {
        System.out.println("btnRemovePersonClicked");
        //lecgou
        int id = Integer.valueOf(tfId.getText().trim());

            for (int i = 0; i < appMainObservableList.size(); i++) {
                if (id == appMainObservableList.get(i).getId()){
                    appMainObservableList.remove(i);
                }
                else {
                    System.out.printf("Couldnt find the id that was entered");
                }
            }
        closeStage(actionEvent);
    }
}