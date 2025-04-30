package com.mycompany.ead_aula09;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        String cidade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de sua cidade");
        cidade = scanner.nextLine().toUpperCase();

        if(cidade.equals("PATO BRANCO")){
            System.out.println("Ola Pato Branquesnse, seja bem vindo(a)!");
        } else {
            System.out.println("ola, seja bem vindo(a)!");
        }

    }
}
