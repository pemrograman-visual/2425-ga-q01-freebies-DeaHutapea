// 12S24046 - Indah Elsadai Nainggolan
// 12S24053 - Dea Anggreany Hutapea

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, totaltransaksi, hargatermurah;

        hargabuku = 0;
        totaltransaksi = 0;
        hargatermurah = 9999;
        int jumlahbuku;

        jumlahbuku = 0;
        hargabuku = Double.parseDouble(input.nextLine());
        while (hargabuku != 0) {
            totaltransaksi = totaltransaksi + hargabuku;
            jumlahbuku = jumlahbuku + 1;
            if (hargabuku < hargatermurah) {
                hargatermurah = hargabuku;
            }
            hargabuku = Double.parseDouble(input.nextLine());
        }
        if (jumlahbuku >= 2 && totaltransaksi >= 100) {
            totaltransaksi = totaltransaksi - hargatermurah;
        }
        System.out.println(toFixed(totaltransaksi,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
