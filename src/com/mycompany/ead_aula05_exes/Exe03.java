package com.mycompany.ead_aula05_exes;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {

        System.out.println("Informe o valor do produto");
        Scanner scanner = new Scanner(System.in);
        double produto = scanner.nextDouble();

        double descontos = (produto/100) * 30.65;;
        double vlFinal = ((produto + descontos) / 100) * 330;

        System.out.println("Para obter um lucro de 230% venda por: " + vlFinal);
    }
}