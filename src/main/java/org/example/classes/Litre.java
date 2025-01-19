package org.example.classes;

import java.util.Scanner;

public class Litre {
    private static float x;
    private static int op, Gramme, metre;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("entrer la valeur a convertir");
        x = sc.nextFloat();
        System.out.println("saisissez le sens de convertion");
        System.out.println(" 1:hectolitre en Litre, 2:Litre en Millilitre,  3:Millilitre en Litre, 4:Litre en hectolitre ");
        op = sc.nextInt();
        switch (op) {

            case 1:
                System.out.println(x+ " hectolitre est egale a:" + (x * 100) + "Litre");
                break;
            case 2:
                System.out.println(x+ " Litre est egale a:" + (x * 1000) + "Millilitre");
                break;
            case 3:
                System.out.println(x+ " Millilitre est egale a:" + (x * 0.001) + "Litre");
                break;
            case 4:
                System.out.println(x+ " Litre est egale a:" + (x * 0.01) + "hectolitre");
                break;
            case 5:
                System.out.println(x+ " hectolitre est egale a:" + (x * 100000) + "millilitre");
                break;
            case 6: System.out.println(x+ "Milliltre est egale a:" + (x * 0.00001) + "hectolitre");
                break;
            default:
                System.out.println("⭕⭕ERROR 404 ⭕⭕");
        }
    }
}
