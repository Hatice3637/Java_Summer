package day04_dataCasting;

public class C01_DataCasting {


    public static void main(String[] args) {

        char harf='a';
        //char yeniharf=harf+1// char ascii değeri 97+1=98
                            //char 98 olamayacağı için hata verir


        char yeniharf=(char)(harf+1);
        System.out.println("yeniharf = " + yeniharf);


        /*bazen bir variable oluştr. data turu dışında değer atanır.
        bazısını otomatik kabul eder
         */


        int sayi1=(int)7.3;
        System.out.println("sayi1 = " + sayi1);

        double sayi2=10;
        System.out.println("sayi2 = " + sayi2);

        int sayi3='c';
        System.out.println("sayi3 = " + sayi3);
        
        char harf2=98;
        System.out.println("harf2 = " + harf2);

    }


}
