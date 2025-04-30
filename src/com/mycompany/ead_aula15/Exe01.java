package com.mycompany.ead_aula15;

import java.util.ArrayList;
import java.util.List;

public class Exe01 {
    public static void main(String[] args) {
        int[] valores = {1, 2};

        for (int i = 0; i < 2; i++) {
            System.out.println(valores + " Exemplo1");
        }

        List<String> valores2 = new ArrayList<>();

        valores2.add("sim");
        valores2.add("vituperiosa");

        //vai percorer todos os valores e v vai levar o valor de cada valor da lista
        for (String v : valores2) {
        }

    }
}
