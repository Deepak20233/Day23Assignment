package com.java;
import java.util.*;
import java.util.regex.Pattern;
public class LastName {
    
	public static void main(String[] args) {
		validateLastName();

	}
	public static void validateLastName() {
		Scanner lNameInput = new Scanner(System.in);
		System.out.println("Enter last name: ");
		String lName = lNameInput.nextLine();

		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);

		if (pattern.matcher(lName).matches()) {
			System.out.println("Last name: " + lName + " is valid.");
		} else {
			System.out.println("Last name: " + lName + " is invalid.");
		}

	}
}
