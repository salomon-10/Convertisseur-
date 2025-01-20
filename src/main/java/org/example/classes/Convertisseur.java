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
                Metre.main();break;
            case 2:
                Gramme.main();break;
            case 3:
                Litre.main();break;
            default:
                System.out.println(" Entrer votre choix entre 1;2;3 ");
        }
    }
}


