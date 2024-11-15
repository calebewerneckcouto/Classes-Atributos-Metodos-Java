package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {
	
	
	public static void main (String[]args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e altura do retangulo: ");
		retangulo.Width = sc.nextDouble();
		retangulo.Height = sc.nextDouble();
		
		
		
		
		
		System.out.println("Area: " +retangulo.Area() );
		System.out.println("Perimetro: " +retangulo.Perimeter() );
		System.out.println("Diagonal: " +retangulo.Diagonal() );
		
		
		
	}

}
