package JavaLessons.day29_hashmap;

import java.util.*;

public class RepeatIt_Practice01 {
    public static void main(String[] args) {
        /* Q04_after
        count the number of characters in the given String and print HashMap and sort alphabetical order
         */
        String queen ="We are the champions, my friends, And we'll keep on fighting till the end";
        String[]queenArray=queen.toLowerCase().replaceAll("[^a-zA-Z]","").split("");

        HashMap<String,Integer> champions=new HashMap<>();

        for (int i = 0; i < queenArray.length ; i++) {
            int counter=0;
            for (int j = 0; j < queenArray.length ; j++) {
                if (queenArray[i].equals(queenArray[j])) {
                    counter++;
                }
            }champions.put(queenArray[i],counter);
        }
        System.out.println(champions);

        //2. Way forEach Method for Maps (forEach method returns void)
        // bununla ilgili ayrıca örnek yapılacak

        champions.forEach((String key, Integer value)->{
            System.out.println("Key="+ key + " Value= "+ value);
        });


        // Q2 type a method to find sum of values in hashmap
        System.out.println("==Q2==");
        sumOfHashMap(champions);


        // Q3 find numbers entries
        System.out.println("==Q3==");
        System.out.println(champions.size());

        // Q4 update value of "q" key to "1977"
        System.out.println("==Q4==");
        champions.putIfAbsent("q",1977);
        System.out.println(champions);

        // Q5 find numbers entries
        System.out.println("==Q5==");
        System.out.println(champions.size());

        // Q6 find the all distinct letters in string
        System.out.println("==Q6==");
        Set<String> findLetters= champions.keySet();
        System.out.println(findLetters);

        //Q7 sort the letters in descending order
        System.out.println("===Q7===");
        TreeMap championTree = new TreeMap<>(champions);
        System.out.println(championTree.descendingKeySet());

        //Q8 find entry which has the maximum value

        //1.Way
        System.out.println("==Q8==\n1.way");

        Map<String,Integer> forMax=new HashMap<>(champions);

        Integer maxInMap= Collections.max((forMax.values()));

        for (Map.Entry<String,Integer> w:forMax.entrySet()){

            if (w.getValue()==maxInMap){

                System.out.println(w);
            }
        }
        // 2.Way // Collection sınıfına ait özellik parantez içerisinde lambda kurabiliyoruz
        System.out.println("2.way");
        System.out.print(Collections.max(forMax.entrySet(),(t, u)-> t.getValue() - u.getValue()).getKey());


        System.out.print("=");
        System.out.println(Collections.max(forMax.entrySet(),(t,u)-> t.getValue() - u.getValue()).getValue());

        //3. Way //
        int temp =Integer.MIN_VALUE;
        String tempStr="";

        for (Map.Entry<String,Integer> w:forMax.entrySet()){

            if (w.getValue()>temp){
                temp=w.getValue();
                tempStr= w.getKey();
            }
        }
        System.out.println("3. Way==> "+tempStr+"="+temp);

        //Q9
        // Change all value to uppercase
        // verilen hashMap'teki tüm karakterleri BÜYÜK HARFE çevirin
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "java");
        languages.put(2, "javascript");
        languages.put(3, "python");
        System.out.println(languages);

        languages.replaceAll((key, value) -> value.toUpperCase());
        System.out.println("Updated HashMap: " + languages);

        HashMap<Integer, Integer> numbers = new HashMap<>();

        // Q10
        // replace all value with the square of key
        numbers.put(5, 0);
        numbers.put(8, 1);
        numbers.put(9, 2);
        System.out.println(numbers);

        numbers.replaceAll((key, value) -> key * key);
        System.out.println("Updated HashMap: " + numbers);


        //for each metoduyla çalışma yada replace all ile
        //Q11  decrease value by 10%
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("apple", 200);
        prices.put("banana", 300);
        prices.put("melon", 150);
        System.out.println("Normal Price: " + prices);

        System.out.print("Discounted Price: ");

        prices.forEach((key, value) -> {
            value = value - value * 10/100;
            System.out.print(key + "=" + value + " ");
        });



    }



    public static void sumOfHashMap(HashMap l){
        Collection<Integer> sumOfValues=l.values();
        System.out.println(sumOfValues.stream().reduce(0,Math::addExact));
    }

    public static void repeatedCharacter(String x){

        HashMap<String,Integer> result=new HashMap<String, Integer>();
        for (int i = 0; i < x.length(); i++) {
            int counter=0;
            for (int j = 0; j <x.length() ; j++) {
                if (x.charAt(i)==x.charAt(j)){
                    counter++;
                }
            }
            if (counter>1){
                result.put(String.valueOf(x.charAt(i)),counter);
            }
        }
        System.out.println(result);
    }
}