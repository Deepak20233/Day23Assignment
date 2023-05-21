package com.java;

import java.util.regex.Pattern;
import java.util.Scanner;

public class PasswordRule3 {
	static Scanner passwordInput = new Scanner(System.in);
	public static void main(String[] args) {
		
		validatePassword();
	}
	/*
	 * Password rule - 3: At least one numeric number in password
	 */
	public static void validatePassword() {
		
		System.out.println("Enter password: ");
		String password = passwordInput.nextLine();
		
	    String regex = "(?=.*\\d)(?=.*[A-Z])[a-zA-Z0-9@#$%^&*()]{8,}$"; 
		Pattern pattern = Pattern.compile(regex);
		if (pattern.matcher(password).matches()) {
			System.out.println("Password: " + password + " is valid.");
		} else {
			System.out.println("Password: " + password + " is invalid.");
		}

	}
}
