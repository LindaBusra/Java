package Others.MyPractice.P5;

import java.util.*;

public class NoAnswered {

    public static void main(String[] args) {



//ArrayList
//Mix01) Write a Java program to swap two elements ( Red ==> Black)  in an ArrayList.

//        ArrayList<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//
//
//        System.out.println(c1);
//
//
//        Collections.swap(c1, 0, 2);
//        System.out.println("After swapping: " + c1);//After swapping: [Black, Green, Red, White, Pink]
//        System.out.println();
//
//
//
//
//
////Mix02) Write a Java program to join 2 ArrayLists(c1 and c2) to a list without repeating element
//
//        ArrayList<String> c2= new ArrayList<String>();
//        c2.add("Red");
//        c2.add("Green");
//        c2.add("Black");
//        c2.add("Pink");
//
//        ArrayList<String> c3 = new ArrayList<>();
//        c3.addAll(c1);
//        c3.addAll(c2);
//
//        System.out.println(c3);
//
//
//        //or
//        ArrayList<String> newList = new ArrayList<>(c1);
//        newList.addAll(c2);
//
//        System.out.println("newList" + newList);        //[Black, Green, Red, White, Pink, Red, Green, Black, Pink]
//
//
//
//        //without repeating element
//        ArrayList<String> c4 = new ArrayList<>();
//        for(String w:c3) {
//
//            if(!c4.contains(w)) {
//                c4.add(w);
//            }
//        }
//
//        System.out.println("c4:" + c4);         //[Black, Green, Red, White, Pink]
//
//
//        System.out.println();
//
//
//
////Mix03) Write a Java program to clone an ArrayList to another ArrayList.(clone c1)
//
//        ArrayList<String> clone = (ArrayList<String>)c1.clone();
//        clone.addAll(c1);
//        System.out.println(clone);//[Black, Green, Red, White, Pink]
//
//
//
//
////Q04_after) Write a Java program to empty an array list. (c1)
//
//        c1.removeAll(c1);
//        System.out.println(c1);//[]
//
//        //or
//        c1.clear();
//
//
//
//
////Q05) Write a Java program to extract first 3 elements of an ArrayList and the result will be a list again.
////Original list: [Red, Green, Orange, White, Black] ==> List of the first three elements: [Red, Green, Orange]
//
//        List<String> list1 = new ArrayList<String>();
//        list1.add("Red");
//        list1.add("Green");
//        list1.add("Orange");
//        list1.add("White");
//        list1.add("Black");
//        System.out.println("Original list: " + list1);
//
//
//        List<String> sub_List = list1.subList(0, 3);
//
//        System.out.println("List of the first three elements: " + sub_List);//List of the first three elements: [Red, Green, Orange]
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////LinkedList
//
////Q06) Write a Java program to iterate a LinkedList in reverse order.
//
//
//        LinkedList<String> list2 = new LinkedList<String>();
//
//
//// use add() method to add values in the linked list
//        list2.add("Red");
//        list2.add("Green");
//        list2.add("Black");
//        list2.add("Pink");
//        list2.add("Orange");
//
//
//        //1.way
//        ListIterator it =list2.listIterator();
//
//        Collections.reverse(list2);
//        System.out.println("list2" + list2);
//
//
//        while(it.hasNext()) {
//
//            it.next();
//
//        }
//        System.out.println(list2);
//
//
//
//        System.out.println("-----------------------");
//
//        //2. way
//
//        Iterator itr = list2.descendingIterator();
//
//        while(itr.hasNext()){
//            System.out.print(itr.next() + " ");//Orange Pink Black Green Red
//        }
//
//
//
//
//
//
////Q07) Write a Java program to remove and return the first element of a linked list. First print the removed element and
////then the updated list. (use list2)
//        System.out.println();
//        System.out.println(list2.pop());//Red
//        System.out.println(list2);//[Green, Black, Pink, Orange]
//
//
//
//
//
//
//
////Q08) Write a Java program to retrieve but does not remove, the last element of a linked list.
//        String lastEl = list2.peekLast();
//        System.out.println(lastEl);//Orange
//
//        list2.getLast();
//        System.out.println(list2.getLast());
//
//
////Q09) Write a Java program to get a String from user as input and find the
////    maximumCounts occurring character in that string. (Ignore case sensitivity)
//
//
//
//
////Q10) delete the middle element in a given String
//// input : [2, 3, 4, 5, 6] ==> output: [2, 3, 5, 6]
////input : [2, 3, 4, 5, 6, 7] ==> output: [2, 3, 6,7]
//
//        LinkedList<Integer> l1 = new LinkedList<>();
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//        l1.add(5);
//        l1.add(6);
//        l1.add(7);
//
//
//
//        if(l1.size()%2==0) {
//            l1.remove(l1.get(l1.size()/2));
//            l1.remove(l1.get(l1.size()/2));
//
//        }else{
//            l1.remove(l1.get(l1.size()/2));
//        }
//        System.out.println("New" + l1);
//
//
////Note:
////        l1.remove(3);        //index nosu 3 olan elementi cikarir
////        l1.remove(Integer.valueOf(25));      //25'i cikarir,. obur turlu indeks olarak aliyor
//
//
//
////SETS
//
////Q11)Type the code that shows how many different elements there are in a list, and print those elements.
//        LinkedList<Integer> l3 = new LinkedList<>();
//        l3.add(2);
//        l3.add(3);
//        l3.add(4);
//        l3.add(5);
//        l3.add(6);
//        l3.add(7);
//        l3.add(4);
//        l3.add(3);
//        l3.add(2);
//
//
//        TreeSet<Integer> l5 = new TreeSet<>(l3);
//
//        System.out.println("l5 size:" + l5.size());
//
//
//        //or
//
//        System.out.println(l3.size());
//        int y = l3.size();
//        Integer X = l3.stream().distinct().collect(Collectors.toList()).size();
//        System.out.println(X);
//
//        System.out.println(y-X);
//
//
//
//
//
////Q12) Type a program to create a HashSet to an Arrays04
//
//        HashSet<String> h_set = new HashSet<String>();
//        h_set.add("Red");
//        h_set.add("Green");
//        h_set.add("Black");
//        h_set.add("White");
//        h_set.add("Pink");
//
//        System.out.println("Original Hash Set: " + h_set);
//
//
//
//
//// Creating an Arrays04
//        String[] brr = new String[h_set.size()];
//        h_set.toArray(brr);
//
//// Displaying Arrays04 elements
//        System.out.println("Arrays04 elements: ");
//        for(String element : brr) {
//            System.out.println(element);
//        }



//Q13) Remove duplicated element from the given array and create an array that have only those unique elements
//int arr[]= {1,2,3,4,4,5,7,3,4}; ==> { 1,2,3,4,5,7}

//        int ar []= {1,2,3,4,4,5,7,3,4};
//
//
//        TreeSet<Integer> l6 = new TreeSet<>();
//        for (Integer w : ar) {
//            l6.add(w);
//        }
//
//        System.out.println("l6 :" + l6);    //[1, 2, 3, 4, 5, 7]










        /* Q14) ?
         * Write a Java program to get a String from user as input and find the maximum
         * occurring character in that string.(Ignore case sensitivity).
         * Input : Learning java is easy
         * Output: maximum occurring character is : a
         */

//        String s1 =" Learning java is easy";
//        s1 = s1.replaceAll("\\s", "").toLowerCase();
//        List<String> list = new ArrayList<>(Arrays.asList(s1.split("")));
//        System.out.println(list);//[l, e, a, r, n, i, n, g, j, a, v, a, i, s, e, a, s, y]
//
//        int counter = 0;
//        int maxCounter = 0;
//        String result = "";
//        for(int i=0; i<list.size();i++){
//            counter = 0;
//            for(int j=i+1; j<list.size();j++){
//
//                if(list.get(i).equals(list.get(j))){
//                    counter++;
//                }
//            }
//            if(counter > maxCounter && !result.contains(list.get(i))){
//                maxCounter = 0;
//                maxCounter = counter;
//                result += list.get(i);
//            }
//
//        }
//        System.out.println(result);

//Q015) What is the output of the following?

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(2);
//        queue.add(8);
//        queue.add(10);
//        queue.add(12);
//        queue.add(21);
//        queue.add(36);
//
//        int count = 0;
//
//        while (queue.isEmpty() == false) {
//            queue.remove();
//            count++;
//            if(count == 3) {
//                break;
//            }
//        }
//        System.out.println("queue" + queue);//?  [12, 21, 36]
//
//        while (queue.isEmpty() == false) {
//            queue.remove();
//            if(count == 3) {
//                break;
//            }
//            count++;
//        }
//        System.out.println("queue"  + queue);//?   [(]21,36]
//
//
////Q16) What is the output of the following?
//
//        TreeSet<String> tSet = new TreeSet<>();
//        tSet.add("Java");
//        tSet.add("my love!");
//        tSet.add("Java");
//        tSet.add("is");
//
//        for (String w : tSet){
//            System.out.print(w + " ");
//        }









//Q16) Create an Arrays04 List. Add the following as an element. ==> "Computer", "Science"
// Create TreeSet and copy the list into the TreeSet and then add the followings as well. "Portal", "GFG"
// Use Iterator to print the elements of the TreeSet and guess what the output is before printing.
// And then print the elements of the TreeSet.

//        ArrayList<String> ll = new ArrayList<String>();
//
//        ll.add("Computer");
//        ll.add("Science");
//
//// Creating TreeSet object of string type
//        TreeSet<String> ts = new TreeSet(ll);
//
//// Adding elements to above TreeSet
//        ts.add("Portal");
//        ts.add("GFG");
//
//// Iterating via iterators
//        Iterator<String> iter = ts.iterator();
//
//// Condition that holds true till
//// there is single element in th List
//        while (iter.hasNext()) {
//
//            // Printing all elements inside objects
//            System.out.print(iter.next() + " "); //Computer GFG Portal Science    //Computer GFG Portal Science
//        }




//------------------------------------------------------------------

        // Java code to find the maximum and minimum in HashSet


//        HashSet<Integer> set = new HashSet<>();
//
//
//        set.add(10);
//        set.add(20);
//        set.add(20);
//        set.add(10);
//        set.add(50);
//        set.add(40);
//
//
//        System.out.println("Maximum value of HashSet : " + Collections.max(set));
//
//        System.out.println("Minimum value of HashSet : " + Collections.min(set));
//
//        //or
//        Integer max = set.stream().sorted(Collections.reverseOrder()).findFirst().get();
//        Integer min = set.stream().sorted().findFirst().get();



//-------------------------------------------------------------------------------
        //To convert HashSet to Arrays04

//        HashSet<String> hashSet = new HashSet<String>();
//
//        hashSet.add("Welcome");
//        hashSet.add("To");
//        hashSet.add("Geeks");
//        hashSet.add("For");
//        hashSet.add("Geeks");
//
//
//        System.out.println("The HashSet: " + hashSet);
//
//
//        // Creating the array and using toArray()
//        String[] arr = new String[hashSet.size()];
//        arr = hashSet.toArray(arr);
//
//        System.out.println(Arrays.toString(arr));


//--------------------------------------------------------


        //Example 1- What is the output?

        HashSet<ArrayList> set = new HashSet<>();


        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();



        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);

        list3.add(2);
        list3.add(1);

        set.add(list1);
        set.add(list2);
        set.add(null);
        set.add(list3);


        System.out.println(set);
        System.out.println("Result:" + set.size());

        System.out.println("------------------------------------");





//Create a  HashSet1 which name is primeNumbers with this numbers:2,3,5,7,11,13,17
//Create a second HashSet2 which name is oddNumbers with this numbers:3,5,11,17,19,27
//Create a third   HashSet3 which name is numbers with this numbers:3,5,13
//a)Write common elements for (Intersection) on the console
//b)Check if numbers is a subset of primeNumbers
//c)Find HashSet1's elements whose are different from HashSet2

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        primeNumbers.add(13);
        primeNumbers.add(17);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(11);
        oddNumbers.add(17);
        oddNumbers.add(19);
        oddNumbers.add(27);
        System.out.println("HashSet2: " + oddNumbers);

//a - Intersection of two sets
        oddNumbers.retainAll(primeNumbers);
        System.out.println("Intersection is: " + oddNumbers);



//b - Check if numbers is a subset of primeNumbers

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(13);
        System.out.println("HashSet3: " + numbers);


        System.out.println("is a subset of primeNumbers: " + primeNumbers.containsAll(numbers));


//c
        primeNumbers.removeAll(oddNumbers);
        System.out.println(primeNumbers);

//---------------------------------------------------


        //Create an array list with these ages:10,12,15,16,19,23,34
        //a)Write all ages which are less then 18 on the console
        //b)Write all ages which are greater then 18 on the console
        ArrayList<Integer> ages = new ArrayList<>();

        // add some elements to the ArrayList
        ages.add(10);
        ages.add(12);
        ages.add(15);
        ages.add(16);
        ages.add(19);
        ages.add(23);
        ages.add(34);

        System.out.println("List of Age: " + ages);

        // ages below 18
        System.out.println("Ages below 18: " + ages.subList(0, 4));

        // ages above 18
        System.out.println("Ages above 18: " + ages.subList(4, ages.size()));





//---------------------------------------------------

        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add some elements to the ArrayList
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        System.out.println("ArrayList: " + languages);

        // element from 1 to 3
        System.out.println("SubList: " + languages.subList(1, 3));

    }
}
