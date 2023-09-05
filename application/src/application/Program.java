package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("enter with the measure of Triangle X:");
		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();
		System.out.println("enter with the measure of Triangle Y:");
		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();
		
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.println("the area of triangle X is: " + areax);
		System.out.println("the area of triangle Y is: " + areay);
		
		if(areax > areay) {
			System.out.println("The area of the triangle x is bigger");
		}
		else {
			System.out.println("The area of the triangle y is bigger");
		}
	}

}
