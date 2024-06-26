package gr.aueb.cf.ch3;

/*
* Διαβάζει απο το standard in ένα ακέραιο π
* που συμβολίζει μια θερμοκρασία και ελέγχει
* αν η θερμοκρασία αν είναι μικρότερη απο 0
* Εκτυπώνει το αποτέλεσμα.
*/

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero = false;

        System.out.println("Please insert the temperature (integer)");
        temp = in.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("Temp is below zer: " + isTempBelowZero);
    }
}
