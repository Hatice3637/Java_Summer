package day06_concatination;

public class C02_Concatination {

    public static void main(String[] args) {

        String str1="Java";
        String str2="guzelMi";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+" "+str2+" "+sayi1+sayi2);
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));
        System.out.println(sayi1+sayi2+" "+str1);
        System.out.println(""+sayi1+sayi2+" "+str2);

        System.out.println(str1.concat(str2));

    }
}
