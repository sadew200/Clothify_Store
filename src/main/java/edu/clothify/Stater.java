package edu.clothify;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Stater extends Application {
    static Stage stage;
    public static void main(String[] args){
        launch();
    }


    public static void setUI (String path) {
        if(stage==null){
            stage=new Stage();
        }
        try {
            stage.setScene(new Scene(FXMLLoader.load(Stater.class.getResource("/View/"+path+".fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @Override
    public void start(Stage stage) throws Exception {
        setUI("index");
    }
}
