package co.grandcircus;

import java.util.Scanner;

// this is a concrete class that can be used over and over again
// you can also add your own validation methods here
// methods are called by other classes with Validator.methodName(args)
public class Validator {

	public static String getString(Scanner scan, String prompt) {
		System.out.print(prompt);
		String s = scan.next(); // read user entry
		scan.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				if (d > 0) {
					isValid = true;
				} else
					System.out.println("Error! Invalid decimal value. Try again.");
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static String getStringMatchingRegex(Scanner scan, String prompt, String regex) {
		boolean isValid = false;

		String input;

		do {
			input = getString(scan, prompt);
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Invalid entry. Please try again.");
			}
		} while (!isValid);
		return input;
	}
}