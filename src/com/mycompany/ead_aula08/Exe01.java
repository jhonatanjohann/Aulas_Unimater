package com.mycompany.ead_aula08;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("valor de A: ");
        int a = scanner.nextInt();

        System.out.println("valor de B: ");
        int b = scanner.nextInt();;

        if(a < b){
            System.out.println("VERDADEIRO");
        }
    }
}
