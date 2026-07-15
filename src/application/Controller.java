package application;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML // this annotation injects the values in Main.fxml into this class
	
	private ArrayList<Double> input = new ArrayList<>();
	
	public TextField textField;
	
	private boolean error = false;
	private double result = 0.0;
	private byte position = -1;
	private byte operation = 4;
	
	public void enterKey(ActionEvent e) {
		System.out.println("pressed");
		equals(e);
	}
	
	public void addition(ActionEvent e) {
		System.out.println("+");
		operation = 0;
	}
	
	public void subtraction(ActionEvent e) {
		System.out.println("-");
		operation = 1;	
	}
	
	public void multiplication(ActionEvent e) {
		System.out.println("*");
		operation = 2;
	}
	
	public void division(ActionEvent e) {
		System.out.println("/");
		operation = 3;
	}
	
	public void equals(ActionEvent e) {
		System.out.println("=");
		
		switch (operation) {
		case 0:
			System.out.println("addition");
			for (byte i = 0; i < input.size(); i++) {
				result += input.get(i);
				System.out.println("result = " + result);
			}
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
				System.out.println("i = " + i);
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
			textField.setText("" + result);
			input.clear();
			position = -1;
			result = 0.0;
		}
		
	}
	
	public void decimal(ActionEvent e) {
		System.out.println(".");
		//input.set(position++, );
	}
	
	public void clear(ActionEvent e) {
		System.out.println("c");
		input.clear();
		position = -1;
		result = 0.0;
		textField.setText("");
	}
	
	public void zero(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(0.0);
		textField.setText("" + 0.0);
		System.out.println("value = " + input.get(position)); 
	}
	
	public void one(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(1.0);
		textField.setText("" + 1.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void two(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(2.0);
		textField.setText("" + 2.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void three(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(3.0);
		textField.setText("" + 3.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void four(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(4.0);
		textField.setText("" + 4.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void five(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(5.0);
		textField.setText("" + 5.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void six(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(6.0);
		textField.setText("" + 6.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void seven(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(7.0);
		textField.setText("" + 7.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void eight(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(8.0);
		textField.setText("" + 8.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void nine(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(9.0);
		textField.setText("" + 9.0);
		System.out.println("value = " + input.get(position));
	}
	
}
