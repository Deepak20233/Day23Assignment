package com.java;

import java.util.regex.Pattern;
import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		validateMobileNumber();
	}

        public static void validateMobileNumber() {
        Scanner mobileInput = new Scanner(System.in);
		System.out.println("Enter mobile no: ");
		String mobile = mobileInput.nextLine();

		String regex = "^(91[ ])?[6-9]\\d{9}$";
		Pattern pattern = Pattern.compile(regex);
		if (pattern.matcher(mobile).matches()) {
			System.out.println("Mobile No: " + mobile + " is valid.");
		} else {
			System.out.println("Mobile No: " + mobile + " is invalid.");
		}

	}
}