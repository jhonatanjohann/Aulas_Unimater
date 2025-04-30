package com.mycompany.ead_aula10;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        String nome;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome: ");//println -> imprenção e quebra de linha
        nome = scanner.nextLine();

        if (nome.isEmpty()) { //ver se a String é nula
            System.exit(0); //sair do codigo
        }

        System.out.print("""
                Ola %s
                seja bem vindo(a) a central de atendimento BB
                Tecle 1 para consultar o saldo
                Tecle 2 para imprenssão de extrato
                Tecle 3 para sair
                """.formatted(nome));

        String menu = scanner.nextLine();

        if (menu.equals("3")) {
            System.exit(0);
        } else if (!menu.equals("1") && !menu.equals("2")) {
            System.out.println("Opção invalida");
            System.exit(0);
        } else if (menu.equals("1")) {
            System.out.println("Seu saldo é R$ 50.000.000.000");
        } else {
            System.out.println("EXTRATO... \n + R$ 50.000.000.000");
        }

    } //        \4
}
