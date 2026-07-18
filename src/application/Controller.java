package application;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;

public class Controller {
	
	@FXML // this annotation injects the values in Main.fxml into this class
	
	private ArrayList<Double> input = new ArrayList<>();
	
	public TextField textField;
	public ToggleButton themeButton;
	public AnchorPane anchorPane;
	
	private boolean error = false;
	private boolean firstAddition = true;
	private double result = 0.0;
	private byte position = -1;
	private byte operation = 4;
	private byte lastInput = -1;
	
	public void theme(ActionEvent e) {
		
		if (themeButton.isSelected()) 
		    anchorPane.setStyle("-fx-background-color: \"black\";");
		else 
			anchorPane.setStyle(null);
	}
	
	public void enterKey(ActionEvent e) {
		
		System.out.println("test: " + textField.getText().charAt(0)); 
		
		
		if (textField.getText().isBlank()) {
			System.out.println("nothing to enter");
		}
		else {
			equals(e);
		}
	}
	
	public void addition(ActionEvent e) {
		System.out.println("addition");
		switch(lastInput) {
		case 10:
			System.out.println("+ already entered");
			break;
		default:
			lastInput = 10;
			textField.setText(textField.getText() + " + ");
			operation = 0;
			break;
		}
	}
	
	public void subtraction(ActionEvent e) {
		switch(lastInput) {
		case 11:
			System.out.println("- already entered");
			break;
		default:
			lastInput = 11;
			textField.setText(textField.getText() + " - ");
			operation = 1;
			break;
		}
	}
	
	public void multiplication(ActionEvent e) {
		switch(lastInput) {
		case 12:
			System.out.println("* already entered");
			break;
		default:
			lastInput = 12;
			textField.setText(textField.getText() + " * ");
			operation = 2;
			break;
		}
	}
	
	public void division(ActionEvent e) {
		switch(lastInput) {
		case 13:
			System.out.println("/ already entered");
			break;
		default:
			lastInput = 13;
			textField.setText(textField.getText() + " / ");
			operation = 3;
			break;
		}
	}
	
	public void equals(ActionEvent e) {
		System.out.println("=");
		lastInput = 14;
		System.out.println("test result: " + result);
		
		switch (operation) {
		case 0:
			System.out.println("Addition");
			System.out.println("size: " + input.size());
			System.out.println("first:" + input.getFirst());
			System.out.println("second: " + input.get(1));
			if (firstAddition == true)
				for (byte i = 0; i < input.size(); i++)
					result += input.get(i);
			if (firstAddition == false)
				for (byte i = 1; i < input.size(); i++)
					result += input.get(i);
			break;
		case 1:
			System.out.println("subtraction");
			result = input.getFirst();
			
			for (byte i = 1; i < input.size(); i++) {
				result -= input.get(i);
				System.out.println("result = " + result);
			}
			break;
		case 2:
			System.out.println("multiplication");
			result = input.getFirst();
			for (byte i = 1; i < input.size(); i++) {
				result *= input.get(i);
				System.out.println("result = " + result);
			}
			break;
		case 3:
			System.out.println("division");
			result = input.getFirst();
			for (byte i = 1; i < input.size(); i++) {
				result /= input.get(i);
				System.out.println("result = " + result);
			}
			break;
		default: 
			System.out.println("error, no operation selected");
			textField.setText("error, no operation selected");
			error = true;
			break;
		}
		
		if (error == false) 
		{
			System.out.println("final result: " + result);
			textField.setText(" = " + result);
			input.clear();
			input.add(result);
			position = -1;
			operation = 4;
			firstAddition = false;
		}
		
	}
	
	public void decimal(ActionEvent e) {
		System.out.println(".");
		lastInput = 15;
		//input.set(position++, );
	}
	
	public void negative(ActionEvent e) {
		
		if (lastInput <= 9) {
			
		}
		else {
			
		}
			
		
		switch (lastInput) {
		case 16:
			System.out.println("(-) already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			break;
		default:
			lastInput = 16;
			textField.setText(textField.getText() + "(-)");
			break;
		}
	}
	
	public void clear(ActionEvent e) {
		input.clear();
		position = -1;
		result = 0.0;
		operation = 4;
		lastInput = -1;
		firstAddition = true;
		textField.setText("");
	}
	
	public void zero(ActionEvent e) {
		switch (lastInput) {
		case 0:
			System.out.println("0 already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			clear(e);
			break;
		case 16:
			lastInput = 0;
			position++;
			System.out.println("position = " + position);
			input.add(-0.0);
			textField.setText(textField.getText() + -0.0);
			System.out.println("value = " + input.get(position)); 
			break;
		default:
			lastInput = 0;
			position++;
			System.out.println("position = " + position);
			input.add(0.0);
			textField.setText(textField.getText() + 0.0);
			System.out.println("value = " + input.get(position)); 
			break;
		}
	}
	
	public void one(ActionEvent e) {
		switch (lastInput) {
		case 1:
			System.out.println("1 already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			break;
		case 16:
			lastInput = 1;
			position++;
			System.out.println("position = " + position);
			input.add(-1.0);
			textField.setText(textField.getText() + -1.0);
			System.out.println("value = " + input.get(position)); 
			break;
		default:
			lastInput = 1;
			position++;
			System.out.println("position = " + position);
			input.add(1.0);
			textField.setText(textField.getText() + 1.0);
			System.out.println("value = " + input.get(position)); 
			break;
		}
	}
	
	public void two(ActionEvent e) {
		switch (lastInput) {
		case 2:
			System.out.println("2 already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			break;
		case 16:
			lastInput = 2;
			position++;
			System.out.println("position = " + position);
			input.add(-2.0);
			textField.setText(textField.getText() + -2.0);
			System.out.println("value = " + input.get(position)); 
			break;
		default:
			lastInput = 2;
			position++;
			System.out.println("position = " + position);
			input.add(2.0);
			textField.setText(textField.getText() + 2.0);
			System.out.println("value = " + input.get(position)); 
			break;
		}
	}
	
	public void three(ActionEvent e) {
		switch (lastInput) {
		case 3:
			System.out.println("3 already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			break;
		case 16:
			lastInput = 3;
			position++;
			System.out.println("position = " + position);
			input.add(-3.0);
			textField.setText(textField.getText() + -3.0);
			System.out.println("value = " + input.get(position)); 
			break;
		default:
			lastInput = 3;
			position++;
			System.out.println("position = " + position);
			input.add(3.0);
			textField.setText(textField.getText() + 3.0);
			System.out.println("value = " + input.get(position)); 
			break;
		}
	}
	
	public void four(ActionEvent e) {
		switch (lastInput) {
		case 4:
			System.out.println("4 already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			break;
		case 16:
			lastInput = 4;
			position++;
			System.out.println("position = " + position);
			input.add(-4.0);
			textField.setText(textField.getText() + -4.0);
			System.out.println("value = " + input.get(position)); 
			break;
		default:
			lastInput = 4;
			position++;
			System.out.println("position = " + position);
			input.add(4.0);
			textField.setText(textField.getText() + 4.0);
			System.out.println("value = " + input.get(position)); 
			break;
		}
	}
	
	public void five(ActionEvent e) {
		switch (lastInput) {
		case 5:
			System.out.println("5 already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			break;
		case 16:
			lastInput = 5;
			position++;
			System.out.println("position = " + position);
			input.add(-5.0);
			textField.setText(textField.getText() + -5.0);
			System.out.println("value = " + input.get(position)); 
			break;
		default:
			lastInput = 5;
			position++;
			System.out.println("position = " + position);
			input.add(5.0);
			textField.setText(textField.getText() + 5.0);
			System.out.println("value = " + input.get(position)); 
			break;
		}
	}
	
	public void six(ActionEvent e) {
		switch (lastInput) {
		case 6:
			System.out.println("6 already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			break;
		case 16:
			lastInput = 6;
			position++;
			System.out.println("position = " + position);
			input.add(-6.0);
			textField.setText(textField.getText() + -6.0);
			System.out.println("value = " + input.get(position)); 
			break;
		default:
			lastInput = 6;
			position++;
			System.out.println("position = " + position);
			input.add(6.0);
			textField.setText(textField.getText() + 6.0);
			System.out.println("value = " + input.get(position)); 
			break;
		}
	}
	
	public void seven(ActionEvent e) {
		switch (lastInput) {
		case 7:
			System.out.println("7 already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			break;
		case 16:
			lastInput = 7;
			position++;
			System.out.println("position = " + position);
			input.add(-7.0);
			textField.setText(textField.getText() + -7.0);
			System.out.println("value = " + input.get(position)); 
			break;
		default:
			lastInput = 7;
			position++;
			System.out.println("position = " + position);
			input.add(7.0);
			textField.setText(textField.getText() + 7.0);
			System.out.println("value = " + input.get(position)); 
			break;
		}
	}
	
	public void eight(ActionEvent e) {
		switch (lastInput) {
		case 8:
			System.out.println("8 already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			break;
		case 16:
			lastInput = 8;
			position++;
			System.out.println("position = " + position);
			input.add(-8.0);
			textField.setText(textField.getText() + -8.0);
			System.out.println("value = " + input.get(position)); 
			break;
		default:
			lastInput = 8;
			position++;
			System.out.println("position = " + position);
			input.add(8.0);
			textField.setText(textField.getText() + 8.0);
			System.out.println("value = " + input.get(position)); 
			break;
		}
	}
	
	public void nine(ActionEvent e) {
		switch (lastInput) {
		case 9:
			System.out.println("9 already entered");
			break;
		case 14:
			System.out.println("operator not entered");
			break;
		case 16:
			lastInput = 9;
			position++;
			System.out.println("position = " + position);
			input.add(-9.0);
			textField.setText(textField.getText() + -9.0);
			System.out.println("value = " + input.get(position)); 
			break;
		default:
			lastInput = 9;
			position++;
			System.out.println("position = " + position);
			input.add(9.0);
			textField.setText(textField.getText() + 9.0);
			System.out.println("value = " + input.get(position)); 
			break;
		}
	}
	
}