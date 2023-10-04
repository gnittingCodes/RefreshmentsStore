package scrum.a2.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import scrum.a2.VendingMachine;
import java.util.HashMap;
import javafx.scene.text.Text;
import javafx.util.Pair;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.control.ComboBox;

public class RoleModifyController  implements Controller{
    private Pane pane;
    private VendingMachine model;
    private Scene scene;
    @FXML
    private Text message;
    private HashMap<String, Controller> sceneController = new HashMap<String, Controller>();


    @FXML
    private Button add;

    @FXML
    private ComboBox<String> roleOptions;

    @FXML
    private TextField userTextArea;

    @FXML
    void addRole(ActionEvent event) {
        System.out.println(userTextArea.getText());
        System.out.println(roleOptions.getValue());
        Pair<Boolean, String> role = this.model.changeRole(userTextArea.getText(),roleOptions.getValue());
        // this.scene.setRoot(this.sceneController.get("operation-verify").getPane());
        if(role.getKey()){

            OperationVerifyController controller = (OperationVerifyController )this.sceneController.get("operation-verify");
            controller.setMessage(role.getValue());
            this.scene.setRoot(this.sceneController.get("operation-verify").getPane());
        }else{
            this.message.setText(role.getValue());
        }

    }

   
    public void setPane(Pane pane){
        this.pane = pane;
    }
    public void setModel(VendingMachine model){
        this.model = model;
        this.roleOptions.getItems().addAll("CUSTOMER","SELLER", "CASHIER", "OWNER");
        this.roleOptions.getSelectionModel().select("CUSTOMER");
    }
    public void setSceneController(HashMap<String, Controller> sceneController){
        this.sceneController = sceneController;
    }

    public void setScene(Scene scene){
        this.scene = scene;
    }
    public Pane getPane(){
        return this.pane;
    }
    public void setRole(String role){
        this.roleOptions.getSelectionModel().select(role);
    }
    public void setUp(){
        this.message.setText("");
        this.userTextArea.setText("");
        this.roleOptions.getSelectionModel().select("CUSTOMER");
        

    }
    @FXML
    void back(MouseEvent event) {
        this.sceneController.get("login").setUp();
        this.scene.setRoot(this.sceneController.get("login").getPane());
    }
   
    
}
