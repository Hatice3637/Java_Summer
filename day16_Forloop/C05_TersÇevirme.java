package day16_Forloop;

public class C05_TersÇevirme {

    public static void main(String[] args) {


        // 100'den 1'e kadar(sinirlar dahil) 8 ile bolunebilen sayilari yazdirin
        for (int i = 100; i >=1 ; i--) {
            if (i%8==0){
                System.out.print(i+" ");
            }
        }
    }
}


