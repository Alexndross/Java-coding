package gr.aueb.cf.ch3;

import java.util.Scanner;

/*Μια απλή διαίρεση. Διαίρεση με 0
* απαγορεύεται στους ακεραίους της Java.
* Δίνει ArithmeticException.
*/
public class DivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int demoninator = 0;
        int result = 0;

        System.out.println("Please insert numerator, denominator");
        numerator = scanner.nextInt();
        demoninator = scanner.nextInt();

        if (demoninator == 0) {
            System.out.println("Error, Denominator can not be zero");
            System.exit(1);
        }

        if (numerator == 0){
            System.out.println("Error. Numerator is zero");
            System.exit(1);
        }

        result = numerator / demoninator;
        System.out.println("Result: " + result);

    }
}
