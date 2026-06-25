package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

// stage is like the window
// scene is what we add stuff to (resizes automatically)
// nodes are components that we add

public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args); //static method
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Group root = new Group(); // grouping of nodes
		Scene scene = new Scene(root, Color.BLACK); // needs root node
		
		Image icon = new Image("icon.png"); // icon in src
		stage.getIcons().add(icon);
		stage.setTitle("Elementry Calculator");
		stage.setWidth(420); // in pixels
		stage.setHeight(420);
		//stage.setResizable(false);
		stage.setX(0);
		stage.setY(50); // + = down, - = up
		
		stage.setScene(scene); // set the scene
		stage.show(); // show the stage
	}
}