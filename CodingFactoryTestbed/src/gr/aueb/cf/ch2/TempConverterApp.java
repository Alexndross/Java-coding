package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TempConverterApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int F = 0;
        int tempCelsius= 0;

        System.out.println("Πληκτρολογήστε την θερμοκρασία Φαρενάιτ που θέλετε να μετατρέψετε σε βαθμούς Κελσίου");
        F = in.nextInt();
        tempCelsius  = (5 * (F - 32)) / 9;

        System.out.printf("Οι βαθμοί Κελσίου είναι: %02d", tempCelsius);

    }
}
