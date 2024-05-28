package gr.aueb.cf.ch3;

/*
* Λαμβάνει true/false από το standard in για δύο
* δεξαμενές. Αν και οι δύο είχαν καύσιμα <1/4> τότε
* ανάβει κόκκινη ένδειξη. Αν η μια από τις δύο έχει < 1/4 τότε
* ανάβει πορτοκαλί ένδειξη.
*/

import java.util.Scanner;

public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLTQuarterTank1 = false;
        boolean isLTQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if tank1 is LT quarter");
        isLTQuarterTank1 = in.nextBoolean();

        System.out.println("Please insert if tank2 is LT quarter");
        isLTQuarterTank2 = in.nextBoolean();

        isRed = isLTQuarterTank1 && isLTQuarterTank2;

        isOrange = isLTQuarterTank1 ^ isLTQuarterTank2;
        //isOrange = (isLTQuarterTank1 && isLTQuarterTank2) || (!isLTQuarterTank1 && isLTQuarterTank2);


    }
}
