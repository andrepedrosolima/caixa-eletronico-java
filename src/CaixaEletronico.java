import java.util.Scanner; // Importo a classe Scanner para ler dados do usuário

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crio um Scanner chamado "sc" para ler os dados digitados pelo usuário
        int saldo = 500; // Saldo inicial do usuário

        // Mensagem inicial para o usuário
        System.out.println("Bem-vindo ao Caixa Eletronico");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");

        int opcao = sc.nextInt(); // Lê a opção digitada pelo usuário

        if (opcao == 1) { // Se a opção for 1, o usuário quer depositar
            System.out.print("Digite o valor a depositar: "); // Pede o valor para depósito
            int deposito = sc.nextInt(); // Lê o valor digitado
            saldo += deposito; // Soma o valor depositado ao saldo
            System.out.println("Depósito realizado! Saldo atual: R$ " + saldo); // Mostra o saldo atualizado

        } else if (opcao == 2) { // Se a opção for 2, o usuário quer sacar
            System.out.print("Digite o valor para saque: "); // Pede o valor do saque
            int valor = sc.nextInt(); // Lê o valor digitado

            if (valor > saldo) { // Se o valor do saque for maior que o saldo
                System.out.println("Saldo insuficiente!"); // Mostra mensagem de erro
            } else { // Se houver saldo suficiente
                int[] notas = {100, 50, 20, 10, 5, 2}; // Array com as notas disponíveis no caixa
                int restante = valor; // Variável para controlar o que ainda precisa ser sacado

                for (int nota : notas) { // Para cada nota no array
                    int quantidade = restante / nota; // Calcula quantas notas dessa denominação entregar
                    if (quantidade > 0) { // Se precisar entregar pelo menos uma nota
                        System.out.println(quantidade + " nota(s) de R$ " + nota); // Mostra ao usuário
                        restante = restante % nota; // Atualiza o restante a ser entregue
                    }
                }

                if (restante > 0) { // Se sobrar algum valor que não pode ser entregue
                    System.out.println("Não é possível sacar o valor restante: R$ " + restante);
                } else { // Se todo o valor foi entregue
                    saldo -= valor; // Subtrai do saldo o valor sacado
                    System.out.println("Saque realizado! Saldo atual: R$ " + saldo); // Mostra o saldo atualizado
                }
            }

        } else { // Se a opção digitada não for 1 nem 2
            System.out.println("Opção inválida!"); // Mensagem de erro
        }

        sc.close(); // Fecha o Scanner
    }
}
