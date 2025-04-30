package com.mycompany.ead_aula05_exes;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a base maior do trapézio: ");
        int baseMa = scanner.nextInt();

        System.out.println("informe a base menor do trapézio: ");
        int baseMn = scanner.nextInt();

        System.out.println("informe a altura do trapézio: ");
        int altr = scanner.nextInt();

        System.out.println("informe um dos lados oblíquos do trapézio: ");
        int lado1 = scanner.nextInt();

        System.out.println("informe outor lado oblíquo do trapézio: ");
        int lado2 = scanner.nextInt();


        double area = ((baseMa + baseMn) * altr) / 2.0;
        int perimetro = baseMa + baseMn + lado1 + lado2;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

    }
}
