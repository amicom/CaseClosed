package startup;

import de.codecentric.centerdevice.javafxsvg.SvgImageLoaderFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage ps){
        SvgImageLoaderFactory.install();

        // ps = primary stage
         ps.setTitle("Case Closed - Please login");
            ps.setMinHeight(775);
            ps.setMinWidth(400);

        //TODO: build a better system for managing false fxml loading

        try {
//            Parent load = FXMLLoader.load(LoadGUI.getUrl(MainLogin.class));
            URL resource = getClass().getClassLoader().getResource("fxml/login/login.fxml");
            Parent load = FXMLLoader.load(resource);
            ps.setScene(new Scene(load,800,400));
            ps.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
