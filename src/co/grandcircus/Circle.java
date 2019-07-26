package co.grandcircus;

import java.util.Scanner;

public class Circle {
	Scanner scan = new Scanner(System.in);
	private double radius;

	public Circle(double radius) {
		this.radius = Validator.getDouble(scan, "Enter the radius of a circle: ");
			return;
	}

	public double getCircumference() {
		return 2 * Math.PI * this.radius;
	}

	public double getArea() {
		return Math.PI * (this.radius * this.radius);
	}

	private static String formatNumber(double x) {
		return String.format("%.2f", x);
	}

	public String getFormattedCircumference() {
		return this.formatNumber(getCircumference());
	}
	
	public String getFormattedArea() {
		return this.formatNumber(getArea());
	}

}
