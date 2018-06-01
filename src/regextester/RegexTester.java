/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regextester;

import java.io.IOException;
import java.util.EnumSet;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Toshiba
 */
public class RegexTester extends Application {

    @FXML
    Button btOk, btCancel;
    @FXML
    TextField txString, txRegex, txOutput;
    @FXML
    TextArea taString, taRegex, taOutput;

    @FXML
    protected void handleCancel(ActionEvent event) {

    }

    @FXML
    protected void handleOk(ActionEvent event) {
        String str, reg, out, hstr, hreg, hout, temp_str, temp_reg, temp_out;
//        try {
            str = txString.getText().toString();
            reg = txRegex.getText().toString();

            temp_str = taString.getText();
            temp_reg = taRegex.getText();
            temp_out = taOutput.getText();

            temp_str += str + "\n";
            temp_reg += reg + "\n";
            if (str.matches(reg)) {
                out = "Match";
            } else {
                out = "Null";
            }
            temp_out += out + "\n";
            txString.setText(txString.getText());
            txRegex.setText(reg);
            txOutput.setText(out);
            taString.setText(temp_str);
            taRegex.setText(temp_reg);
            taOutput.setText(temp_out);
//        } catch (Exception e) {
//            System.out.println("Error \t"+e.toString());
//        }
    }

    @FXML
    protected void handleCancle(ActionEvent event) {

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Regex.fxml"));
        loader.setController(this);
        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setTitle("REGEX TESTER");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setAlwaysOnTop(true);
        primaryStage.resizableProperty().setValue(false);

//        primaryStage.set
//        boolean siza = primaryStage.resizableProperty().getValue();
//        System.out.println("siza: "+siza);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
// fx:controller="topaz.example.address.view.PersonEditDialogController"
