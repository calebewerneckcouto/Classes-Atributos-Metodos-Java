package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class ProgramAlunos {
	
	public static void main(String[]args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Alunos alunos = new Alunos();
		
		System.out.println("Informe o nome do Aluno:");
		
		alunos.setNome(sc.nextLine());
        
		System.out.println("Informe as 3 notas:");
		
		alunos.setN1(sc.nextDouble());
		alunos.setN2(sc.nextDouble());
		alunos.setN3(sc.nextDouble());
		
	System.out.println(alunos.Student(alunos.getN1(),alunos.getN2(),alunos.getN3()));
		
		
		
		sc.close();
	}

}
