package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        String titular;
        String tipoconta;
        int opcao, numero, numero2, saques = 0;
        double valor;
        ArrayList<Conta> contas = new ArrayList<>();
        Conta conta1,conta2;

    Scanner scanner = new Scanner(System.in);
        System.out.println("Banco");
    int option;
        do{
        System.out.println("Digite a Opção desejada: ");
        System.out.println(" 1 - Criar conta ");
        System.out.println(" 2 - Dados Bancarios ");
        System.out.println(" 3 - Depositar Valores ");
        System.out.println(" 4 - Sacar Valores ");
        System.out.println(" 5 - Tranferir Valor ");
        System.out.println(" 6 - Saldo Total ");
        System.out.println(" 0 - Sair ");

        System.out.println(" Selecione a opção desejada: ");
        option = scanner.nextInt();
            in.nextLine();


            process(option);
    } while(option !=0);
}
        public static void process(int option) {


        switch (option) {
            case 1:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite o Nome: ");
                String titular= scanner.next();
                System.out.println("Digite o Numero da Conta: ");
                int tipoconta = scanner.nextInt();
                conta1 = new Conta(titular,opcao,tipoconta,saques);


            }
            case 2:{
            }
            case 3:{
            }
            case 4:{

            }
            case 5:{

            }
            case 6:{

            }

        }
    }
}