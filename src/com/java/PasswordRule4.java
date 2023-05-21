package com.java;

import java.util.regex.Pattern;
import java.util.Scanner;

public class PasswordRule4 {

	public static void main(String[] args) {
		validatePassword();

	}
	/*
	 * Password rule - 4: At least one special character in password
	 */
	public static void validatePassword() {
		Scanner passwordInput = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = passwordInput.nextLine();

		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$"; 
		Pattern pattern = Pattern.compile(regex);
		if (pattern.matcher(password).matches()) {
			System.out.println("Password: " + password + " is valid.");
		} else {
			System.out.println("Password: " + password + " is invalid.");
		}

	}
}