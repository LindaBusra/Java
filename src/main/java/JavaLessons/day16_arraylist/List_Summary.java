package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_Summary {
    public static void main(String[] args) {



    //to create Array list

    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<String> list1 = new ArrayList<String>();
    List<String> list3 = new ArrayList<>();


    //to print
    System.out.println(list3);


    ArrayList<String> birds = new ArrayList<>();

    //add element without index
    birds.add("hawk");                      // hawk
    birds.add("test");                      // hawk,test


    //add element with index
    birds.add(1, "robin");     // hawk,robin,test
    birds.add(0, "blue jay");  // blue jay, hawk,robin,test
    birds.add(1, "cardinal");  // blue jay, cardinal, hawk,robin,test


    //size()
    int size= birds.size();
    System.out.println(size);               // 5

    // isEmpty()
    System.out.println(birds.isEmpty());    // false


    //remove() without index
    System.out.println(birds.remove("cardinal"));       //true, because it has that
    System.out.println(birds.remove("horizontal"));     // false, because it has not that item


    //remove() with index returns the removed element
    System.out.println(birds.remove(0));            // returns the remove element, blue jay


    //set()
    System.out.println(birds);                              // [hawk, robin, test]
    System.out.println(birds.set(0, "cardinal"));           // hawk-->it shows the element which was eliminated
    System.out.println(birds);                              // [cardinal, robin, test]
    System.out.println(birds.size());                       // 3


    //contains
    System.out.println(birds.contains("robin") );           //true


    ArrayList<String> ch = new ArrayList<>();

    ch.add("B");
    ch.add("A");
    ch.add("c");

    System.out.println(ch);     // [B, A, c]
    Collections.sort(ch);
    System.out.println(ch);     // [A, B, c]


//        for(int w: numbers) {
//
//            numbers.set(numbers.indexOf(w), w+2);         //change a number with +2
//        }


//------------------------------------------------------------------------------------------

        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(7);
        System.out.println(nums); // [3, 2, 7]
        Collections.sort(nums);

        System.out.println(nums); // [2, 3, 7]

//-----------------------------------------------------------------------------------------

        // equals() -By using equals() method we can compare two lists to see if they contain the same elements in the same order.
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();

        System.out.println(one.equals(two)); // true

        one.add("a"); // [a]
        System.out.println(one.equals(two)); // false
        two.add("a"); // [a]
        System.out.println(one.equals(two)); // true
        one.add("b"); // [a,b]
        two.add(0, "b"); // [b,a]
        System.out.println(one.equals(two)); // false


//---------------------------------------------------------------------------------------------

        //clear()  Returns nothing, its return type is void
        List<String> birds1 = new ArrayList<>();
        birds1.add("hawk"); // [hawk]
        birds1.add("hawk"); // [hawk, hawk]

        System.out.println(birds1.isEmpty()); // false
        System.out.println(birds1.size()); // 2

        birds1.clear(); // []
        System.out.println(birds1.isEmpty()); // true
        System.out.println(birds1.size()); // 0


//--------------------------------------------------------------------------------

//        ArrayList<String> bb = new ArrayList<>();
//
//        //add() without index
//        bb.add("A");
//        bb.add("K");
//        bb.add("R");
//        bb.add("S");
//
//        System.out.println(bb);     //direk cikti almak
//        bb.size();          //uzunlugunu verir
//        bb.isEmpty();       //bossa true verir
//        bb.contains("R");   //iceriyorsa true verir.
//
//
//        //add() with index
//        bb.add("M");                        //eleman eklemek
//        bb.add(1, "G");        //1 nolu indekse ekledim
//
//        bb.remove("R");                  // eleman cikarmak
//        bb.remove(2);                  //indeksi 2 olan elemani cikarmak
//        bb.indexOf("K");                     //index bulmak
//        bb.set(1, "D");                      //1. elemani degsitirmek
//        bb.get(2);                           //2. indeks nolu elamni getirmek
//
//
//        String ch = "R";
//        bb.set(bb.indexOf(ch), "Got it");   //Elaman getirmek ve degistirmek
//        bb.indexOf("H");            //-1 bu element yok demek
//
//
//        bb.indexOf("A");        //first occurence
//        bb.lastIndexOf("A");    //last occurence
//
//
//        bb.clear();                     //tamamen temizlemek
//
//        bb.isEmpty();           //isEmpty() method looks at the ArrayList whether if it is empty or no
//
// //-----------------------------------------------------------------------------------
//
//        ArrayList<String> cc = new ArrayList<>();
//
//        cc.add("E");
//        cc.add("T");
//
//        bb.addAll(cc);              //baska bir arrayi katmak
//        bb.addAll(2, cc);       //belli bir indeksten sonraya katmak
//
//        bb.remove(cc);              //bir arrayi remove etmek
//
//
////-----------------------------------------------------------------------------------
//
//
//
//
//        ArrayList<Integer>  a = new ArrayList<>();
//        a.add(12);
//        a.add(4);
//        a.add(13);
//        a.add(25);
//        a.add(432);
//        System.out.println(a);
//
//        Collections.sort(a);            //kucukten buyuge dizer
//        a.remove(3);        //index nosu 3 olan elementi cikarir
//        a.remove(Integer.valueOf(25));      //25'i cikarir,. obur turlu indeks olarak aliyor
//
//
//        a.set(2, 100);      //2 nolu elemani 100 ile degistir
//        a.get(2);           // 2 index nolu elemani getirir
//
//
//        a.set(a.indexOf(25), 51);       //a'da 25 in indeksini bulur, ve 25'i 51 ile degistirir
//
//
////------------------------------------------------------------------------------------------------------
//
//
//
////How to convert an ArrayList to an Array
//
//
//        List<String> list = new ArrayList<>();
//        list.add("hawk");
//        list.add("robin");
//
//        System.out.println(list); // [hawk, robin]
//
//        String arr[ ] = list.toArray(new String[0]);
//
//        System.out.println(arr.length); // 2
//        System.out.println(Arrays.toString(arr)); // [hawk, robin]
//


        // How to convert an Array to an ArrayList
        String[] arr = { "hawk", "robin" }; // [hawk, robin]
        List<String> list = Arrays.asList(arr); // converts the array to fixed size list

        System.out.println(list.size()); // 2
        System.out.println(list); // [hawk, robin]


        //Note: If you update the elements through Array methods or List methods, both array elements and list elements
        //will be affected.Because they point to the same data store.
        list.set(1, "test"); // [hawk, test]
        arr[0] = "new"; // [new, test]
        System.out.println(Arrays.toString(arr)); // [hawk, robin]
        System.out.println(list); // [hawk, robin]


        //Note
        list.remove(1); // throws UnsupportedOperation Exception because we are not allowed to change the size of the list. It is fixed size list
    }
}
