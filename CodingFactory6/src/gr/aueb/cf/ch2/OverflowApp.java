package gr.aueb.cf.ch2;

/*Ελέγχει την υπερχείληση στην περίπτωση
* που συμβέι.
* */

public class OverflowApp {

    public static void main(String[] args) {

        int num1 = 2_147_483_647;  //Οι κάτω παύλες είνα για καλύτερη ανάγνωση σε μεγάλους αριθμούς αντι για την τελεία συμβολίζουν τις χιλιάδες
        int num2 = 2;
        int result = 0;

        result = num1 + num2;

        System.out.println("Το αποτέλεσμα είναι:" + result);
    }
}
