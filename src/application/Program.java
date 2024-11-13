package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	       Triangle x,y;
	       x= new Triangle();
	       y = new Triangle();
	
		System.out.println("Entre com as medidas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Entre com as medidas do triangulo y:");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		double areaX = x.area();
		
		double areay = y.area();

		System.out.printf("Triangulo X  area : %.4f%n", areaX);
		System.out.printf("Triangulo y  area : %.4f%n", areay);

		if (areaX > areay) {
			System.out.println("X tem area maior");
		} else {
			System.out.println("Y tem area maior");

		}

	}

}
