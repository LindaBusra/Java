package JavaLessons.day16_arraylist;

import java.util.ArrayList;

public class List14 {

    public static void main(String[] args) {




// How to remove duplicates from an ArrayList [2,3,2,2,5]-->[2.3.5]



        ArrayList<Integer> originalList = new ArrayList<>();

        originalList.add(2);
        originalList.add(23);
        originalList.add(2);
        originalList.add(2);
        originalList.add(5);

        ArrayList<Integer> uniqueList1 = new ArrayList<>();

        for(Integer w:originalList) { {

            if(! uniqueList1.contains(w)) {
                uniqueList1.add(w);
            }
        }
        }

        System.out.println(uniqueList1);        // [2, 23, 5]





//2.way -- diffucult------

        ArrayList<Integer> uniqueList2 = new ArrayList<>(originalList);   //make copy

        int counter = 0;


        for(Integer w: originalList) {

            for (int i = 0; i < uniqueList2.size(); i++) {
                if (w.equals(uniqueList2.get(i))) {
                    counter++;
                }
            }


            if (counter > 1) {
                for (int k = 1; k < counter; k++) {
                    uniqueList2.remove(Integer.valueOf(w));
                }
            }
            counter=0;
        }

        System.out.println(uniqueList2);
    }
}
