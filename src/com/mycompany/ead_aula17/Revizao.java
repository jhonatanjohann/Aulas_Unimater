package com.mycompany.ead_aula17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Revizao {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            i--;

            System.out.println("""
                    1 - Cadatrar produto
                    2 - Lista de produtos
                    3 - Pesquisar produto
                    4 - Sair
                    """);

            int menu = scInt.nextInt();

            if (menu == 1) {
                System.out.println("Informe o nome");
                String nome = scStr.nextLine();
                nome = nome.replaceAll(";", "");

                if (nome.isEmpty()) {
                    System.out.println("Nome obrigatorio");
                } else {

                    System.out.println("Informe o preço");
                    double preco = scDouble.nextDouble();

                    System.out.println("Informe a categoria");
                    String cat = scStr.nextLine();

                    String cad = nome + ";" + preco + ";" + cat;
                    nomes.add(cad);
                }
            } else if (menu == 2) {
                for (String reg : nomes) {
                    String[] dec = reg.split(";");

                    System.out.println("**************");
                    System.out.println("Nome: " + dec[0]);
                    System.out.println("Preço: " + dec[1]);
                    System.out.println("Categoria: " + dec[2]);
                    System.out.println("**************");
                }


            } else if (menu == 3) {

            } else if (menu == 4){
              break;
            } else {
                System.out.println("Menu invalido.");
            }
        }
    }
}
