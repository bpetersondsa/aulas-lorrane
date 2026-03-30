package exercicio_codigo2.ex0.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senha = 1234;
        int tentativas = 0;
        int login;

        while (tentativas < 3) {
            login = input.nextInt();

            if (login == senha) {
                System.out.println("Acesso liberado");
                input.close();
                return;
            }
            tentativas++;
        }
        System.out.println("Acesso Bloqueado!");
        input.close();

    }
}
