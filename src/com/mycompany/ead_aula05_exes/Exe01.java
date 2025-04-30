package com.mycompany.ead_aula05_exes;

public class Exe01 {
    public static void main(String[] args) {

        double result;

        //A
        result = (15.0 / 2) - ((15 * Math.sqrt(3))/ 2);
        System.out.println("Valor A: " + result);

        //B
        result = ((1.0/2) * (1.0/2)) * (1.0/3) + (1.0/4) / (1.0/3);
        System.out.println("Valor B: " + result);

        //C
        result = Math.sqrt((5*5) + (Math.cbrt(9) * Math.cbrt(9)));
        System.out.println("Valor C: " + result);

        //D
        result = ((2 * Math.sqrt(5) + Math.sqrt(40) + (2 * Math.sqrt(8) + 8)) / -3);
        System.out.println("Valor D: " + result);
    }
}
//Math.cbrt(5); -> raiz cubica
//math.pow(); -> potencia