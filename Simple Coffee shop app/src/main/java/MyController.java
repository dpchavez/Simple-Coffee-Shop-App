

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
public class MyController implements Initializable {
	
	@FXML
	private VBox root;
	
	@FXML
	private VBox root2;
    
    @FXML
    private TextField putText;

    
	
    Coffee BCoffee = new BasicCoffee();
    
   // Barista barista = new Barista(BCoffee);

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
        
	}
    //method so that the controller created for second view can update the text
    //field with the text from the first view
    public void RegCoffee(){
        BCoffee.makeCoffee();
  
    }
    
    public void AddCream(){
    	System.out.println("  + Cream $.50");
    }
    
    public void AddSugar() 
    {
    	System.out.println("  + Sugar $.50");
    }
    
    
    public void AddMocha() 
    {
    	System.out.println("  + Mocha $.50");
    }
   
	
    public void AddExtraShot() 
    {
    	System.out.println("  + extra shot: $1.20");
    }
    
    public void AddIce() 
    {
    	System.out.println("  + Ice $.10");
    }
    
    
    
    
	public void makeRegCoffee(ActionEvent e) throws IOException {

        //get instance of the loader class
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Myfxml2.fxml"));
        Parent root2 = loader.load(); //load view into parent
        MyController myctr = loader.getController();//get controller created by FXMLLoader
        myctr.RegCoffee();//use MyLoader class method for setText()
        
        root2.getStylesheets().add("/styles/style2.css");//set style
        
        root.getScene().setRoot(root2);//update scene graph
        
	}
	
	
	
	
	
	
	public void b1Method(ActionEvent e) throws IOException{
      
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Myfxml2.fxml"));
        Parent root = loader.load();
        MyController myctr = loader.getController();
        myctr.AddMocha();
        root.getStylesheets().add("/styles/style2.css");//set style
        root2.getScene().setRoot(root);
        

	}
	
	public void b2Method(ActionEvent e) throws IOException{
	      
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Myfxml2.fxml"));
        Parent root = loader.load();
        MyController myctr = loader.getController();
        myctr.AddSugar();
        root.getStylesheets().add("/styles/style2.css");//set style
        root2.getScene().setRoot(root);
    

	}
	
	public void b3Method(ActionEvent e) throws IOException{
	      
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Myfxml2.fxml"));
        Parent root = loader.load();
        MyController myctr = loader.getController();
        myctr.AddCream();
        root.getStylesheets().add("/styles/style2.css");//set style
        root2.getScene().setRoot(root);
    

	}
	
	public void b4Method(ActionEvent e) throws IOException{
	      
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Myfxml2.fxml"));
        Parent root = loader.load();
        MyController myctr = loader.getController();
        myctr.AddExtraShot();
        root.getStylesheets().add("/styles/style2.css");//set style
        root2.getScene().setRoot(root);
    

	}
	
	public void b5Method(ActionEvent e) throws IOException{
	      
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Myfxml2.fxml"));
        Parent root = loader.load();
        MyController myctr = loader.getController();
        myctr.AddIce();
        root.getStylesheets().add("/styles/style2.css");//set style
        root2.getScene().setRoot(root);
    

	}
	
	
	public void b6Method(ActionEvent e) throws IOException{
	      System.out.println("Goodbye!");
	}
	
	

}
