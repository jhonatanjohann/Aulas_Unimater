package com.mycompany.ead_aula05_exes;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        int valor = (int) (scanner.nextDouble() * 100);


        int cedulaDe200 = valor / 20000;
        System.out.println("Ced. 200 = " + cedulaDe200);
        valor = valor - (cedulaDe200 * 20000);

        int cedulaDe100 = valor / 10000;
        System.out.println("Ced. 100 = " + cedulaDe100);
        valor = valor - (cedulaDe100 * 10000);

        int cedulaDe50 =  (valor / 5000);
        System.out.println("Ced. 50 = " + cedulaDe50);
        valor = valor - (cedulaDe50 * 5000);

        int cedulaDe20 = valor / 2000;
        System.out.println("Ced. 20 = " + cedulaDe20);
        valor = valor - (cedulaDe20 * 2000);

        int cedulaDe10 = valor / 1000;
        System.out.println("Ced. 10 = " + cedulaDe10);
        valor = valor - (cedulaDe10 * 10);

        int cedulaDe5 = valor / 500;
        System.out.println("Ced. 5 = " + cedulaDe5);
        valor = valor - (cedulaDe5 * 500);

        int cedulaDe2 = valor / 200;
        System.out.println("Ced. 2 = " + cedulaDe2);
        valor = valor - (cedulaDe2 * 200);

        int cedulaDe1 = valor / 100;
        System.out.println("Ced. 1 = " + cedulaDe1);
        valor = valor - (cedulaDe1 * 100);

        //Centavos
        int contavosDe50 = valor / 50;
        System.out.println("cent. 0,50 = " + contavosDe50);
        valor = valor - (contavosDe50 * 50);

        int contavosDe25 = valor / 25;
        System.out.println("cent. 0,25 = " + contavosDe25);
        valor = valor - (contavosDe25 * 25);

        int contavosDe10 = valor / 10;
        System.out.println("cent. 0,10 = " + contavosDe10);
        valor = valor - (contavosDe10 * 10);

        int contavosDe5 = valor / 5;
        System.out.println("cent. 0,05 = " + contavosDe5);
        valor = valor - (contavosDe5 * 5);

        int contavosDe1 = valor / 1;
        System.out.println("cent. 0,01 = " + contavosDe1);
    }
}