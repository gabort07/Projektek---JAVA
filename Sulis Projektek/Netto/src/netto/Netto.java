package netto;
import java.util.Scanner;

/**
 *
 * @author gabor
 */
public class Netto {

    public static double afaNetto(double bruttoOsszeg, int afaKulcsSzazalek) {
        return (bruttoOsszeg / (afaKulcsSzazalek + 100.00)) * 100;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a bruttó árat: ");
        double a = sc.nextDouble();
        System.out.print("Kérem az ÁFA-kulcsot: ");
        int b = sc.nextInt();
        double nettoAr = afaNetto(a, b);
        System.out.printf("Nettó ár: %.2f", nettoAr);
    }
}
