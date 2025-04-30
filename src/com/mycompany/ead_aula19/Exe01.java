package com.mycompany.ead_aula19;

public class Exe01 {
    public static void main(String[] args) {                                         //preteste
//Fazer operação de transferencia
        //enquanto tiver saldo.
        double saldo = 100.0;
        while(saldo > 0){
            saldo -= 20;
            System.out.println("Saldo="+saldo);
        }
        System.out.println("Pré-Teste Falso");
        //faz a operação até que o saldo fique
        //negativo
        saldo = 100;
        while(!(saldo < 0)){//saldo >= 0
            saldo -= 20;
            System.out.println("Saldo="+saldo);
        }
        System.out.println("Pós-Teste Falso");
        //repita a transferência até que o saldo
        //fique negativo
        saldo = 100;
        do{
            saldo -= 20;
            System.out.println("Saldo="+saldo);
        }while(!(saldo < 0));//saldo >= 0
        System.out.println("Pós-Teste Verdadeiro");
        //execute as transferência enquanto saldo
        //for maior que zero
        saldo = 100;
        do{
            saldo -= 20;
            System.out.println("Saldo="+saldo);
        }while(saldo > 0);
    }
}
