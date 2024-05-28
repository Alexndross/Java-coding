package gr.aueb.cf.ch3;

import java.util.Scanner;

/*Να διαβάζει το έτος και να αποφαίνεται αν ειναι δισεκτο ή όχι*/
public class Askhsh1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        System.out.println("Πληκτρολογήστε το έτος που θέλετε να δείτε αν είναι δίσεκτο");
        year = scanner.nextInt();

        if ((year % 4) == 0 && (year % 100) != 0) {
            System.out.println("¨Το έτος "+ year + " έιναι δίσεκτο");
        } else if (year % 400 == 0) {
            System.out.println("Το έτος  "+  year + " έιναι δίσεκτο");
        } else {
            System.out.println("Το έτος δεν είναι δίσεκτο");
        }
    }
}
