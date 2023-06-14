package Others.Topics;

public class ArrayAnlatimi {
    public static void main(String[] args) {



//Example 1- Create an integer array and print the sum of the first and the last element on the console

//        //1.way
//        int arr[] = new int[4];
//
//        arr[0] =4;
//        arr[1] =8;
//        arr[2] =3;
//        arr[3] =5;
//
//        //2.way
//        int num [] = {4,8,3,5};
//
//        int length = num.length;
//
//
//        //for loop'la butun elementlerin toplami
//
//        int sum = 0;
//
//        for(int i=0; i<num.length; i++) {
//
//            sum += num[i];
//        }
//
//        System.out.println("the sum is:" + sum);
//
//
//
//        //for loop'la first+last element toplami
//
//        int firstAndLast = num[0] + num[length-1];
//        System.out.println("the sum of the first and the last element" + firstAndLast);





//----------------------------------------------------------------------------------------------------------


//Example 2- Create a double array and find the sum of all elements in the array.  {1.2, 3.4, 6.7, 8.2}

//        double numbers[] = {1.2, 3.4, 6.7, 8.2};
//
//
//
//       //1.way   for-each loop
//        double sum = 0;
//
//       for(double w: numbers) {
//
//           sum += w;
//       }
//
//        System.out.println("the sum of all elements: " + sum);
//
//
//        //2.way   for loop
//
//        double sum2 = 0;
//
//        for(int i=0; i<numbers.length; i++) {
//
//            sum2 = sum2 + numbers[i];
//        }
//
//        System.out.println("the sum of all elements: " + sum2);
//




//---------------------------------------------------------------------------------------------------



//Example 3- a)Print the list elements if the number of characters is less than 4.  { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"}


//        String names[]  = { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"};
//
//
//        for(String w: names) {
//
//            if(w.length()<4) {
//
//                System.out.print(w + " ");
//            }
//
//        }




//---------------------------------------------------------------------------------------------------



//Example 4-Print the list elements if you see "Vidar" stop printing   { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"}

//
//        String list[] =  { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"};
//
//        String find = "Vidar";
//
//
//        for(String w: list) {
//
//            if(w.equals(find)) {
//
//                break;
//            }
//
//            System.out.print(w + " ");
//        }
//



//---------------------------------------------------------------------------------------------------



//Example 5-Print the list elements except "Einar" if there is.       { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"}


//    String name[] =  { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"};
//
//    String findName ="Einar";
//
//    for(String w: name) {
//
//        if(w.equals(findName)) {
//
//            continue;
//        }
//
//        System.out.print(w + " ");
//    }




//---------------------------------------------------------------------------------------------------



//Example 6- Print the elements in alphabetical order on the console in the same line  { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"}
//Find specific element in the array "Reimund"
//Find specific element in the array "Terje"


//    String list[] = { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"};
//
//    Arrays.sort(list);          //arrayi alfabetik sekilde siralar
//
//
//    ////Find specific element in the array "Reimund"
//    String findName = "Reimund";
//
//    System.out.println(Arrays.toString(list));    // [Einar, Ole, Reimund, Sigrun, Tom, Vidar]
//
//    System.out.println(Arrays.binarySearch(list,findName));        //2



   //Find specific element in the array "Terje"

//     int isExist = Arrays.binarySearch(list, "Terje")   ;   // [Einar, Ole, Reimund, Sigrun, TERJE, Tom, Vidar]
//
//        System.out.println(isExist);
//
//        if(isExist<0) {
//            System.out.println("Terje does not exist");
//        } else {
//
//            System.out.println("Terje does exist");
//        }
//
//




//-------------------------------------------------------------------------------------------------------



// Example 7- Find specific element (For example 45) in the array. {1,2,3,4,67,78,5};


//        int numbers[] = {1,2,3,4,67,78,5};
//
//        Arrays.sort(numbers);
//
//        System.out.println(Arrays.toString(numbers));           // [1, 2, 3, 4, 5, 67, 78]
//
//        int findNumber =45;
//
//        System.out.println(Arrays.binarySearch(numbers, findNumber));           //-6: order no: sira numarasi

// eger 45 olsaydi bu sirada olurdu  [1, 2, 3, 4, 5, 45 , 67, 78]





//---------------------------------------------------------------------------------------------------


// Example 8 -[0,2,3,0,12,0] put the zeros to the end---> [2 3 12 0 0 0 ]

//
//        int num1 [] = {0,2,3,0,12,0};
//
//        int num2[] = new int[num1.length];
//
//        Arrays.sort(num1);                      //0 0 0 2 3 12
//
//        int j=0;
//
//
//        for(int i=num1.length-1; i>=0; i--) {
//
//            num2[j] = num1[i];              // 12 3 2 0 0 0
//            j++;
//        }
//
//        System.out.println(Arrays.toString(num2));






//Example 9- Type code to check how many times  a specific element exists in an array or not
//int crr[] = {-12, 7, 23, 5, 2, 7, 8}; check for 7


        int crr[] = {-12, 7, 23, 5, 2, 7, 8};

        int findNum = 7;

        int count = 0;


        for(int w: crr) {

            if(w==findNum) {
                count++;
            }
        }

    if(count>0) {

        System.out.println(count);
    } else{
        System.out.println("the number does not exist");
    }





























//------------------------------------------------------------------------------------------------------------


//Example 10- Find how many "a" are there in this array    {"a", "b", "c", "d", "a", "b", "f", "a"}























//        String[] characters = {"a", "b", "c", "d", "a", "b", "f", "a"};
//        String check ="a";
//        int count = 0;
//
//
//        for(String w:characters) {
//
//            if(w==check) {
//                count ++;
//            }
//        }
//
//        if(count>0) {
//            System.out.println("\"" + check  + "\"" + " is exist " + count + " times in array");
//        } else {
//            System.out.println("It does not exist");
//        }





//------------------------------------------------------------------------------------------------------------



//Example 11- Find how many "a" in this array?  "Java, I like Java. But it is so hard."



















//   String str ="Java, I like Java. But it is so hard.";
//
//   String st[] = str.split("");
//
//   String find = "a";
//   int count = 0;
//
//   for(String w : st) {
//
//       if(w.equals(find)) {
//           count++;
//       }
//   }
//        System.out.println("There is " + count + " times " + find + " in this sentences");


//or


//        String str ="Java, I like Java. But it is so hard.";
//
//        String st[] = str.split("a");
//
//        int length = st.length;
//
//        System.out.println("There is " + (length-1) + " times \"a\" in the sentences");



//------------------------------------------------------------------------------------------------------------



//Example 11-To find the average of an array  { 16.3, 7.5, 78.6, -20.4, 43.05, 45 }






















//  double[] myList = { 16.3, 7.5, 78.6, -20.4, 43.05, 45 };
//
//  double sum = 0;
//
//  for(double w: myList) {
//
//      sum += w;
//  }
//
//        System.out.println(sum/myList.length);




//--------------------------------------------------------------------------------------------------



//Example 12- Reverse a String by using Arrays04, ask the user to enter a String    "Java is easy to learn"























//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String text = scanner.nextLine();
//
//        String arrayText[] = text.split("");
//
//        for(int i=arrayText.length-1; i>=0; i--) {
//
//            System.out.print(arrayText[i]);
//        }
//        System.out.println();




//Example 13- //Type code to print the elements whose indexes are even numbers.  {1, 4, 5, 7, 8,12,20}




















//        int[] arr ={1, 4, 5, 7, 8,12,20};
//
//
//        for(int i=0; i<arr.length; i++) {
//
//            if(i%2==0 ) {
//
//                System.out.print(arr[i] + " ");
//            }
//        }



//--------------------------------------------------------------------------------------------------


//Example 14-Ask user to create an integer array and type all odd numbers on the console.


























//            Scanner scan = new Scanner(System.in);
//            System.out.println("Please, enter the number of elements");
//            int num = scan.nextInt();
//
//            int arr[] = new int[num];
//
//
//            for(int i=0; i<num; i++) {
//
//                System.out.println("Enter your " + (i+1) + ". element please");
//                arr[i] = scan.nextInt();
//              }
//
//
//            for(int w: arr) {
//
//                if(w%2==1) {
//                    System.out.print(w + " ");
//                }
//            }




//Example 15- Type code to find array elements whose first and last characters are same-->{"alabama", "pick", "sos", "sets", "pex"}



































//    String ss[] = {"alabama", "pick", "sos", "sets", "pex"};
//
//
//    for(String w: ss) {
//
//        String fLetter = w.substring(0,1);
//        String lastL = w.substring(w.length()-1);
//
//        if(fLetter.equals(lastL)) {
//            System.out.print(w+ " ");
//        }
//
//    }



//Example 16-Type all characters before the first occurrence of 'm' in a String-->"Christmas"






















//        String st = "Christmas";
//        String fO = "a";
//
//        String stSplit[] = st.split("");
//
//        for(String w: stSplit) {
//
//            if(w.endsWith(fO)) {
//                break;
//            }
//            System.out.print(w);
//        }




// Example 17- Please separate each sentence from "and" put them in an array.-->I go to school and I talk to friends and I talk to teachers

























// String str ="I go to school and I talk to friends and I talk to teachers";
//
// String strA[] = str.split("and");
//
//        System.out.println(Arrays.toString(strA));









//Example 18-Print the words start with "m" or "M"         // (Make code case-insensitive)
//Print the words starting with "t" or "T"  ----> My mistress, when she walks, treads on the ground. And yet by heaven, I think my love as rare, As any she belied with false compare.




























//        String str = "My mistress, when she walks, treads on the ground. And yet by heaven, I think my love as rare, As any she belied with false compare.";
//
//
//        str = str.replaceAll("[\\p{Punct}]", "").trim();
//
//        String ny[] = str.toLowerCase().split(" ");
//
//
//        for(String w: ny) {
//
//            if(w.startsWith("m")) {
//                System.out.print(w + " ");
//            }
//        }
//
//        for(String w: ny) {
//
//            if(w.startsWith("t")) {
//                System.out.print(w + " ");
//            }
//        }




//String phoneNumber = "+1-407-640-1256";  //Which one print just 407 on the console





















//        String phoneNumber = "+1-407-640-1256";  //Which one print just 407 on the console

//
//        //1.way
//        System.out.println(phoneNumber.substring(3,6));
//
//        //2.way
//        String[] e= phoneNumber.split("-");     // +1, 407, 640, 1256
//        System.out.println(e[1]);


//---------------------------------------------------------------------------------------------------------------



// Example 19- Moves all elements of a given 3-element array to one left position
////write a program. Sample; If array is { 1, 2, 3, 4, 5 } then the output will be [2, 3, 4, 5, 1].






















//        int arr[] = { 1, 2, 3, 4, 5 };
//
//        int spare = arr[0];
//
//        for(int i=0; i<arr.length-1; i++) {
//
//            arr[i] =arr[i+1];       //ar[0]=2, ar[1]=3, ar[2]=4, ar[3]=5
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        arr[arr.length-1] = spare;
//
//        System.out.println(Arrays.toString(arr));














    }


}
