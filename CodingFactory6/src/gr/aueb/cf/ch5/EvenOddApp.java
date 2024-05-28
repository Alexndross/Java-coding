package gr.aueb.cf.ch5;

import java.util.Scanner;

/*Ελέγχει αν ένας ακέραιος είναι άρτιος
* ή περιττός με τη χρήση μεθόδων.
*/
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iputNum = 0;

        System.out.println("Please insert a num");
        iputNum = in.nextInt();

        System.out.printf("%d is even: %b", iputNum, isEven(iputNum));
        System.out.printf("%d is odd: %b", iputNum, !isEven(iputNum));

    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
