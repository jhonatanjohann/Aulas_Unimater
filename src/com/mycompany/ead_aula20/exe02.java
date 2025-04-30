package com.mycompany.ead_aula20;

import java.util.Random;
import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        int pontuacaoGeral = 0;
        int quantidadeJogos = 0;
        while (true) {
            int quantidadeTentativas = 10;
            int pontos = 100;

            Random rnd = new Random();
            int numeroAleatrorio = rnd.nextInt(0, 10);
            Scanner scanner = new Scanner(System.in);


            while (quantidadeTentativas > 0) {
                System.out.println("Adivinhe o número!");
                int num = scanner.nextInt();

                if (num == numeroAleatrorio) {
                    System.out.println("ACERTOUUU...");
                    pontuacaoGeral += 10;
                    quantidadeJogos++;
                    break;
                } else {
                    pontos -= 10;
                    quantidadeJogos++;

                    int diferenca = num - numeroAleatrorio;
                    if (diferenca <0 ) diferenca = diferenca * (-1);
                    if (diferenca <=3) {
                        System.out.println("errou mas está quente");
                    } else {
                        System.out.println("errou, está frio");
                    }
                }

                quantidadeTentativas--;
            }
            System.out.println("Pontuação: " + pontos);
            System.out.println("Jogos - " + quantidadeJogos);
        System.out.println("Pontos: " + pontuacaoGeral);
            System.out.println("Deseja continuar? (1/0)");
            int continuar = scanner.nextInt();
            if(continuar != 1) break;
        }
    }
}