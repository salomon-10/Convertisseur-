package org.example.classes;
import java.util.Scanner;
public class Convertisseur {
    static int option;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("choisissez votre unité de convertion");
        System.out.println("1:Longeur , 2:Poids , 3:quantité");
        option = sc.nextInt();
        switch (option) {
            case 1:
                new Metre();
                break;
            case 2:
                new Litre();
                break;
            case 3:
                new Gramme();
                break;
            default:
                System.out.println(" recommencer😒😒😒😒😒");
        }
    }
}


