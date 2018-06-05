package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.security.Key;

public class Controller {
    @FXML
    private TextField textField;

    @FXML
    public void keyPress(KeyEvent keyEvent) {
        if(keyEvent.getCode().equals(KeyCode.ENTER) && !(textField.getText().equals(""))) {
            popup();
        }

        if (!(textField.getText().equals(""))) {
            closeButton
        }
    }

    @FXML
    public void popup() {
        final double POPUP_WIDTH = 200;
        final double POPUP_HEIGHT = 200;
        Stage popupWindow = new Stage();

        Text messageText = new Text(textField.getText());
        messageText.setWrappingWidth(POPUP_WIDTH);

        Button closeButton = new Button("Close");
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                popupWindow.close();
            }
        });

        GridPane gridPane = new GridPane();
        gridPane.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.ENTER)) {
                    popupWindow.close();
                }
            }
        });
        gridPane.setPadding(new Insets(10));
//        gridPane.setGridLinesVisible(true);

        GridPane.setColumnIndex(messageText,0);
        GridPane.setRowIndex(messageText,0);
        GridPane.setColumnIndex(closeButton,0);
        GridPane.setRowIndex(closeButton,1);

//        GridPane.setHalignment(closeButton, HPos.RIGHT);

        gridPane.getChildren().addAll(messageText, closeButton);

        Scene scene = new Scene(gridPane, POPUP_WIDTH, POPUP_HEIGHT);

        popupWindow.setTitle("Popup");
        popupWindow.setScene(scene);
        popupWindow.show();
    }
}
