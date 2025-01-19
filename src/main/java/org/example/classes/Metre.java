package org.example.classes;

import java.util.Scanner;

public class Metre {
    private static float x;
    private static int op;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("entrer la valeur a convertir");
        x = sc.nextFloat();
        System.out.println("saisissez le sens de convertion");
        System.out.println(" 1:Kilometre en Metre, 2:Metre en Millimetre,  3:Millimetre en Metre, 4:Metre en Kilometre ");
        op = sc.nextInt();
        switch (op) {

            case 1:
                System.out.println(x + " Kilometre est egale a:" + (x * 1000) + "Metre");
                break;
            case 2:
                System.out.println(x + " Metre est egale a:" +(x * 1000)+ "Millimetre");
                break;
            case 3:
                System.out.println(x + " Millimetre est egale a:" + (x * 0.001) + "Metre");
                break;
            case 4:
                System.out.println(x + " Metre est egale a:" + (x * 0.001) + "Kilometre");
                break;
            case 5:
                System.out.println(x+ " kilometre est egale a:" + (x * 1000000) + "millimetre");
                break;
            case 6: System.out.println(x+ "Millimetre est egale a:" + (x * 0.000001) + "Kilometre");
                break;
            default:
                System.out.println("⭕⭕ERROR 404 ⭕⭕");
        }
    }
}
