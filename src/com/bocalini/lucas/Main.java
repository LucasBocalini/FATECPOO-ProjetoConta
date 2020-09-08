package com.bocalini.lucas;

import java.util.Scanner;

public class Main {
    public Conta cc = new Conta();


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Main teste = new Main();
        int opcao = 0;

        while (opcao != 9){
            System.out.println("Menu principal: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Consultar");
            System.out.println("9 - Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(leitor.nextLine());
            switch (opcao){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execDepositar();
                    break;
                case 3:
                    teste.execSacar();
                    break;
                case 4:
                    teste.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opcao inválida");
                    break;

            }
        }
    }

    public void execCadastrar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        cc.setConta(leitor.nextLine());

        System.out.println("Digite a agencia: ");
        cc.setAgencia(leitor.nextLine());

        System.out.println("Digite o nome do cliente");
        cc.setNomeCliente(leitor.nextLine());

        System.out.println("Cliente cadastrado com Sucesso!");
    }
    public void execConsultar(){
        cc.imprimir();

    }
    public void execSacar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(leitor.nextLine());
        if (cc.sacar(valor)==1){
            System.out.println("Saque efetuado com sucesso");

        }else{
            System.out.println("Sem salso suficiente para o saque");
        }

    }
    public void execDepositar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(leitor.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito efetuado com sucesso");
    }



}
