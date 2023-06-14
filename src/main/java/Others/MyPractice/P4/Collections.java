package Others.MyPractice.P4;

import java.util.*;

public class Collections {
    public static void main(String[] args) {


        LinkedList<Integer> l1 = new LinkedList <> ();
        LinkedList<Integer> l2 = new LinkedList <> ();
        /*
        a-5 ve 7'yi eleman olarak ekleyin.
        b-listeyi ekrana yazdirin.
        c-ardindan listeyi bu hale getirelim-->[10, 5, 7,6]
        d-listenin basina 3 ekleyelim
        e-listenin 2 index nolu elemanini remove edelim.
        f-listenin 1 index nolu elemaninin degerini 11 yapalim.
        g-listenin 2 index nolu elemanini ekrana yazdiralim
        h-yeni bir liste olsuturalim adi l2 olsun ve l1 listesindeki tum elemanlari l2 listesine ekleyelim ve ekrana yazdiralim.
        i-l1 listesinin son halini [3,11,3,11,7,6,7,6] haline getirelim.
        j-l1 listesinin elemanlari toplamini bulalim.
        k)l1'i en son su hale getirelim-->//[6,6] ve ekrana yazdrialim



         */
//        System.out.println("a-----------------");
//        l1.add(5);
//        l1.add(7);
//
//
//        System.out.println("b-----------------");
//        System.out.println(l1);
//
//        System.out.println("c-----------------");
//        l1.add(0,10);       //c-->[10, 5, 7]    //addFirst()
//        l1.add(6);                      //[10,5,7,6]        //addLast()
//
//
//        System.out.println("d-----------------");
//        l1.add(0,3);       //[3,10,5,7,6]
//
//        System.out.println("e-----------------");
//
//        l1.remove(2);           //[3,10,7,6]
//
//        System.out.println("f-----------------");
//        l1.set(1,11);               //[3,11,7,6]
//
//        System.out.println("g-----------------");
//        System.out.println(l1.get(2));      //7
//
//        System.out.println("h-----------------");
//        l2.addAll(l1);          //3,11,7,6
//        System.out.println(l2);
//
//        System.out.println("i-----------------");
//        l1.addAll(2,l2);        //[3,11,3,11,7,6,7,6]
//        System.out.println("l1: " + l1);
//        System.out.println("l1: " + l2);
//
//        System.out.println("j-----------------");
//        int sum = 0;
//        for(int w:l1) {
//            sum += w;
//        }
//        System.out.println("sum is: " + sum);
//
//
//        System.out.println("k-----------------");
//        System.out.println(l1);
//        LinkedList<Integer> l3 = new LinkedList <> (Arrays.asList(3,11,7));
////        l1.removeAll(l3);
////        System.out.println(l1);
//
//
//// veya [6,6] arrayini elde etmek icin bu yolda kullanilabilir:
//
//        ListIterator<Integer> itr = l1.listIterator();
//
//        while(itr.hasNext()){
//
//            Integer el = itr.next();
//            if(el!=6){
//                itr.remove();
//
//            }
//        }
//        System.out.println(l1);



        //HashSet kullanarak bu listeyi elde ediniz-->[4, 7, java güzeldir, 11]
        //Ardindan elemanalri [5, Java Super, true, X, [4, 7, java güzeldir, 11]] olan bir Arraylist olusturalim


//        Set<Object> s1=new HashSet<>(Arrays.asList(4,11,7,"java güzeldir" ));
//
//
//        System.out.println(s1); // [4, 7, java güzeldir, 11]
//
//        List<Object> liste=new ArrayList<>(Arrays.asList(5,"Java Super",true,'X',s1));
//
//
//        System.out.println(liste);




//
//        System.out.println("---------------------------------------");
//        //----------------------------
//
//
        LinkedList <Integer> ll=new LinkedList<>(Arrays.asList(1,3,5,7,8));

        System.out.println(ll);



        System.out.println("part1---------------------------");


        System.out.println(ll.element());   //1
        System.out.println(ll);     //1,3,5,7,8
        System.out.println(ll.peek());  //1
        System.out.println(ll.indexOf(2));      //-1
        System.out.println(ll.peekFirst()); //1
        System.out.println(ll.get(2));   //5

        System.out.println("part1.1---------------------------");
        System.out.println(ll);     //[1, 3, 5, 7,8]
        ll.pollLast();  //
        System.out.println(ll.pollLast());
        System.out.println(ll); ////[1, 3, 5]
        ll.push(42);        //42,1,3,5
        System.out.println(ll);
        System.out.println(ll.peekLast()); //5
        System.out.println(ll.poll());  //1,3,5
        System.out.println(ll);

        System.out.println("part2---------------------------");

        ll.poll(); //7,3,5,8

        ll.add(2,8);
        ll.offerFirst(7);
        System.out.println(ll);  //7,3,5,8

        System.out.println("part3---------------------------");

        ll.offer(9); ////7,3,5,8,9

        System.out.println(ll);
        ll.add(3);   ////21,3,5,8,9,3
        ll.poll();
        ll.addFirst(21);
        System.out.println(ll); //3,5,8,9,3,12

        System.out.println("part4---------------------------");

        ll.addLast(12);
        ll.push(5);
        ll.peek();
        ll.element();
        ll.poll();
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);//3,5,8,9,3,12
        System.out.println(ll.get(4));  //3
        System.out.println(ll.indexOf(7));  //-1

        ll.clear();
        System.out.println(ll.peek());  //null
        System.out.println(ll.poll());  //null
//      System.out.println(ll.element());       //NoSuchElementException
//        System.out.println(ll.remove());        //NoSuchElementException












// a-Verilen arraydeki tekrarli elemanlari silip, arrayin son halini ekrana yazdirin
 //b-Arrayin son halini [3,7,6,12] haline getirin. (elemanlarin yeri farkli olabilir)






//
//        int arr[]= {3,4,5,6,7,8,4,5,6,3,8,12,3,25};
//
//        Set<Integer> unique=new HashSet<>();
//
//        for (Integer e : arr) {
//            unique.add(e);
//        }
//
//        System.out.println(unique);
//
//        Set<Integer> n =new HashSet<>(Arrays.asList(3,7,6,12));
//        unique.retainAll(n);
//        System.out.println(unique);


//-----------------------------------------------------------------

        // Gelen sona gelir,silinen baştan silinir.
        // first in first out (FİFO)

//        Queue <String> list = new LinkedList<>();
//
//        list.add("Tom");
//        list.add("Ole");
//        list.add("Mary");
//
//        System.out.println(list);
//        list.offer("Einar");
//        list.remove();
//        list.add("Terje");
//
//
//        System.out.println(list.offer(null));
//
//
//        System.out.println(list.peek());
//        System.out.println(list.poll());
//
//        list.add("Mary");
//        System.out.println(list);
//



//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(6);
//        System.out.println("TreeSet: " + numbers);
//
//
//        System.out.println("Removed First Element: " + numbers.pollFirst());  ////what is the output
//
//
//        System.out.println("Removed Last Element: " + numbers.pollLast());      //what is the output
//
//        System.out.println("New TreeSet: " + numbers);     //what is the output





//
//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(6);
//        System.out.println("TreeSet: " + numbers);
//
//        // Using headSet() with default boolean value
//        System.out.println("Using headSet without boolean value: " + numbers.headSet(5));
//
//        // Using headSet() with specified boolean value
//        System.out.println("Using headSet with boolean value: " + numbers.headSet(5, true));





/*
The headSet() method returns all the elements of a tree set before the specified element (which is passed as an argument).

The booleanValue parameter is optional. Its default value is false.

If true is passed as a booleanValue, the method returns all the elements before the specified element including the specified element.
 */









//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(6);
//        System.out.println("TreeSet: " + numbers);
//
//        // Using higher()
//        System.out.println("Using higher: " + numbers.higher(4));           //Returns the lowest element among those elements that are greater than the specified
//
//        // Using lower()
//        System.out.println("Using lower: " + numbers.lower(4));
//
//        // Using ceiling()
//        System.out.println("Using ceiling: " + numbers.ceiling(4));
//
//        // Using floor()
//        System.out.println("Using floor: " + numbers.floor(3));



/*
higher(element) - Returns the lowest element among those elements that are greater than the specified element.
lower(element) - Returns the greatest element among those elements that are less than the specified element.
ceiling(element) - Returns the lowest element among those elements that are greater than the specified element.
If the element passed exists in a tree set, it returns the element passed as an argument.
floor(element) - Returns the greatest element among those elements that are less than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
 */






//        TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(6);
//        System.out.println("TreeSet: " + numbers);
//
//        // Using subSet() with default boolean value
//        System.out.println("Using subSet without boolean value: " + numbers.subSet(4, 6));
//
//        // Using subSet() with specified boolean value
//        System.out.println("Using subSet with boolean value: " + numbers.subSet(4, false, 6, true));
//        System.out.println("Using subSet with boolean value: " + numbers.subSet(4, true, 6, true));





//Type code to print wholeparts of digits with "!" before hver each caharacter and decimal part of
// with an asterix. For example; 75.4238 ⇒ !7!5*4*2*3*8


        //my solution
        double num = 75.4238;

        String num1 = String.valueOf(num);

        int indexDat = num1.indexOf(".");

        String num3=num1.substring(0,indexDat);
        for(int i=0; i<num3.length(); i++) {

            System.out.print("!"+ num3.charAt(i));
        }

        String num2 = num1.substring(indexDat+1 );


        for(int i=0; i<num2.length(); i++) {

            System.out.print("*" + num2.charAt(i));
        }



        //2. way
//Type code to print digits just in the decimal part of the given
// decimal number with an asterix. For example; 75.4238 ⇒ *4*2*3*8

//    double n = 75.4238;
//    String str = String.valueOf(n);
//
//    String s = "";
//
//    String decPart = str.split("\\.")[1];  //. when we split it with "." we have to use \\ before it.
//
////when we use "." in split() method use it "\\."
//
//        int i = 0;
//    do{
//        String r = decPart.substring(i, i+1);
//        s = s + "*" + r;
//
//        i++;
//
//    }while(i<decPart.length());
//
//        System.out.println(s);


    }
}





