package com.mycompany.ead_aula15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero = -1;
        int soma = 0;

        while (numero != 0) {
            System.out.println("Digite um valor: ");
            numero = scanner.nextInt();

            valores.add(numero);

            for (int v : valores) {
                soma += v;
            }

            if (numero != 0) {
                System.out.println(soma);
                System.out.println(soma / valores.size());
            }
        }
    }
}
