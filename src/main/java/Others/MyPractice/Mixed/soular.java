package Others.MyPractice.Mixed;

import java.util.*;
import java.util.Arrays;

public class soular {

    public static void main(String[] args) {



//Question-18  Create a hashSet with this integer values {25,62, 49, 87} and then print the value of each element to the screen by increasing it by 3. -->{28,65,52,90}
//After that put them in ascending order

        HashSet<Integer> Numbers = new HashSet<Integer>();


        Numbers.add(25);
        Numbers.add(62);
        Numbers.add(49);
        Numbers.add(87);

        int arry [] = new int[Numbers.size()];

        Iterator<Integer> itr = Numbers.iterator();

        int mm=0;

        while(itr.hasNext()) {

            arry[mm] =itr.next()+3;
            mm++;

        }


        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));




//mevlut beyin cozumu

        List<Integer> hs = new ArrayList<>();
        hs.add(25);
        hs.add(87);
        hs.add(49);
        hs.add(62);

        TreeSet<Integer> h = new TreeSet<>();
        ListIterator<Integer> a = hs.listIterator();
        while (a.hasNext()){
            int i = a.next();
            i+=3;
            h.add(i);
        }
        System.out.println(h);


     //yasin beyin cozumu


        HashSet<Integer> increasingInteger=new HashSet<>();
        increasingInteger.add(25);
        increasingInteger.add(62);
        increasingInteger.add(49);
        increasingInteger.add(87);

        Iterator<Integer> newList=increasingInteger.iterator();

        TreeSet<Integer> sorted=new TreeSet<>();
        System.out.println();

        while (newList.hasNext()){
            sorted.add(newList.next()+3);

        }
        System.out.println("==>"+sorted);













//Question 19- Find max and min element in this array with help HashSet  -->{1, -5, 2, 4, 7, -6}


        int numbers []= {1, -5, 2, 4, 7, -6};


        HashSet<Integer> nums = new HashSet<>();


        for(int w:numbers) {
            nums.add(w);
        }
        System.out.println(nums);

        System.out.println("max:" + Collections.max(nums) + ", min:"  + Collections.min(nums));




//yasin bey

        HashSet<Integer> minMax= new HashSet<>();
        minMax.add(1);
        minMax.add(-5);
        minMax.add(2);
        minMax.add(4);
        minMax.add(7);
        minMax.add(-6);

        TreeSet<Integer> sortedMinMax=new TreeSet<>();
        sortedMinMax.addAll(minMax);
        System.out.println(sortedMinMax.first());
        System.out.println(sortedMinMax.last());


//hatice:

        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(-5);
        mySet.add(2);
        mySet.add(4);
        mySet.add(7);
        mySet.add(-6);


        System.out.println(Collections.max(mySet));
        System.out.println(Collections.min(mySet));







//Question 20- Make a LinkedList with the names of these programs. { PHP, SQL, HTML, C++, Java}
// And print them on the console like that : 1a) PHP 2b) SQL 3c) HTML 4d) C++ 5e) Java

        LinkedList<String> programs = new LinkedList<>();


        programs.add("PHP");
        programs.add("SQL");
        programs.add("HTML");
        programs.add("C++");
        programs.add("Java");


        Iterator<String> itr1 = programs.iterator();

        int k=1;
        char ch = 'a';
        while (itr1.hasNext()) {

            System.out.print(k + "" + ch + ") " + itr1.next() + "  ");
            k++;
            ch++;
        }
        System.out.println();
















// Question 22- Type code to count the number of occurrences of the words in a String. (Case insensitive)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to see repeated characters");
        String str = scan.nextLine();


        str = str.trim().replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        String arr[] = str.split("");
        Arrays.sort(arr);
        String temp = "";


        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            if (!temp.contains(arr[i])) {
                temp = temp + arr[i] + count + " ";
            }
        }
        System.out.println(temp);

    }
}
