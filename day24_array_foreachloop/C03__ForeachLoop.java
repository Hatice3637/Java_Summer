package day24_array_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C03__ForeachLoop {

    public static void main(String[] args) {

        int[] arr ={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        // array'deki tum elemanlari iceleyelim, tek sayi olanlari list'e atayalim
        for (int each: arr  // gelecek datalarin turu, loop icinde ne isim verdigim, neren aldigim
        ) {
            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}


