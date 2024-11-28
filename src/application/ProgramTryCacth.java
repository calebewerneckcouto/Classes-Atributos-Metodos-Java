package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTryCacth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite palavras separadas por espaços:");
            String[] vect = sc.nextLine().split(" ");
            
            System.out.println("Digite o índice de uma palavra:");
            int position = sc.nextInt();

            System.out.println("Palavra na posição: " + vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do vetor.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida.");
        } finally {
            sc.close();
        }
    }
}
