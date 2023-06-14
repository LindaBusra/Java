package Others.javaQuestionBank_TechPro;

public class StringManipulations7_13 {
    public static void main(String[] args) {

/* Q-3 ) Create a String variable for city names which have just a single word.
Print the city name with the initial is in uppercase and all the other characters
are in lower cases on the console.
Example: mIAMI should be printed as Miami
 miami should be printed as Miami
 MIAMI should be printed as Miami
 mIaMi should be printed as Miami etc.

 */
        //olur da kullanici iki kelime girerse diye bu sekilde cozdum.
        String str = "GerManY   ";
        String firstCity = str.trim().toLowerCase();
        String[] city = firstCity.split(" ");
        String myCity = city[0].toUpperCase().charAt(0) + city[0].substring((1));

        if(city.length>1) {
            System.out.println("you can write just a single word");
        } else {
            System.out.println("The city is : " + myCity);
        }


        //kullanicinin tek kelime girmesi halinde.
        String cityName = " mIAMI ";
        String newCityName = cityName.trim().toLowerCase();
        System.out.println(newCityName.toUpperCase().charAt(0) + newCityName.substring(1));



// Q-2 Create 3 String variables for people's names. Print the sum of the number of characters in
//all the 3 names except space characters.
//Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console

        String n1 = "Ali Can";
        String n2 = "Merve Star";
        String n3 = "Mark Tom";

        int l1 = n1.replaceAll(" ", "").length();
        int l2 = n2.replaceAll(" ", "").length();
        int l3 = n3.replaceAll(" ", "").length();

        System.out.println(l1 + l2 +l3);


// Q-3  Create a String variable, print the total number of alphabetical and numeric characters in
//the String on the console.
//Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.

        String text = " Miami 33018!!! ";
        String newText = text.replaceAll("[^a-zA-z0-9]", "");
        int length = newText.length();
        System.out.println("the total number of alphabetical and numeric characters: " + length);



// Q-4 Create a String variable, print the number of non-digit characters in the String on the
//console.
//Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.

        String s = "1a3Bcf4!...";
        System.out.println(s.replaceAll("[0-9]", "").length());


// Q-5 Create a String variable and print just the last non-space character on the console for any
//String.
//Example: For ‘Ali Can’ you should print n
// For ‘Miami ’ you should print i etc

        String a = "   Ali Can   ";
        String b = a.replaceAll(" ","");   //veya  b.trim()'de yapabilirdim
        System.out.println("The non-space last character: " + b.charAt(b.length()-1));



// Q-6 Create a String variable and find the sum of the ASCII values of the first and the last
//characters of the String

        String c = "Welcome";   //W=87, e=101
        int first = c.charAt(0);
        int last = c.charAt(c.length()-1);
        System.out.println("the sum of the ASCII values of the first and the last characters: " + (first+last));


// Q-7 Create a String variable and print all characters except the first character on the console.
// Example:If the String is ‘Java’ you should print ‘ava’ on the console

        String d = "Java";
        System.out.println("All characters except the first character in the string is: " + d.substring(1));


// Q-8 Create a String variable and print all characters except the last character on the console in
//uppercases. Example:If the String is ‘Java’ you should print ‘JAV’ on the console

        String e = "Java";
        System.out.println(e.toUpperCase().substring(0, e.length()-1));


// Q-9 Create a String variable and print all characters except the first character and the last
//character on the console in uppercases.
//Example:If the String is ‘Java’ you should print ‘AV’ on the console

    String f = "Java";
        System.out.println(f.toUpperCase().substring(1,f.length()-1));  //1 dahil, digeri dahil degil

// Q-10 Type code to check if a String has just a single space character any position in the middle
//Example: For ‘Ali Can’ your code should print false on the console
// For ‘ Ali Can ’ your code should print false on the console
// For ‘ Ali Can ’ your code should print false on the console
// For ‘Ali Can’ your code should print true on the console

    String g = "  Ali Can  ";   ///g'de 5 bosluk var
    String withTrim = g.trim(); //withTrimde 1 bosluk kaldi   keilmenin uzunlugu bu sekilde 7
    String withoutSpace = g.replaceAll(" ", "");   //kelimenin uzunlugunun 6 olmasini beklerim.

    if(withTrim.length() - withoutSpace.length() == 1) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }

// Q-11 Type code to check if a String does not have any space character at the beginning and at
//the end?
//Example: For ‘ Ali ’ your code should print false on the console
// For ‘Ali’ your code should print true on the console

        String h = "  Welcome Ayse";
        String i = h.trim();

        System.out.println(h.length()==i.length() ? true : false);

// Q-12 2) Type code to check if a String has an uppercase initial and dot at the end.
//Example: For ‘Ali’ your code should print false on the console
// For ‘ali.’ your code should print false on the console
// For ‘ Ali. ’ your code should print false on the console
// For ‘Ali.’ your code should print true on the console
// For ‘ALI.’ your code should print true on the console

        String j = "Welcome Ayse .";


        if ( (j.charAt(0) >='A' && j.charAt(0) <= 'Z') && (j.charAt(j.length()-1) == '.') ){

                System.out.println(true);
        } else {
            System.out.println(false);
        }
// Q-13 Type code to check if a password is valid or not for the following conditions;
//Password must have at least 8 characters different from space character
//Password must have at least 1 symbol
//Example: For ‘A2b!’ your code should print false on the console
// For ‘A2b3cdef’ your code should print false on the console
// For ‘!1a23b4’ your code should print false on the console
// For ‘!1a23b4?es’ your code should print true on the console
// For ‘! a b 3 k’ your code should print false on the console

        String pwFull = "!1a23b4?es";
        String noSpace = pwFull.replaceAll(" ", "");
        String justSymbol = noSpace.replaceAll("[a-zA-Z0-9]", "");

        if(noSpace.length()>=8 && justSymbol.length()>=1) {
            System.out.println("Password is true");
        } else {
            System.out.println("Password is false");
        }



// Q-14) Type code to check if a String has a specific single character or not in three different ways.


//1.Way:
    String st1 = "Java";
    Boolean result1 = st1.contains("v");
    System.out.println("Does the character exist? " + result1);

//2.Way:
    String st2 = "Java";
    Boolean result2 = st2.replaceAll("[^v]", "").length()>0;
    System.out.println("Does the character exist? " + result2);

//2.Way:
    String st3 = "Java";
    Boolean result3 = st3.indexOf("v")!=-1;
    System.out.println("Does the character exist? " + result3);


// Q-15 String shirtPrice = ‘$12.99’;
//String bookPrice = ‘$35.99’;
//Type code to find the sum of the shirt and book prices.

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

String sP = shirtPrice.replace("$","");
String bP = bookPrice.replace("$","");
double x = Double.valueOf(sP);
double y = Double.valueOf(bP);
System.out.println("Total price is " + (x+y)/100);


// Q-16 Type code to get initials of the first name and the last name of a given name. Middle name
//is out of scope.
//Example: Tom Hanks ==> TH, Mary Star ==> MS



        //1-yol
        String name = "Tom Hanks";

        String firstName = name.toUpperCase().split(" ")[0];
        String lastName = name.toUpperCase().split(" ")[1];


        System.out.println(firstName.substring(0,1) + lastName.substring(0,1));


        //2.yol
        int space= name.indexOf(" ");
        System.out.println(name.toUpperCase().substring(0,1) + name.toUpperCase().substring(space+1,space+2));

        //3-yol
        String initialOfFirstName = name.substring(0,1);
        String initialOfLastName = name.split(" ")[1].substring(0, 1);
        System.out.println(initialOfFirstName + initialOfLastName);

//17) Type a code to find the number of punctuation marks used in a String.

        String nm = "Wow! Ali is 13 years old, but he is a university student.";
        String justP = nm.replaceAll("\\P{Punct}", "");
        System.out.println(justP);
        System.out.println(justP.length());





    }
}
