import java.util.Scanner; // Importo a classe Scanner que está dentro do pacote java.util.
// A classe Scanner possui um construtor que recebe um InputStream.
// System.in é um objeto da classe InputStream,
// por isso posso passar System.in para o construtor do Scanner.
public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para ler o valor digitado pelo usuário

        System.out.print("Valor para saque: ");
        int valor = sc.nextInt(); // Valor que o usuário quer sacar

            int[] notas = {100, 50, 20, 10, 5, 2}; // Notas disponíveis no caixa
        for (int nota : notas) { //Para cada nota dentro de notas faça...
            int quantidade = valor / nota; //Quantas notas dessa denominação serão entregues
            if (quantidade > 0) { //Se quantidade for maior que 0, faça oq estiver dentro das chaves
                System.out.println(quantidade + " nota(s) de R$ " + nota); // Mostra quantas notas de cada valor entregar
                valor = valor % nota; /* Ou seja o valor alterará de resultado, passando a diminuir conforme as notas forem entregues pelo caixa */
            }
        }

        if (valor > 0) { //Se valor maior q 0 ex: não será possivel sacar o valor restante.
            System.out.println("Não é possível sacar o valor restante: R$ " + valor);
        }

        sc.close();
    }


}
