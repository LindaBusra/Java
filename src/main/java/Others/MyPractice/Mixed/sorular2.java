package Others.MyPractice.Mixed;

import java.util.*;

public class sorular2 {

    public static void main(String[] args) {




/*
        1) Type a code  to find the duplicate values of an array of integer values.




        2)Type a program which gets integer values from the user and
        stops by displaying "Done" when the sum of these values is grater than 100


        3) A four-digit number ABCD is called  Lucky if A+B = C+D
        Write a program that asks the user to enter a four-digit number and
        tell if the number is a lucky number or not
        Example: 3719 ==> 3+7 = 1+9  This is a Lucky number


        4)Create a method to count all words in a string
        get the string from user


        5)Create a method to count all characters different from space in a string
        get the string from user


        6)Create a  method to check whether a year (integer) entered by the user is a leap year or not.   */






//1) Type a code  to find the duplicate values of an array of integer values.

//        int arr[] = {1,2,3,45,5,6,6,9,9};
//
//        Map<Integer, Integer> hMap = new HashMap<>();
//
//        for(Integer w: arr) {
//
//            Integer numOFIntegers = hMap.get(w);
//
//            if(numOFIntegers==null) {
//                hMap.put(w,1);
//            } else {
//                hMap.put(w, numOFIntegers+1);
//            }
//        }
//
//
//
//        Set<Map.Entry<Integer, Integer>> entries = hMap.entrySet();
//
//        for(Map.Entry<Integer, Integer> w: entries) {
//
//            if(w.getValue()>1) {
//
//                System.out.println(w.getKey());
//            }
//        }



//Type a code to find the duplicate element in String Arrays04
//       {"learn","Java","love","Java","learn","coding"}

        String arr[] =  {"learn","Java","love","Java","learn","coding"};

        Map<String, Integer> hMap = new HashMap<>();

        for(String w: arr) {

            Integer num = hMap.get(w);

            if(num==null) {
                hMap.put(w,1);
            } else {
                hMap.put(w,num+1);
            }
        }

        System.out.println(hMap);

        Set<Map.Entry<String, Integer>> entries = hMap.entrySet();

        for(Map.Entry<String, Integer> w: entries) {



            if(w.getValue()>1) {

                System.out.println(w.getKey() + ":" +  w.getValue());
            }

        }




 /*       3) A four-digit number ABCD is called  Lucky if A+B = C+D
        Write a program that asks the user to enter a four-digit number and
        tell if the number is a lucky number or not
        Example: 3719 ==> 3+7 = 1+9  This is a Lucky number   */

//        int a = 3719;
//
//        int digit1= a%10;
//        int digit2= (a/10)%10;
//        int digit3= (a/100)%10;
//        int digit4= (a/1000)%10;
//
//
//
//        if(digit1+digit2==digit3+digit4) {
//            System.out.println("it is lucky number");
//        } else {
//            System.out.println("It is not lucky number");
//        }


//   2)Type a program which gets integer values from the user and
// stops by displaying "Done" when the sum of these values is grater than 100

//        Scanner scan = new Scanner(System.in);
//
//        int sum=0;
//
//        do {
//            System.out.println("please, enter an integer");
//            int num = scan.nextInt();
//            sum= sum+num;
//            if (sum>100){
//                System.out.println("Done");
//                break;
//            }
//
//        }while (true);


        //or


//        Scanner input = new Scanner(System.in);
//        int sumt=0;
//        while(sumt<=100) {
//            System.out.println("please, enter an integer");
//            sumt = sumt + input.nextInt();
//        }
//
//        System.out.println("Done " + sumt);





//Create a method to count all words in a string  get the string from user


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a String");
//
//        String str = scanner.nextLine();
//
//
//        str = str.trim().replaceAll("[^a-zA-Z]", "");
//        System.out.println(str);
//        String arr1[] = str.split("");
//        Arrays.sort(arr);
//        String output = "";
//
//
//        for (int i = 0; i < arr1.length; i++) {
//            int count = 1;
//            for (int j = i + 1; j < arr1.length; j++) {
//
//                if (arr1[i].equals(arr1[j])) {
//                    count++;
//                }
//            }
//
//            if (!output.contains(arr1[i])) {
//                output = output + arr1[i] + count + " ";
//            }
//        }
//        System.out.println(output);




        //2.Way: to find total num of words
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a String that is created from multiple words please");
        String str1 = enter.nextLine();

        numOfWordsInAString(str1);

    }

    public static void numOfWordsInAString ( String str){



        str = str.replaceAll(" ", "");
        String [] arr = str.split(" ");

        int numOfWords = arr.length;
        System.out.println("Lenght of word: " + numOfWords);

    }
}





