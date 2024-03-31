
package com.mycompany.testartributavel;

import java.util.Scanner;


public class TestarTributavel {   
    public static void main(String[] args) {
        Conta conta1 = new Conta(0,0,0);/*Criando a conta 1 iniciando com variaveis zeradas para liberar opcoes na aplicacao*/
        ContaPoupanca conta1P = new ContaPoupanca(5500,0,0,0);/*Criando objeto da classe CONTA POUPANCA*/
        ContaCorrente conta1C = new ContaCorrente(0,0,0);
        conta1P.saldo += conta1.saldo;/*Atribuindo valor de saldo pra conta1 poupanca*/
        conta1C.saldo += conta1.saldo;
        System.out.println("Bom dia seu salario esta na conta!");
        conta1.obterSaldo();
        System.out.println("Saldo atual: " + conta1.saldo);
        System.out.println("********************************************************************");
        Scanner scanner = new Scanner(System.in);/*Scannear d*/
        while (true){ /*Criar um menu com loop while para ser obrigado a colocar uma informacao*/
            System.out.println("MENU DO BANCO");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Poupanca");
            System.out.println("[4] Verificar tributos Conta Corrente");
            System.out.println("[5] Aderir seguro de vida");
            System.out.print("[6] SAIR :");
            int escolha = scanner.nextInt();
            switch (escolha){
                case 1 :
                System.out.println("\n\nBoa tarde qual valor voce deseja depositar ? :");  
                double depositar = scanner.nextFloat();
                conta1.setDepositar(depositar);/*colocando o valor da variavel Scanner no setDeposito*/
                conta1.saldo += conta1.getDepositar();/*atribuindo o valor do deposito ao saque*/
                System.out.println("\nSaldo atual: " + conta1.saldo);
                System.out.println("\n\n");
                break;/*parada*/
                
                case 2 :
                  System.out.println("\n\nBoa tarde qual valor voce deseja sacar ?  :");
                  double sacar = scanner.nextFloat();
                  conta1.setSacar(sacar);
                  if(sacar <= conta1.saldo){
                      conta1.saldo -= conta1.getSacar();
                      System.out.println("\n\nVoce realizou o saque!");
                      System.out.println("\n\nSaldo atual: " + conta1.saldo);   
                  }
                  else{
                      System.out.println("\nSALDO INSUFICIENTE\n\n");
                      
                  }
                  break;
                case 3 :
                    System.out.println("Escolha uma opcao");
                    System.out.println("[1] - Tranferir valor da conta poupanca pra conta corrente");
                    System.out.print("[2] - Voltar :");
                    int opcao = scanner.nextInt();
                    switch(opcao){
                        case 1 :
                        System.out.println("\nOla seu saldo e :" +conta1P.getSaldoP());
                        System.out.println("Qual valor voce deseja transferir");   
                        double transfer = scanner.nextFloat();
                        if(transfer <= conta1P.saldoP){
                         conta1P.saldoP = conta1P.saldoP - transfer;
                         System.out.println("Transferencia realizada com sucesso");
                         System.out.println("Novo saldo disponivel na conta POUPANCA :"+conta1P.saldoP);
                         conta1P.saldo = transfer;
                         conta1.saldo += conta1P.saldo;
                         System.out.println("Novo saldo disponivel na CONTA CORRENTE :"+conta1.saldo);
                    }else{
                            System.out.println("Saldo insuficiente da conta poupanca!");
                        }
                        
                         
                case 4: 
                   conta1C.calculaTributos(0.01);
                   
                          
            }
        }
        
        
     }
   }
}    
