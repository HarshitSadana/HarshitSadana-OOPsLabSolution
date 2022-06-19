package com.project.service;

import java.util.Random;
import com.project.model.Employee;

public class CredentialService {

	public char[] generatePassword() {
		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_+<>?-.=";

		String values = capital + small + numbers + specialCharacters;

		Random random = new Random();
		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".greatlearning.com";
	}

	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows ");
		System.out.println("Email    --> " + email);
		System.out.print("Password --> 1");
		System.out.print(generatedPassword);
	}
}