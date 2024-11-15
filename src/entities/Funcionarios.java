package entities;

public class Funcionarios {
	
	public String name;
	public double GrossSalary;
	public double tax;
	
	
	
	
	
	
	public double NetSalary(double GrossSalary) {
		return this.GrossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * (percentage / 100.0);
	}
	
	
	@Override
	public String toString() {
		return "Funcionário: " + name + ", $" + String.format("%.2f",NetSalary(GrossSalary) );
	}
}
