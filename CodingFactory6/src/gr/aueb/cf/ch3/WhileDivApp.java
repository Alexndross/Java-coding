package gr.aueb.cf.ch3;

/*Ο χρήστης εισάγει δύο ακεραίους. Ο αριθμητής να είναι μηδέν.
* Το πρόγραμμα ελέγχει τον παρανομαστή αν είναι 0, και αν είναι 0
* δίνει τη δυνατότητα στο χρήστη να συνεχίσει δίνοντας παρανομαστή
* διάφορο του μηδενός*/

import java.util.Scanner;

public class WhileDivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert two intergers for division");
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero");
                break;
            }

            if (denominator == 0) {
                System.out.println("Denominator should not be zero");
                continue;
            }

            result = numerator / denominator;
            System.out.printf("%d / %d = %d", numerator, denominator, result);
        }

        System.out.println("Thanks for using our app!");

    }
}
