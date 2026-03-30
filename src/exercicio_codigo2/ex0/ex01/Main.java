package exercicio_codigo2.ex0.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        int idade = input.nextInt();
        double nota = input.nextDouble();

        if (idade <= 0) {
            System.out.println("Erro, idade deve ser maior que 0");

        } else if (nota < 0 || nota > 10) {
            System.out.println("Erro, nota deve ser entre 0 e 10");
        } else {
            System.out.println("Dados valido");
            System.out.printf("Aluno: %s idade: %d Nota: %.2f %n", nome, idade, nota);
        }

        input.close();
    }
}
