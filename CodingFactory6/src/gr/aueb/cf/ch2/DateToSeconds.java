package gr.aueb.cf.ch2;

import java.util.Scanner;

/*Λαμβάνει από τον χρήστη έναν ακέραιο ο οποίος συμβολίζει δευτερόλεπτα
* και μετατρέπει σε ημέρες, ώρες, λεπτά, δευτερόλεπτα.
*/
public class DateToSeconds {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SEC_PER_MINUTE = 60;
        final int SEC_PER_HOUR = 60 * 60;
        final int SECS_PER_DAY = 24 * 60 * 60;
        int days = 0;
        int hours = 0;
        int minutes =0;
        int seconds = 0;
        int TotalSeconds = 0;

        System.out.println("Please insert Days, Hours, Minutes and seconds");
        days = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds =in.nextInt();

        TotalSeconds = ((days * SECS_PER_DAY) + (hours * SEC_PER_HOUR) + (minutes * SEC_PER_MINUTE)+ seconds);

        System.out.printf("Total Seconds: %,d", TotalSeconds);




    }
}
