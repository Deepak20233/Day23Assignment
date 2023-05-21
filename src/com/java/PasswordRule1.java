package com.java;

import java.util.regex.Pattern;
import java.util.Scanner;

public class PasswordRule1 {

	public static void main(String[] args) {
		validatePassword();

	}

	public static void validatePassword() {
		Scanner passwordInput = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = passwordInput.nextLine();
/*
 * Password rule - 1: Minimum 8 characters
 */
	    String regex = "^[a-zA-z0-9!@#$%^&*()?]{8,}$"; // UC5
		Pattern pattern = Pattern.compile(regex);
		if (pattern.matcher(password).matches()) {
			System.out.println("Password: " + password + " is valid.");
		} else {
			System.out.println("Password: " + password + " is invalid.");
		}

	}
}