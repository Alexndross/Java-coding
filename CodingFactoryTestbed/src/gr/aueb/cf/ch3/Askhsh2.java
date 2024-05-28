package gr.aueb.cf.Askhseis;

import java.util.Scanner;

public class Askhsh2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        System.out.println("Επιλέξτε μια απο τις παρακάτω επιλογες:\n");
        System.out.println("1. Εισαγωγή\n");
        System.out.println("2. Διαγραγη\n");
        System.out.println("3. Αναζύτηση\n");
        System.out.println("4. Ενημέρωση\n");
        System.out.println("5. Έξοδος\n");
        System.out.println("Δώστε αριθμό επιλογής:\n");

        while (!result) {
            num = scanner.nextInt();

            if ((num < 5) && (num > 0)) {
                if (num == 1) {
                    System.out.println("Επιλέξατε Εισαγωγή\n");
                } else if (num == 2) {
                    System.out.println("Επιλέξατε Διαγραγη\n");
                } else if (num == 3) {
                    System.out.println("Επιλέξατε Αναζύτηση\n");
                } else {
                    System.out.println("Επιλέξατε Ενημέρωση\n");
                }
            } else if (num == 5) {
                System.out.println("Επιλέξατε Έξοδος\n");
                result = true;
            }else
                System.out.println("Επιλέξατε αριθμό που δεν βρίσκεται στις διαθέσιμες επιλογές. Προσπαθήστε ξανά");

        }
    }
}
