package Others.MyPractice.P4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q93 {

    public static void main(String[] args) {

          /*
        verilen bir arraydeki tekrar eden elementleri
        silip tekrarsız  halini array e atayan bir kod yazınız
         */
        int[] arr = {4,5,3,6,8,5,1,9,0,4,2,5,7,9,6};

        Set<Integer> tekrarsızset = new HashSet<Integer>();

        for(int each:arr){
            tekrarsızset.add(each);
        }
        System.out.println(tekrarsızset);

        int tekrarsızarr[]=new int[tekrarsızset.size()];

        System.out.println(Arrays.toString(tekrarsızarr));
        int i=0;
        for(int each:tekrarsızset){
            tekrarsızarr[i]=each;
            i++;
        }
        arr=tekrarsızarr;// array de eşitleme olur
        System.out.println("Bizim oğlanın son hali : "+Arrays.toString(arr));
    }
}

