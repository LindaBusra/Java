package Others.Topics;

public class Replace {
    public static void main(String[] args) {

//Replace konusu

//I have a string with lots of special characters. I want to remove all
// those, but keep alphabetical characters.
        String input ="Hei Java";
        String alphaOnly = input.replaceAll("[^a-zA-Z]+","");
        String alphaAndDigits = input.replaceAll("[^a-zA-Z0-9]+","");

/*
        s = s.replaceAll("\\W", "");  //It replace all special characters from string.
\w : A word character, short for [a-zA-Z_0-9]

\W : A non-word character           */

        String input2 = "Here@ is a function123< I used> to remove* all possible " ;
        System.out.println(input2.replaceAll("\\W", ""));




//---------------------------------------------------------------------------

        String str = "We are abc working at Abc";
        String strd = "Hi 10, How 20 and 30 are doing!";

        String str2 = strd.replaceAll("[0-9]+", "");
        String str3 = strd.replaceAll(" [0-9]+", "");
        String str4 = str.replaceAll("[a-zA-Z]+", "Java");
       /*The following String function statement will find the substring ‘[a-zA-Z]’ and
         replace it with “Java”. It means it will replace the alphabets between a and z, A, and Z with Java.
                 */

        System.out.println("After Replacing First Sub String in str = " + str2);
        System.out.println("After Replacing Last Sub String in str = " + str3);
        System.out.println("After Replacing First Sub String in str1 = " + str4);

        // strd.replaceAll("[0-9]+", "");
        /*The following statement will call the replaceAll method to find the substring ‘[0-9]’ and replace
        it with the “”. It means it will replace the numbers between 0 and 9 with empty spaces.

         */

        // strd.replaceAll(" [0-9]+", "");
        /*The above statement returns the output with extra spaces. So, we just altered
         the above statement to eliminate extra spaces.         */
//----------------------------------------------------------

        //Replace, harf degistime
//        String a = "123425826";
//        String b =a.replace("2","*");
//        System.out.println(b);

//-------------------------------------------------------------
        String text = "Merhaba 90'li yeni dunya";
        String newText = text.replaceAll("[^a-zA-Z]","");
        System.out.println(newText);
//karakterler disinda hersyei temizliyor


        String text2 = "Merhaba 90'li yeni dunyalar selam 2022";
        String newText2 = text.replaceAll("[^a-zA-Z0-9]+","");
        System.out.println(newText2);
//karakterler ve rakamlar disinda hersyei temizliyor



//Replace any number with an X.

        String yazim = "__1_6____3__6_345____0";

        String eski = "\\d";
        String yeni = "X";

        String yeniYazim = yazim.replaceAll(eski, yeni);  // __x_x____x__x_xxx____x
        System.out.println("Yeni yazim:" + yeniYazim);
        System.out.println("----------------------------------------------------------------------------");

//---------------------------------------------------------------------------------------------------------------------

        // Remove all whitespace.

        String myString = "  Horse   Cow\n\n   \r Camel \t\t Sheep \n Goat   ";

        String regex = "\\s";
        String replacement = "";  //"X" yazarsam tum bosluklari X ile doldurur

        String newString = myString.replaceAll(regex, replacement);
        System.out.println(newString);
        System.out.println("----------------------------------------------------------------------------");

//---------------------------------------------------------------------------------------------------------------------

        //    Replace all occurrences of the string fish with sheep.


//        String text = "one fish, two fish, three fish";
//
//        String target = "fish";
//        String newWord = "sheep";
//
//        String newText = text.replace(target, newWord);
//        System.out.println("new text is \"" + newText + "\"");
//        System.out.println("----------------------------------------------------------------------------");

//---------------------------------------------------------------------------------------------------------------------

        //Replace all occurrences of the character X with o.

        String sentences = "__x___x___x_x____xx_";

        char oldChar = 'X';
        char newChar = 'o';

        String newSentences = sentences.replace(oldChar, newChar);
        System.out.println(newSentences);

        System.out.println("----------------------------------------------------------------------------");

    }
}
