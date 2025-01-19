package org.example.classes;

import java.util.Scanner;

public class Gramme {
    private static float x;
    private static int op, Gramme, metre;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("entrer la valeur a convertir");
        x = sc.nextFloat();
        System.out.println("saisissez le sens de convertion");
        System.out.println(" 1:Kilogramme en Gramme, 2:Gramme en MilliGramme,  3:MilliGramme en Gramme, 4:Gramme en KiloGramme ,5:KiloGramme en milliGramme ,6: milligramme en kilogramme   ");
        op = sc.nextInt();
        switch (op) {

            case 1:
                System.out.println(x+ " KiloGramme est egale a:" + (x * 1000) + "Gramme");
                break;
            case 2:
                System.out.println(x+ " Gramme est egale a:" + (x * 1000) + "MilliGramme");
                break;
            case 3:
                System.out.println(x+ " MilliGramme est egale a:" + (x * 0.001) + "Gramme");
                break;
            case 4:
                System.out.println(x+ " Gramme est egale a:" + (x * 0.001) + "KiloGramme");
                break;
                case 5:
                    System.out.println(x+ " kilogramme est egale a:" + (x * 1000000) + "milligramme");
                    break;
                    case 6: System.out.println(x+ "Milligramme est egale a:" + (x * 0.000001) + "KiloGramme");
                    break;
            default:
                System.out.println("⭕⭕ERROR 404 ⭕⭕");
        }
    }
}