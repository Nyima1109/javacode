package lab4;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
public class FxDemo extends Application {
public void start(Stage stage) {
	Label lbl=new Label("Email");
	TextField emailT=new TextField();
	Button ok=new Button("ok");
VBox vbox=new VBox(20,lbl,emailT,ok);
Scene scene= new Scene (vbox,500,500);
stage.setScene(scene);
stage.setTitle("Email Details");
stage.show();
}
public static void main(String args[]) {
	launch(args);
}
}
