
package testgit1;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Terbilang {

    public static String proses(int value) {
        String[] bilangan = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
        String temp = " ";
        if (value < 12) {
            temp = " " + bilangan[value];
        } else if (value < 20) {
            temp = proses(value - 10) + " belas";
        } else if (value < 100) {
            temp = proses(value / 10) + " puluh" + proses(value % 10);
        } else if (value < 200) {
            temp = " seratus" + proses(value - 100);
        } else if (value < 1000) {
            temp = proses(value / 100) + " ratus" + proses(value % 100);
        } else if (value < 2000) {
            temp = "seribu" + proses(value - 1000);
        } else if (value < 1000000) {
            temp = proses(value / 1000) + " ribu" + proses(value % 1000);
        }
        return temp;
    }
}
