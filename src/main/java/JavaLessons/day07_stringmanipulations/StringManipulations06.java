package JavaLessons.day07_stringmanipulations;

public class StringManipulations06 {
    public static void main(String[] args) {



//How to remove spaces from the beginning and from the end in a String

        String FullName = "       Ali Can   ";

        String noSpace = FullName.trim();
        System.out.println(noSpace);



//-------------------------isEmpty------------------------

        int numOfString = FullName.length();
        if (numOfString == 0) {
            System.out.println("You did not enter your name");
        } else {
            System.out.println("You entered your name successfully");
        }
//or
        boolean isEmpty = FullName.isEmpty();
        System.out.println(isEmpty);
//isEmpty() returns true if there is no any character



//------------------isBlank----------------------------------


//isEmpty() returns true if there is just space character or space characters or nothing
        String str = "Ali 12 wooow!";
        Boolean isBlank = str.isBlank();

        String str2 = "      ";
        System.out.println("isEmpty:" + str2.isEmpty());  // false -->cunku aslinda dolu
        System.out.println("isBlank:" + str2.isBlank());  //true-->bos gibi gorur



//------end Of the String----------------

        String str3= str.replaceAll("\\Z" , "*");
        System.out.println(str3);








    }
}
