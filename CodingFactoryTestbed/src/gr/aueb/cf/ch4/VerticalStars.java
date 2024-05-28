package gr.aueb.cf.ch4;

import java.util.Scanner;

public class VerticalStars {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Insert the number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}


