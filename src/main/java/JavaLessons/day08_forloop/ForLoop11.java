package JavaLessons.day08_forloop;

public class ForLoop11 {
    public static void main(String[] args) {



//Example 1 -Type code to print unique characters in a String, Hello-->Heo

String s ="Hello";

for (int i=0; i<s.length(); i++) {

    String ch = s.substring(i,i+1);

    if(s.indexOf(ch)==s.lastIndexOf(ch)) {
        System.out.print(ch);
    }
       }

    System.out.println();



//-------------------------------------------------------------------------------------------------------------------


//Example 2- Type code to print a String in reverse after removing spaces.
// For example Ali Can-->naCilA


        String sr = "Ali Can";

        sr = sr.replaceAll(" ", "");


        for(int i=sr.length()-1; i<=0; i--) {

            System.out.println(sr.charAt(i));
        }


//--------------------------------------------------------------------------------------------------



//Example 3- What is the output?


        for (char i ='f'; i>'a'; i--) {   //a b c d e f g
            System.out.print(i +" ");    // f d b
            i--;
        }



//---------------------------------------------------------------------------------------------------------


//Example 4-  What is the output?

        int y=1;
        for (int i=0; i<4; i++) {
            y += i;
        }
        System.out.println("y is: " + y);


//---------------------------------------------------------------------------------------------------------



//Example 5- What is the output?  (Note:ASCII value of 'A' is 65)

        for(int i=65; i<68; i++) {              //(char)65-->A
            System.out.print((char)i);
        }


    }

}
