package gr.aueb.cf.ch4;

/*Demo of surrogate pairs*/
public class UnicodeApp {

    public static void main(String[] args) {
        int smilley = 0x1F600;   //UTF-8 smiley
        System.out.println("Smilley: \uD83D\uDE00");

        System.out.println("Smiley");
        System.out.println(Character.toChars(smilley));

    }
}
