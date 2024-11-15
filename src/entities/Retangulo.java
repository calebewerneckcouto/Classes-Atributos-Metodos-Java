package entities;

public class Retangulo {

	public double Width;
	public double Height;

	public double Area() {
		return Width * Height;
	}

	public double Perimeter() {
		return (Width * 2) + (Height * 2);
	}

	public double Diagonal() {

		double diagonal = (Math.pow(Width, 2) + Math.pow(Height, 2));
		return Math.sqrt(diagonal);
	}
}
