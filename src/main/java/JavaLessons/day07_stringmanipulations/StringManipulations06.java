package JavaLessons.day07_stringmanipulations;

public class StringManipulations06 {
    public static void main(String[] args) {



//How to remove spaces from the beginning and from the end in a String

        String fullName = "       Ali Can   ";

        String noSpace = fullName.trim();
        System.out.println(noSpace);



//-------------------------isEmpty--------------------------------------------

        int numOfString = fullName.length();
        if (numOfString == 0) {
            System.out.println("You did not enter your name");
        } else {
            System.out.println("You entered your name successfully");
        }
//or
        boolean isEmpty = fullName.isEmpty();
        System.out.println(isEmpty);




//------------------isEmpty() - isBlank() ----------------------------------

//isEmpty() returns true if there is no any character
//isEmpty() returns false if there is just space character or space characters.

        String str = "Emily 12 wooow!";
        Boolean isBlank = str.isBlank();

        String str2 = "      ";
        System.out.println("isEmpty:" + str2.isEmpty());  // false -->because actually it  is not empty
        System.out.println("isBlank:" + str2.isBlank());  //true-->it seems like empty

        String str3 = "";
        System.out.println("isEmpty:" + str3.isEmpty());  //true -->because  it  is empty
        System.out.println("isBlank:" + str3.isBlank());  //true-->because  it  is empty



//------end of the String  --------- start of the String----------------------------------------------------

        String str4= str.replaceAll("\\Z" , "*");
        System.out.println(str4);


        String str5= str.replaceAll("\\A" , ":)");
        System.out.println(str5);





    }
}
