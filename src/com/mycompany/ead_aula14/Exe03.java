package com.mycompany.ead_aula14;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //7 caixas
        String[] frases = new String[7];


        for (int i = 0; i < frases.length; i++) {
            System.out.println("Digite a frase: ");
            frases[i] = scanner.nextLine();

        }
        for (int i = 0; i < frases.length; i++) {
            System.out.println("Frase " + (i + 1) + " " + frases[i]);
        }

        for (int i = 0; i < frases.length; i++) {
            boolean soNumeros = true;

            if (frases.length <= 0) {
                soNumeros = false;


            } else {

                for (int n = 0; n < frases.length; i++) {
                    if (Character.isDigit(Integer.parseInt(frases[n]))) {
                        soNumeros = true;
                    } else {
                        soNumeros = false;
                        break;
                    }
                }
            }
        }
    }
}

