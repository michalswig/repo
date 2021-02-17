import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorld extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //FXMLLoader loader = new FXMLLoader();
        //loader.setLocation(new URL("c:\\Users\\michal\\IdeaProjects\\HelloWorldJavaFX\\resources\\vboxGUI.fxml"));
        //VBox vBoxFXML = loader.<VBox>load();
        primaryStage.setTitle("My first JavaFXApp");
        Stage stage = new Stage();

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(primaryStage);
        stage.initStyle(StageStyle.UNIFIED);
        //Label label = new Label("Hello JAVAFX");
        //VBox vBox = new VBox(new Label("JAVAFX Label"));
        VBox vBox = new VBox(new Label("JAVAFX Label"));
        vBox.getChildren().addAll(new Button("Cut"), new Button("Copy"), new Button("Paste"));
        Scene scene = new Scene(vBox, 400,200);
        primaryStage.setOnCloseRequest(event -> System.out.println("--closing stage--"));
        primaryStage.setScene(scene);
        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            System.out.println("key pressed " + event.toString());
            switch (event.getCode().getCode()) {
                case 27: {
                    primaryStage.close();
                    break;
                }
                case 10: {
                    primaryStage.setWidth(primaryStage.getWidth()*2);
                }
                default: {
                    System.out.println("unrecognized key");
                }
            }
                });

        primaryStage.show();
        stage.showAndWait();
    }
}
