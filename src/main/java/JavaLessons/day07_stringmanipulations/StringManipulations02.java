package JavaLessons.day07_stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {




//Example 1- Type code to se the order number of the first occurrence of the character 'a'
// "I want to learn Java"  --->


        String str = "I want to learn Java";
        int a = str.indexOf('a'); //indexOf() method gives you the index of first occurrence of a specific character
        System.out.println(a+1);  //order number is one more that, because order number start from 1



//-------------------------------------------------------------------------------------------



//Example 2: Type code to see the order number of the first occurrence of "Java"


        String s = "I like to study Java, learn Java, earn money, Java is easy.";
        int b = s.indexOf("Java");   //16, index, start of Java
        System.out.println(b+1);    //order number
        System.out.println(s.indexOf("*"));


//Note 1:indexOf() method can be used with char and String data types like indexOf('a') and indexOf("Java")
//Note 2:if you use string inside the indexOf(), it will return the index of the first character, indexOf("Java")
//returns indexOf "J"
//Note 3:s.indexOf("xyz"); ==>-1   indexOf() method returns "-1" for non-existing character



//-------------------------------------------------------------------------------------------


//Example 3 : Type code to check if String has 'a' in it or not. Print appropriate messages for the scenarios.

        String word = "I like to study";

        if (word.indexOf('a')==-1) {
            System.out.println("The word has not character a");
        } else {
            System.out.println("The word has character a");
        }



    }
}
