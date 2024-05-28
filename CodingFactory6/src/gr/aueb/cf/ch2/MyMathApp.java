package gr.aueb.cf.ch2;

public class MyMathApp {

    public static void main(String[] args) {
        int num1 = -10;
        int num2 = 3;
        int num3 = 18;

        System.out.println("Το απόλυτο του αριθμού 10 είναι:  " + Math.abs(num1));
        System.out.println("Το μικρότερο μεταξύ 3 και 18:   " + Math.min(num2, num3));
        System.out.println("Το μεγαλύτερο μεταξύ 3 και 18:   " + Math.max(num2, num3));
    }
}
