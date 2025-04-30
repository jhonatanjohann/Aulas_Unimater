package com.mycompany.ead_aula09;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        double salario;
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o salario: ");
        salario = scanner.nextDouble();
//Estrutura condicional sequencial
        if (salario <= 6000) {
            System.out.println("IRRF = ISENTO");
        } else if (salario <= 25000) {
            System.out.println("IRRF = 6%" + (salario * 0.06));
        } else {
            System.out.println("IRRF = 10%" + (salario * 0.10));
        }
//Estrutura condicional encadeada

        if (salario < 0) {
            System.out.println("Salario invalido");
        } else {
            if (salario <= 6000) {
                System.out.println("IRRF = ISENTO");
            } else if (salario <= 25000) {
                System.out.println("IRRF = 6%" + (salario * 0.06));
            } else {
                System.out.println("IRRF = 10%" + (salario * 0.10));
            }
        }
    }
}
