package com.mycompany.ead_aula20;

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero para calcular o fatorial");
        int numero = scanner.nextInt();

        //Incondicional FOR

        int resultado = 1;
        for (int i = numero; i > 1; i--) {
            resultado = resultado * i;
        }

        System.out.println(numero + "! -> " + resultado);

        //pré teste verdadeiro
        //enquanto > 0 execute
        int contador = numero;

        resultado = 1;
        while(contador > 0){
            resultado = resultado * contador;
            contador--;
        }
        System.out.println(numero + "! -> " + resultado);

        //PRé texto falso
        //contador == 0 continue

        contador = numero;
        resultado = 1;

        while (contador != 0) {
            resultado = resultado * contador;
            contador--;
        }
        System.out.println(numero + "! -> " + resultado);

        //pos teste falso
        //Repita aé que contador seja 0

        contador = numero;
        resultado = 1;
        do {
            resultado = resultado * contador;
            contador--;
        } while (contador != 0);
        System.out.println(numero + "! -> " + resultado);

        //pos teste verdadeiro
        //execute enquanto contador for maior que 1

        contador = numero;
        numero = 1;
        do {
            resultado = resultado * contador;
            contador--;
        }while (contador > 1);
        System.out.println(numero + "! -> " + resultado);

        //condicional seletivo
        /// construa um laco para calcular o fatorial

        contador = numero;
        resultado = 1;
        while (true){
            resultado = resultado * contador;
            if (contador <= 1) {
                break;
            }
            contador--;
        }
        System.out.println(numero + "! -> " + resultado);
    }
}
