// Brian Hudson
package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// initial setup
		Scanner scan = new Scanner(System.in);
		int circleCount = 0;
		String cont = "y";
		System.out.println("Let's build some circles!");
		
		// main loop
		while (cont.equalsIgnoreCase("y")) {
		Circle newCircle = new Circle(0);
		circleCount++;
		
		System.out.println("Circumference: " + newCircle.getFormattedCircumference()); 
		System.out.println("Area: " + newCircle.getFormattedArea());
		cont = Validator.getStringMatchingRegex(scan, "Build another? (y/n) ", "[YyNn]");
		}
		System.out.println("Exiting! We built " + circleCount + " circles!");
	}

}
