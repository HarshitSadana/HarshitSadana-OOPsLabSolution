package com.project.main;

import java.util.Scanner;
import com.project.model.Employee;
import com.project.service.CredentialService;

public class Main {

	public static void main(String[] args) {
		Employee em = new Employee("Harshit", "Sadana");
		CredentialService cs = new CredentialService();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = sc.nextInt();

		switch (option) {
		case 1:
			String email1 = cs.generateEmailAddress(em.getFirstName().toLowerCase(), em.getLastName().toLowerCase(), "tech");
			char[] password1 = cs.generatePassword();
			cs.showCredentials(em, email1, password1);
			break;
		case 2:
			String email2 = cs.generateEmailAddress(em.getFirstName().toLowerCase(), em.getLastName().toLowerCase(), "admin");
			char[] password2 = cs.generatePassword();
			cs.showCredentials(em, email2, password2);
			break;
		case 3:
			String email3 = cs.generateEmailAddress(em.getFirstName().toLowerCase(), em.getLastName().toLowerCase(), "hr");
			char[] password3 = cs.generatePassword();
			cs.showCredentials(em, email3, password3);
			break;
		case 4:
			String email4 = cs.generateEmailAddress(em.getFirstName().toLowerCase(), em.getLastName().toLowerCase(), "legal");
			char[] password4 = cs.generatePassword();
			cs.showCredentials(em, email4, password4);
			break;
		default: 
			System.out.println("Please enter a valid Department");
		}

	}

}
