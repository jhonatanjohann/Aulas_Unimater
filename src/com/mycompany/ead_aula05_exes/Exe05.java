package com.mycompany.ead_aula05_exes;

import java.util.Random;
import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o valor minimo");
        int valMin = scanner.nextInt();

        System.out.println("informe o valor maximo");
        int valMax = scanner.nextInt();

        Random random = new Random();
        int number = random.nextInt(valMin, valMax);

        System.out.println("Seu número sorteado é: " + number);
    }
}