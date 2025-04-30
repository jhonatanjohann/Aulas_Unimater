package com.mycompany.ead_aula05_exes;

import java.util.Random;

public class Exe06 {
    public static void main(String[] args) {
        Random random = new Random();
        double sal1 = random.nextInt(2500, 2800);
        double sal2 = random.nextInt(2500, 2800);
        double sal3 = random.nextInt(2500, 2800);
        double sal4 = random.nextInt(2500, 2800);
        double sal5 = random.nextInt(2500, 2800);

        double desconto ;
        double soma;

        System.out.println("--valor bruto de cada salario--\n" +
                "\n* primeiro salario " + sal1 +
                "\n* Segundo salario " + sal2 +
                "\n* Terceiro salario " + sal3 +
                "\n* Quarto salario " + sal4 +
                "\n* Quinto salario " + sal5 +
                "\n -----------------------");

        desconto = (sal1 / 100) * 7.5;
        System.out.println("Desconto do salario número 1: " + desconto);
        soma = desconto;

        desconto = (sal2 / 100) * 7.5;
        System.out.println("Desconto do salario número 2: " + desconto);
        soma = soma + desconto;

        desconto = (sal3 / 100) * 7.5;
        System.out.println("Desconto do salario número 3: " + desconto);
        soma = soma + desconto;

        desconto = (sal4 / 100) * 7.5;
        System.out.println("Desconto do salario número 4: " + desconto);
        soma = soma + desconto;

        desconto = (sal5 / 100) * 7.5;
        System.out.println("Desconto do salario número 5: " + desconto);
        soma = soma + desconto;

        System.out.println("-----------------------" +
                "\nArrecadação do governo em imposto; " + soma);
    }
}