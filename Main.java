import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Neto";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;


        System.out.println("***************************");
        System.out.println("\nOlá " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Seu saldo é: " + saldo);
        System.out.println("\n***************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            
            if (opcao == 1) {
                System.out.println("O seu saldo disponivel é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência!!");
                } else {
                    saldo -= valor;
                    System.out.println("Seu novo saldo é: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Seu novo saldo é: " + saldo);
            } else if (opcao == 4){
                System.out.println("Encerrando menu...Obrigado!");
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }

        }

    }
}