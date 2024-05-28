package gr.aueb.cf.ch2;

import java.util.Locale;
/*Output Demo
* */

public class OutPutApp {

    public static void main(String[] args) {
        int num = 1;
        long num2 = 202345676;

        /*System.out.println("Hello");
        System.out.print("Hello 2");
        System.out.println();
        System.out.printf("Hello");

        System.out.println("Num is:" + num);
        System.out.printf("Num is %d" , num);
        System.out.printf("Num is: %d, Num2 is: %d", num , num2);*/

        System.out.printf(Locale.US,"Num is: %02d, Num2 is: %,4d\n", num , num2); // %02d είναι για να γίνει ο αριθμός πχ από 1 σε 01
        // Στο Locale.US το κόμμα είναι το διαχωριστικό των χιλιάδων

        System.out.printf(Locale.forLanguageTag("el"),"Num is: %02d, Num2 is: %,4d", num , num2);
        // Αν θέλω να δώσω κάποιο Locale που δεν υπάρχει στη βιβλιοθήκη


    }
}
