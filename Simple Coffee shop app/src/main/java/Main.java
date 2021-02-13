
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		 try {
	            // Read file fxml and draw interface.
	            Parent root = FXMLLoader.load(getClass()
	                    .getResource("/FXML/Myfxml.fxml"));
	 
	            primaryStage.setTitle("My Application");
             Scene s1 = new Scene(root, 250,400);
             s1.getStylesheets().add("/styles/style1.css");
	            primaryStage.setScene(s1);
	            primaryStage.show();
	        } catch(Exception e) {
	            e.printStackTrace();
	            System.exit(1);
	        }
	}
	
	//Text text = new Text();
	
	public static void main(String[] args) {
		launch(args);
	}
}
