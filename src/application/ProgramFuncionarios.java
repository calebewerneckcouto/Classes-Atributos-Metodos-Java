package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class ProgramFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionarios funcionarios = new Funcionarios();

		// Entrada de dados do funcionário
		System.out.print("Nome: ");
		funcionarios.name = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		funcionarios.GrossSalary = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionarios.tax = sc.nextDouble();
		
		// Exibe os dados iniciais do funcionário
		System.out.println("\nDados do funcionário: " + funcionarios);

		// Solicita a porcentagem de aumento
		System.out.print("\nQual a porcentagem para aumentar o salário? ");
		double percentage = sc.nextDouble();
		funcionarios.IncreaseSalary(percentage);

		// Exibe os dados atualizados
		System.out.println("\nDados atualizados: " + funcionarios);

		sc.close();
	}
}
