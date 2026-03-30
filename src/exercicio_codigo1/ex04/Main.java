package exercicio_codigo1.ex04;

public class Main {
    public static void main(String[] args) {

        double saldoConta = 2100.0;
        double valorSaque = 10;

        if (valorSaque <= 0) {
            System.out.println("Valor invalido");
        } else if (saldoConta < valorSaque) {
            System.out.println("Saldo insuficiente");
        } else {
            double novoSaldo = saldoConta - valorSaque;
            System.out.printf("Novo Saldo: %.2f ", novoSaldo);
        }
    }
}
