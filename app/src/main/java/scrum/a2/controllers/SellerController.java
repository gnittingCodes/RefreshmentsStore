package scrum.a2.controllers;

import javafx.event.ActionEvent;
import scrum.a2.VendingMachine;

import java.util.HashMap;
import javafx.util.Pair;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class SellerController implements Controller{
    
    private Pane pane;
    private VendingMachine model;
    private Scene scene;
    private HashMap<String, Controller> sceneController = new HashMap<String, Controller>();
    private boolean isOwner = false;
   
    @FXML
    void modifyProduct(ActionEvent event) {
        this.sceneController.get("product-list").setUp();
        this.scene.setRoot(this.sceneController.get("product-list").getPane());

    }


    @FXML
    void reportProduct(ActionEvent event) {
        Pair<Boolean,String> msg = this.model.generateAvailableProductsReport();
        OperationVerifyController controller = (OperationVerifyController )this.sceneController.get("operation-verify");
        controller.setMessage(msg.getValue());
        
        this.scene.setRoot(this.sceneController.get("operation-verify").getPane());
    }


    @FXML
    void summaryProduct(ActionEvent event) {
        Pair<Boolean,String> msg = this.model.generateProductsSoldReport();
        OperationVerifyController controller = (OperationVerifyController )this.sceneController.get("operation-verify");
        controller.setMessage(msg.getValue());
        this.scene.setRoot(this.sceneController.get("operation-verify").getPane());

    }
    
    public void setPane(Pane pane){
        this.pane = pane;
    }
    public void setModel(VendingMachine model){
        this.model = model;
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
    public void setUp(){

    }
    @FXML
    void logout(MouseEvent event) {
        this.model.logout();
        this.sceneController.get("login").setUp();
        this.scene.setRoot(this.sceneController.get("login").getPane());
    }
}
