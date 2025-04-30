package com.mycompany.ead_aula10;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        int prato, sobremesa, bebida, calorias;
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                PRATOS:
                Vegetariano      - 1
                Peixe            - 2
                Frango           - 3
                Carne            - 4
                
                """);
        prato = scanner.nextInt();

        System.out.println("""
                SOBREMESAS:
                Abacaxi          - 1
                Sorvete          - 2
                Mouse            - 3
                Chocolate        - 4
                
                """);
        sobremesa = scanner.nextInt();

        System.out.println("""
                BEBIDA:
                Chá              - 1
                Suco de laranja  - 2
                Suco de melão    - 3
                Refigerante      - 4
                
                """);
        bebida = scanner.nextInt();

        if (prato == 1) calorias = 180;
        else if (prato == 2) calorias = 230;
        else if (prato == 3) calorias = 250;
        else if (prato == 4) calorias = 350;
        else calorias = 0;

        if (sobremesa == 1) calorias += 75;
        else if (sobremesa == 2) calorias += 110;
        else if (sobremesa == 3) calorias += 170;
        else if (sobremesa == 4) calorias += 200;
        else calorias += 0;

        if (bebida == 1) calorias += 75;
        else if (bebida == 2) calorias += 75;
        else if (bebida == 3) calorias += 75;
        else if (bebida == 4) calorias += 75;
        else calorias += 0;

        System.out.println("Calorias: " + calorias);
    }
}

