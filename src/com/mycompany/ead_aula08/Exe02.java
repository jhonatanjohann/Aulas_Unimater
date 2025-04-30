package com.mycompany.ead_aula08;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        double a, b, x, r;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe A");
        a = scanner.nextDouble();

        System.out.println("Infome B");
        b = scanner.nextDouble();

        x = a + b;

        if(x >= 10) {
            r = x + 5;
            System.out.println("Resultado: " + r);
        } else {
            r = x - 7;
            System.out.println("Resultado: " + r);
        }
    }
}
