package gr.aueb.cf.ch2;

/*Template for programming
*Πολλαπλασιάζει δύο ακεραίους και εκτυπώνει
* το αποτέλεσμα στην κονσόλα
*/

public class OutPut2App {

    public static void main(String[] args) {
       int price = 100;
       int quantity = 500;
       int TotalPrice = 0;

       TotalPrice = price * quantity;


        System.out.printf("Quantity: %3d, Price: %d, TotalPrice: %,d\n", quantity, price , TotalPrice);
    }
}
