package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List16 {

    public static void main(String[] args) {



//    int ar[] = new int[4];      //it is not flexible with length

/*
1-When you create an array you have to declare the length otherwise you cannot create an array.
2-After declaring the length it is impossible to store more elements in it, this is not good.
3-Java created another structure to store multiple elements, it is ArrayLists.

ArrayLists are flexible in length.  It means while you create an ArrayList no need to declare length.
After creating Arraylist you may store any number of elements, there is no any restriction about it.
4-Arrays can contain "primitive" data types and "referances" but ArrayList can contain just "non-primitive data types.
int-->Array,   but Integer-->ArrayList      */



//How to create an Arary List

        //1.way
        ArrayList<Integer> al1 = new ArrayList<>();   //al1_variabel name

        //2.way
        ArrayList<Integer> al2 = new ArrayList<Integer>();   //

        //3.way
        List<Integer> al3 = new ArrayList<>();   //


        System.out.println(al1);        // [ ]

        //add()  method puts the elements in ArrayList acocording to the insertion order.
        al1.add(11);
        al1.add(12);
        al1.add(5);
        System.out.println(al1);        // [11, 12, 5]


        //Find index of en element
        System.out.println("index of 11: " + al1.indexOf(11));



        //Belli bir elamani yazdirma
        System.out.println("index no'su 1 olan eleman: " + al1.get(1));


        //add en element an spesial sted
        al1.add(1,99);
        System.out.println(al1);        //[11, 99, 12, 5]




        //How to get the number of elements in an ArrayList?
        int numOfElements = al1.size();
        System.out.println(numOfElements);      //4

        System.out.println(al2.size());     //0 henuz deger atamadim cunu.

        //Note:When you tolk about the number of elements in an "Array" tell "Array length"
        //Note:When you tolk about the number of elements in an "ArrayList" tell "List size"




        //How to check if an ArrayList is empty or not?

        //1.way
        if(al1.size()==0) {
            System.out.println("it is empty");
        } else {
            System.out.println("It is not empty");          // It is not empty
        }

        //2.way
        if(al1.isEmpty()) {
            System.out.println("it is empty");
        } else {
            System.out.println("It is not empty");           // It is not empty
        }




        //How to check if an ArrayList has just space in it?

        ArrayList<String> al4 = new ArrayList<>();      //  []
        al4.add(" ");   //  [ ]
        al4.add("a");   //  [  , a ]

        for(String w : al4) {
            if(w.equals(" ")) {
                System.out.println("There is space");               //There is space
                break;
            }
        }


//--------------------------------------------------------------------------------------------



        //Create a String ArrayList, add 5 elements into it, remove a specific element


        ArrayList<Integer> al6 = new ArrayList<>();
        al6.add(12);
        al6.add(13);
        al6.add(7);
        al6.add(32);
        al6.add(1);
        System.out.println(al6);            // [12, 13, 7, 32, 1]

        //When you have integers to remove, you have to use remove() method with index

        //remove() method can not be used with integer elements !!!!!!!!


     //1.yol
//        al6.remove(1);             // 13'u silmek istiyoruz.
//        System.out.println(al6);        // [12, 7, 32, 1]

      //2.yol
        Integer el = Integer.valueOf(32);
        al6.remove(el);
        System.out.println("After remove 32 : " + al6); //[12, 13, 7, 1]



        al6.remove(al6.indexOf(7));
        System.out.println(al6);        // [12, 32, 1]



//-----------------------------------------------------------------------------

        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);

        System.out.println(a);            //[5, 6, 7, 8, 9]

        ArrayList<Integer> b = new ArrayList<>();
        b.add(98);
        b.add(99);

        a.addAll(b);
        System.out.println(a);           // [5, 6, 7, 8, 9, 98, 99]  //ekleneni en son koydu

        b.addAll(a);
        System.out.println(b);           //  [98, 99, 5, 6, 7, 8, 9, 98, 99]  I used updated al8

        //add ile single degerler ekleyebilriiz ve sona ekler.
        //adAll'da sona ekler, ozel olrak index tanimlanmadigi surece



        ArrayList<Integer> c = new ArrayList<>();
        c.add(111);
        c.add(112);

        //I will put this arrya midt of al9  -->[98, 99, 5, 6, ***, ***  7, 8, 9, 98, 99]

        b.addAll(4,c);
        System.out.println(b);            // [98, 99, 5, 6, 111, 112, 7, 8, 9, 98, 99]


        //removeAll() -->tekrar edenler de silinir
        b.removeAll(a);         //remove collection secildi, a'nin son degeri [5, 6, 7, 8, 9, 98, 99] idi, bunlar cikacak
        System.out.println(b);      //[111, 112]


        //contains
        System.out.println("Does 98 exist? " + a.contains(98));  //True


        //clear()
        b.clear();
        System.out.println("Now b is: " + b);


        //set() -->update existing element
        System.out.println(a);      //[5, 6, 7, 8, 9, 98, 99]
        a.set(5,999);               //change the item which index of is 5, with 999
        System.out.println(a);      // [5, 6, 7, 8, 9, 999, 99]


//--------------------------------------------------------------------------------------------

        //Change the elements less than 10 to 777


        //1.way
        for(Integer w : a) {
            if(w<10) {
                a.set(a.indexOf(w), 777);
            }
        }
        System.out.println(a);          // [777, 777, 777, 777, 777, 999, 99]


        //2.way
        for(int i=0; i<a.size(); i++) {

            if(a.get(i) <10) {
                a.set(i, 777);
            }
        }
        System.out.println(a);          // [777, 777, 777, 777, 777, 999, 99]


//-----------------------------------------------------------------------------------------------


        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Java");
        s1.add("Lambda");

        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Java");
        s2.add("Lambda");

        if(s1.equals(s2)) {
            System.out.println("They are same");
        }

        // or
        boolean r = s1.equals(s2);
        System.out.println(r);




//------------------------------------------------------------------------------


        //To make ArrayList from array


        int[] arr = {2,3,4,5,6,6,7,8,9,10};
        List<Integer> num= new ArrayList<>();

        for(Integer each:arr) {
            num.add(each);
        }
        System.out.println("sayilarim arrayListi " + num);




//-------------------------------------------------------------------------


        //contains


        String[] alphabet = new String[]{"A", "B", "C"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);

        if(list.contains("A")) {
            System.out.println("Hello A");
        }

        boolean result = Arrays.stream(alphabet).anyMatch("A"::equals);
        if (result) {
            System.out.println("Hello A");
        }



//Convert an array to ArrayList

        String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
        ArrayList<String>  listt = new ArrayList<String>(Arrays.asList(my_array));

        System.out.println(listt);
    }

}
