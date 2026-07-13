package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

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
		Scene scene = new Scene(root,420,420,Color.LIGHTBLUE); // add root node to scene
		
		Text welcome = new Text("Welcome to the Calc!"); // text node
		welcome.setX(50); 
		welcome.setY(50);
		welcome.setFont(Font.font("Verdana",25));
		welcome.setFill(Color.FORESTGREEN);
		welcome.setRotate(9);
		
		Line seperator = new Line();
		seperator.setStartX(100);
		seperator.setStartY(100);
		seperator.setEndX(250);
		seperator.setEndY(100);
		seperator.setStrokeWidth(3);
		seperator.setStroke(Color.DARKRED);
		seperator.setOpacity(0.3); // 0 (invisible) - 1 (opaque)
		seperator.setRotate(3); // degrees
		
		Rectangle button = new Rectangle();
		button.setX(100);
		button.setY(200);
		button.setWidth(50);
		button.setHeight(50);
		button.setFill(Color.AQUA);
		button.setStrokeWidth(3);
		button.setStroke(Color.BLACK);
		
		Polygon bill = new Polygon(); // polygon = 3 points
		bill.getPoints().setAll( // double, cords
				250.0,200.0, // point 1
				300.0,300.0, // point 2
				200.0,300.0); // point 3
		bill.setFill(Color.YELLOW);
		
		Circle ball = new Circle();
		ball.setCenterX(350); // location of center
		ball.setCenterY(350);
		ball.setRadius(50);
		ball.setFill(Color.ORANGE);
		
		Image food = new Image("burger.png");
		ImageView imageView = new ImageView(food);
		imageView.setX(25);
		imageView.setY(250);
		
		root.getChildren().add(welcome);
		root.getChildren().add(seperator);
		root.getChildren().add(button);
		root.getChildren().add(bill);
		root.getChildren().add(ball);
		root.getChildren().add(imageView);
		Image icon = new Image("icon.png"); // icon in src
		stage.getIcons().add(icon);
		stage.setTitle("Elementry Calculator");
		stage.setX(420); // + = right, - = left
		stage.setY(300); // + = down, - = up
		stage.setScene(scene); // set the scene
		stage.show(); // show the stage
	}
}