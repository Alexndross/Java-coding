package gr.aueb.cf.ch3;

/*
* Τα φώτα ενός αυτοκινήτου ανάβουν όταν βρέχει
* και ταυτόχρονα είτε είναι σκοτάδι
* ή τρέχει με ταχύτητα υψηλή. Ο χρήστης εισάγει
* τα τρία παραπάνω στοιχεία και το πρόγραμμα εκτυπώνει
* αν τα φώτα ανάβουν ή όχι.
*/

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean arelightOn = false;

        System.out.println("Insert if is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if its dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert the speed of the car");
        speed = in.nextInt();

        isRunning = speed >= MAX_SPEED;
        arelightOn = isRaining && (isRunning || isDark);




    }
}
