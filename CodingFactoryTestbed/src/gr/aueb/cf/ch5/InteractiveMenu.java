package gr.aueb.cf.ch5;

import java.util.Scanner;

public class InteractiveMenu {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int choice = 0;

        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
        System.out.println("5. Εμφάνισε n γραμμές με n αστεράκια n-1");
        System.out.println("6. Έξοδος από το πρόγραμμα\n");





        while (choice != 6) {
            System.out.println("Δώστε επιλογή");
            choice = in.nextInt();
            if ((choice != 6) && (choice >= 1) && (choice <= 6)){
                System.out.println("Δώστε αιρθμό για αστεράκια");
                n = in.nextInt();
            }
            switch (choice) {
                case 1:
                    printOne(n);
                    break;
                case 2:
                    printTwo(n);
                    break;
                case 3:
                    printThree(n);
                    break;
                case 4:
                    printFour(n);
                    break;
                case 5:
                    printFive(n);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Έχετε επιλέξει λάθος τιμή προσπαθήστε ξανά\n");
                    /*choice = 6;*/
                    break;

            }
        }

    }

    public static void printOne(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    System.out.println();
    System.out.println();
    }
    public static void printTwo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    System.out.println();
    }
    public static void printThree(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    System.out.println();
    }
    public static void printFour(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    System.out.println();
    }
    public static void printFive(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    System.out.println();
    }
}




