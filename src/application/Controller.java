package application;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
	
	@FXML // this annotation injects the values in Main.fxml into this class
	
	private byte position = -1;
	private double result = 0.0;
	
	private ArrayList<Double> input = new ArrayList<>();
	private ArrayList<Double> order = new ArrayList<>();
	
	public void addition(ActionEvent e) {
		System.out.println("+");
		for (byte i = 0; i < input.size(); i++) {
			result += input.get(i);
			System.out.println("result = " + result);
		}
	}
	
	public void subtraction(ActionEvent e) {
		System.out.println("-");
		result = input.getFirst();
		System.out.println("res: " + result);
		
		for (byte i = 1; i < input.size(); i++) {
			result -= input.get(i);
			System.out.println("result = " + result);
		}
		
		input.clear();	
		position = -1;
	}
	
	public void multiplication(ActionEvent e) {
		System.out.println("*");
		result = input.getFirst();
		for (byte i = 1; i < input.size(); i++) {
			System.out.println("i = " + i);
			result *= input.get(i);
			System.out.println("result = " + result);
		}
		input.clear();	
		position = -1;
	}
	
	public void division(ActionEvent e) {
		System.out.println("/");
		result = input.getFirst();
		for (byte i = 1; i < input.size(); i++) {
			result /= input.get(i);
			System.out.println("result = " + result);
		}
		input.clear();	
		position = -1;
	}
	
	public void equals(ActionEvent e) {
		System.out.println("result:" + result);
		input.clear();
		position = -1;
		result = 0.0;
	}
	
	public void decimal(ActionEvent e) {
		System.out.println(".");
		input.set(position, null);
	}
	
	public void zero(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(0.0);
		System.out.println("value = " + input.get(position)); 
	}
	
	public void one(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(1.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void two(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(2.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void three(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(3.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void four(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(4.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void five(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(5.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void six(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(6.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void seven(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(7.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void eight(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(8.0);
		System.out.println("value = " + input.get(position));
	}
	
	public void nine(ActionEvent e) {
		position++;
		System.out.println("position = " + position);
		input.add(9.0);
		System.out.println("value = " + input.get(position));
	}
	
}
