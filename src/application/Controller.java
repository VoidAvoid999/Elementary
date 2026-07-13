package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Arc;

public class Controller {
	
	@FXML // this annotation injects the values in Main.fxml into this class
	private Arc pacMan;
	private double x;
	private double y;
	
	public void up(ActionEvent e) {
		System.out.println("Up Up Up!");
		pacMan.setCenterY(y-=10);  
	}
	
	public void down(ActionEvent e) {
		System.out.println("Down Down Down!");
		pacMan.setCenterY(y+=10);  
	}
	
	public void left(ActionEvent e) {
		System.out.println("Left Left Left!");
		pacMan.setCenterX(x-=10);  
	}
	
	public void right(ActionEvent e) {
		System.out.println("Right Right Right!");
		pacMan.setCenterX(x+=10);  
	}
	
}
