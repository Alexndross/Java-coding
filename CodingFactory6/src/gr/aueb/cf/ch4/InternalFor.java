package gr.aueb.cf.ch4;

/*Aevan for και break*/
public class InternalFor {

    public static void main(String[] args) {
        int counter = 0;

        for (;;) {
            System.out.print("CF forever ");
            counter++;
            if (counter % 10 == 0) {
                System.out.println();
            }
            if (counter == 100) {
                break;
            }
        }
    }
}
