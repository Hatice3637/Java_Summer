package day16_Forloop;

public class C03_örnek2 {

    public static void main(String[] args) {


        // Soru2: 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda
        //  virgul olarak ayni satira yaziniz


        int bas=10;
        int son=30;


        for (int i = bas; i <=son ; i++) {

          if(i<son  ){
              System.out.println(i+ " , ");
          }else{
              System.out.println(i);
          }

        }


    }
}
