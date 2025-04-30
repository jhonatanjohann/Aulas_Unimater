package com.mycompany.ead_aula14;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String valor = scanner.nextLine();

        char[] av = valor.toCharArray();
        boolean soNumeros = true;

        if (av.length <= 0) {
            soNumeros = false;


        } else {

            for (int i = 0; i < av.length; i++) {
                if (Character.isDigit(av[i])) {
                    soNumeros = true;
                } else {
                    soNumeros = false;
                    break;
                }
            }
        }
        System.out.println("Só números: " + soNumeros);
        for (int i = 0; i < av.length; i++) {

            System.out.println(av[i]);
        }
    }
}
