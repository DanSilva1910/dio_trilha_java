

import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {

        double saldo = 237.48;

        Scanner Agencia = new Scanner(System.in);
        System.out.print(" \n Por Favor, digite o numero da Agência: ");
        String agencia = Agencia.next();

        Scanner Conta = new Scanner(System.in);
        System.out.print(" \n Por Favor, digite o numero da Conta: ");
        int conta = Conta.nextInt();

        Scanner Cliente = new Scanner(System.in);
        System.out.print(" \n Por Favor, digite o nome do Cliente: ");
        String nomeCliente = Cliente.next();

        System.out.println(" \n Olá " + nomeCliente + " ,obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + " conta " + conta + " e  seu saldo " + saldo
                + " já está disponivel para saque \n");
    }

}