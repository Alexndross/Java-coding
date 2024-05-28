package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Πληκτρολογήστε τρείς αριθμούς για την ημέρα, τον μήνα και το έτος");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        year %= 100;

        System.out.printf("Η ημερομηνία είναι: %02d / %02d / %02d",day , month , year);
    }
}
