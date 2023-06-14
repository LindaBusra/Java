package Others.javaQuestionBank_TechPro;

public class Switch37_38 {

    public enum Browsers{                       //for Question8
        CHROME, SAFARI, IE, FIREFOX, YANDEX
     }

     public enum Seasons{                       //for Question9
        WINTER, SUMMER, FALL, SPRING

     }


    public static void main(String[] args) {

/* Question 8: Create an Enum and put the browser names in it like CHROME, SAFARI, IE, FIREFOX,
YANDEX. Use switch statement and print ‘I am using CHROME’ for CHROME, 'I am using
SAFARI’ for SAFARI, 'I am using IE for IE', 'I am using FIREFOX for FIREFOX', and 'I am using
YANDEX’ for YANDEX, 'Not valid browser' for browsers different from CHROME, SAFARI, IE,
FIREFOX, YANDEX.

 */

     Browsers myBrowser = Browsers.CHROME;

        switch(myBrowser){
            case CHROME:
                System.out.println("I am using CHROME");
                break;
            case SAFARI:
                System.out.println("I am using SAFARI");
                break;
            case IE:
                System.out.println("I am using IE");
                break;
            case FIREFOX:
                System.out.println("I am using FIREFOX");
                break;
            case YANDEX:
                System.out.println("I am using YANDEX");
                break;
            default:
                System.out.println("It is not valid browser");
        }
        System.out.println("-------------------------------------------------------------------------------\n");


//bu soru su ayrinti ile de cozulebilirdi, sabit degri stringe cevirip, caseleri
//string olarak girebilirdim. Case "CHROME" GIBI

        String browser = Browsers.CHROME.toString();



/*  Question 9 -Create an Enum whose name is ‘Seasons’ and print the following by using the Enum in
switch-on statement
For winter print 'Snowboarding'
For summer and spring print 'Fishing'
For fall print 'Trekking'


 */

    Seasons mySeason =Seasons.SPRING;

    switch (mySeason) {

        case WINTER:
            System.out.println("Snowboarding");
            break;

        case SUMMER:
        case SPRING:
            System.out.println("Fishing");
            break;

        case FALL:
            System.out.println("Trekking");
            break;

        default:
            System.out.println("Invalid season name");

    }









    }
}
