package day07_ifStatements;

public class C02_İf {


    public static void main(String[] args) {

        int sayi=10;

        if(sayi>0);{
            System.out.println("sayi pozitif");
        }
        if (sayi % 2 == 0) {
            System.out.println("sayi cift");
        }
        if (sayi % 5 == 0) {
            System.out.println("sayi 5 in tam kati");
            /*
            { olmaz ise şart sağlansada sağlanmasada çalışır.
            Fakat sout  ilk ine göre çalışır.
             */

        }

    }
}
