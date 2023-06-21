import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Islem yapmak istediginiz dairenin yaricapini giriniz\n");
        double yariCap = s.nextDouble();
        double alan = alanHesapla(yariCap);
        double cevre = cevreHesapla(yariCap);
        System.out.println("Dairenin alani= "+ alan);
        System.out.println("Dairenin cevresi= "+ cevre);

    }

    public static double alanHesapla(double yariCap)
    {
        double pi = Math.PI;
        return pi * yariCap * yariCap;
    }

    public static double cevreHesapla(double yariCap)
    {
        double pi = Math.PI;
        return 2 * pi * yariCap;
    }
}