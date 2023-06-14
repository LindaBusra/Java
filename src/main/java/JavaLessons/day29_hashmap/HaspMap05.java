package JavaLessons.day29_hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class HaspMap05 {

    public static void main(String[] args) {



/* Q04_after
count the number of characters in the given String and print HashMap and sort alphabetical order
 */

        String queen ="We are the champions, my friends, And we'll keep on fighting till the end";

        String str[] = queen.toLowerCase().replaceAll("[^a-zA-Z]", "").split("");


        HashMap<String, Integer> chList = new HashMap<>();

        for(String w: str) {

            Integer num = chList.get(w);

            if(num == null) {

                chList.put(w,1);

            } else {

                chList.put(w, num+1);
            }
        }
        System.out.println(chList);


        TreeMap<String, Integer> list = new TreeMap<>(chList);

        System.out.println(list);


// Q2 type a method to find sum of values in hashmap

        System.out.println(sumOfValues(chList));
        sumOfValues1(chList);





// Q3 find numbers entries

        System.out.println(chList.size());
        System.out.println(chList.entrySet().size());


// Q4 update value of "q" key to "1977"
        //
        chList.putIfAbsent("q", 1977);
        System.out.println(chList);


 // Q5 find numbers entries

        System.out.println(chList.size());

// Q6 find the all distinct letters in string

        TreeMap<String, Integer> list1 = new TreeMap<>(chList);
        System.out.println(list1.keySet());

        Set<String> letters = chList.keySet();
        System.out.println(letters);


//Q7 sort the letters in descending order

        list1.keySet().stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
        System.out.println();

//Q8 find the maximum value

        int max = list1.values().stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);

        System.out.println("-------------------");
//Q9 find entry which has the maximum value

        int x=Integer.MIN_VALUE;
        for (Integer w : chList.values()){

            if (w>x){
                x=w;
            }
        }
        for (String w : chList.keySet()){
            if (chList.get(w) ==x){
                System.out.println(w);
            }
       }

        System.out.println("------");
        //or
        int temp =Integer.MIN_VALUE;
        String tempStr="";

        for (Map.Entry<String,Integer> w:chList.entrySet()){

            if (w.getValue()>temp){
                temp=w.getValue();
                tempStr= w.getKey();
            }
        }
        System.out.println("3. Way==> "+tempStr+"="+temp);


        //or
        System.out.print(Collections.max(chList.entrySet(),(t,u)-> t.getValue() - u.getValue()).getKey());


        System.out.print("=");
        System.out.println(Collections.max(chList.entrySet(),(t,u)-> t.getValue() - u.getValue()).getValue());

        System.out.println("--------------------------------");

 //Q9

// Change all value to uppercase



        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "java");
        languages.put(2, "javascript");
        languages.put(3, "python");


        //1.way
        for (Integer a : languages.keySet()) {

            for (String w : languages.values()) {
                languages.replace(a,w,w.toUpperCase());

            }
        }
        System.out.println(languages);

//2.way
languages.replaceAll((key, value) -> value.toUpperCase());
        System.out.println("Uptades HashMap " + languages);

//3.way

        upperCase(languages);










// Q10
// replace all value with the square of key

        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(5, 0);
        numbers.put(8, 1);
        numbers.put(9, 2);
        System.out.println(numbers);


for (Integer w: numbers.keySet()){
    for (Integer a : numbers.values()){
        numbers.replace(w,a,w*w);
    }
}
System.out.println(numbers);


numbers.replaceAll((key, value) -> key * key);
System.out.println("Updated HashMap: " + numbers);



//Q11  decrease value by 10%
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("apple", 200.0);
        prices.put("banana", 300.0);
        prices.put("melon", 150.0);
        System.out.println("Normal Price: " + prices);

        System.out.print("Discounted Price: ");

        for (String w : prices.keySet()){
            for (Double s : prices.values()){
                prices.replace(w,s*0.9);
            }
        }
        System.out.println(prices);

 //2.way

        prices.forEach((key, value) -> {
            value = value - value * 10/100;
            System.out.print(key + "=" + value + " ");
        });



    }
    public static int sumOfValues(HashMap<String, Integer> map){
        int sum = 0;
        Collection<Integer> a = map.values();
        for (Integer w: a){
            sum+=w;
        }
        return sum;
    }

    public static void sumOfValues1(HashMap list) {

        Collection<Integer> numbers = list.values();

        System.out.println(numbers.stream().reduce(0, Math::addExact));

    }


    public static List<String> upperCase(HashMap<Integer, String> languages){

        Collection<String> a = languages.values();
        List<String> b = a.stream().collect(Collectors.toList());
        ListIterator<String> myItr = b.listIterator();
        while (myItr.hasNext()){
            String next = myItr.next();
            myItr.set(next.toUpperCase());
        }
        return b;
    }

}
