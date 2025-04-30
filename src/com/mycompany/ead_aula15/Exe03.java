package com.mycompany.ead_aula15;

import java.util.*;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.println("Quantas pessoas deseja dicionar?");
        int quntidade = scanner.nextInt();

        for (int i = 0; i < quntidade; i++) {
            System.out.println("Digite o nome ");
            String nomes = sc.nextLine();

            lista.add(nomes);
        }

        System.out.println("Qual nome deseja encontrar?");
        String procura = sc.nextLine();

        boolean encontrei = false;


        for(String l : lista) {
            if (procura.equalsIgnoreCase(l)) {
                System.out.println("Nome encontrado: " + l);
                encontrei = true;
            }
        }

        if (!encontrei) {
            System.out.println("Não encontrado");
        }

        Collections.sort(lista);

        System.out.println(lista);
    }
}