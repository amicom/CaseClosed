package login;

import javafx.animation.ScaleTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.CacheHint;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


public class Login {
    public Button regBtn;
    public VBox loginContainer;


    @FXML
    void initialize() {
//        regBtn.managedProperty().bind(regBtn.visibleProperty());

        double w = loginContainer.getBoundsInParent().getWidth();
        double h = loginContainer.getBoundsInParent().getHeight();




//        loginContainer.getChildren().remove(0,4);


        loginContainer.prefWidth(w);
        loginContainer.prefHeight(h);

//        loginContainer.setEffect(null);



        Platform.runLater(new Runnable() {
            public void run() {
//
                loginContainer.setCache(true);
                loginContainer.setCacheShape(true);
                loginContainer.setCacheHint(CacheHint.SCALE);


                Thread thread = new Thread(() -> {
                    try {
                        Thread.sleep(1000);


                        DropShadow effect = (DropShadow) loginContainer.effectProperty().get();




                        ScaleTransition st = new ScaleTransition(Duration.millis(2000), loginContainer);
                        st.setByY(0.5);
                        st.play();




//                        final Timeline timeline = new Timeline();


                        st.setOnFinished(event -> loginContainer.setCacheHint(CacheHint.QUALITY));






//                        final KeyValue kv = new KeyValue(effect.colorProperty(), Color.TRANSPARENT);
//                        final KeyValue kv = new KeyValue(loginContainer.scaleYProperty(), 1.5);
//                        final KeyFrame kf = new KeyFrame(Duration.millis(1000),kv);
//                        timeline.getKeyFrames().add(kf);
//                        timeline.play();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();


            }
        });




    }

    public void regBtn(ActionEvent event) {
//        loginContainer.setVisible(false);
//
//        if(regBtn.isVisible()){
//            regBtn.setVisible(false);
//        }else regBtn.setVisible(true);






//        ((Pane) loginContainer.getParent()).getChildren().remove(loginContainer);
    }
}
