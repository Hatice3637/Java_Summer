package day09_Ternary;

public class C06_SwichCase {


    public static void main(String[] args) {


        /*
        Kullanicidan gun ismini alin
        hafta ici veya hafta sonu oldugunu yazdirin
         */

        String input= "Cuma";
        input=input.toLowerCase();
        switch (input){
            case "pazartesi" :
                System.out.println("Hafta ici");
                break;
            case "sali" :
                System.out.println("Hafta ici");
                break;
            case "carsamba" :
                System.out.println("Hafta ici");
                break;
            case "persembe" :
                System.out.println("Hafta ici");
                break;
            case "cuma" :
                System.out.println("Hafta ici");
                break;
            case "cumartesi" :
                System.out.println("Hafta sonu");
                break;
            case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }
        switch (input){
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("Hafta ici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }
    }
}

