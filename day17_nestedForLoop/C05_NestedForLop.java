package day17_nestedForLoop;

public class C05_NestedForLop {

    public static void main(String[] args) {

        /*
        verilen inputa göre
        * lardan oluşan
        şekli oluşturun
        input=4

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */


        // artan kismi nested forloop ile yapalim
        int input=5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}



