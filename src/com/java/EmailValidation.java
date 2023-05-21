package com.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation   {

	public static void main(String[] args) {
		validateEmail();
	}
       
		public static void validateEmail() {
        Scanner emailInput = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = emailInput.nextLine();

		//String regex = "^[a-z0-9]{1,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";
		String regex ="^[\\w!#$%&’+/=?`{|}~^-]+(?:\\.[\\w!#$%&’+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		if (pattern.matcher(email).matches()) {
			System.out.println("Email: " + email + " is valid.");
		} else {
			System.out.println("Email: " + email + " is invalid.");
		}

	}
	}
