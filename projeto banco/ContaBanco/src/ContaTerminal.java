/* Sempre atento na importação da classe para poder utilizar e aplicar a função Scanner. */ 
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner cliente = new Scanner(System.in);

// Cabeçalho para receber o cliente.
        System.out.println("==--==--==--==--==--==--==--==--==--==");
        System.out.println("Sejam Bem vindo(a) ao BANCO DA GENTE!");
        System.out.println("==--==--==--==--==--==--==--==--==--==");
        System.out.println("Para iniciarmos o nosso atendimento pedimos que preencha alguns dados.");

// Captura de dados via terminal, utilizando preenchimento feito pelo usuário e guardando em variáveis.
        System.out.println("Por gentileza, digite seu nome completo: "); 
        String nome = cliente.nextLine();

        System.out.println("Informe o número da sua agência com o dígito: ");
        String agencia = cliente.next();

        System.out.println("Agora digite o número da conta: ");
        int conta = cliente.nextInt();

        System.out.println("Por gentileza, digite seu saldo: ");
        double saldo = cliente.nextDouble();

/** Saída de dados, acrecentando um texto simulando um carregamento, 
    sugestão: utilizar um package de timer, que dê uma pausa antes e depois de mostrar a linha 27.**/ 
        System.out.println("Muito obrigado(a) pelas informações");
        System.out.println("==--==--==--==--==--==--==--==--==--==");
        System.out.println("Carregando dados . . .");
        System.out.println("==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==-");
        System.out.println("Olá " + nome + ", agradecemos por criar uma conta em nosso banco,sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        System.out.println("==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==--==-");
        System.out.println("O BANCO DA GENTE agradece a confiança.");

    }
}
