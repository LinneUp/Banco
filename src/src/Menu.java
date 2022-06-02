package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu extends Conta {
    static Dados dados = new Dados();



    public Menu(String titular, int opcao, String tipoconta, int saques) {
        super(titular, opcao, tipoconta, saques);
    }



    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        String titular;
        String tipoconta;
        int opcao, saques = 0;
        double valor;

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



            process(option);
    } while(option !=0);
}
        public static void process(int option) {



        switch (option) {
            case 1:{

                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite o Nome: ");
                String titular= scanner.next();
                dados.setTitular(titular);


                System.out.println("Digite o Numero da Conta: ");
                String tipoconta = scanner.next();
                dados.setTipoconta(tipoconta);
                int saques = 0;

                break;
            }
            case 2:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite o numero da Conta: ");
                int numero = scanner.nextInt();
                dados.setNumero(numero);

            }
            case 3:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite o Numero da conta: ");
                int numero = scanner.nextInt();
                dados.setNumero(numero);



                System.out.println("Digite o valor para deposito");
                double valor = scanner.nextDouble();
                dados.setpValor(valor);


            }
            case 4:{
                Scanner scanner = new Scanner(System.in);

                System.out.print(" Digite o número da conta: ");
                int numero = scanner.nextInt();
                dados.setNumero(numero);

                System.out.println(" Digite o valor para Saque :");
                double valor = scanner.nextDouble();
                dados.setpValor(valor);


            }
            case 5:{
                Scanner scanner = new Scanner(System.in);

                System.out.print(" Digite o número da conta de origem: ");
                int numero = scanner.nextInt();
                System.out.print(" Digite o número da conta de destino: ");
                int numero2 = scanner.nextInt();
                System.out.println(" DIGITE O VALOR DA TRANSFERÊNCIA: ");
                double valor = scanner.nextDouble();
                dados.setpValor(valor);


            }
            case 6:{
                System.out.println(" - Saldo Total de Contas :" + dados.getpValor() + Conta.getQtdcontas() );
            }

        }
    }

    @Override
    public boolean sacar(double quantia) {
        return false;
    }

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public double getValorImpostoSaque() {
        return 0;
    }
}