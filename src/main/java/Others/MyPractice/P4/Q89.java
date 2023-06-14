package Others.MyPractice.P4;

public class Q89 {

    public static void main(String[] args) {




// Example 1- Type the initial characters in the String.


//1. way

        String fullName = "  Tom Hanks   ";

        fullName= fullName.trim();

        int indOfSpace = fullName.indexOf(" ");

        System.out.println(fullName.charAt(0) + fullName.substring(indOfSpace+1, indOfSpace+2));



//2.way

        String fullName1 = "Tom Hanks";
        String iForName = fullName1.trim().substring(0,1).toUpperCase();
        System.out.println("Initial of first name is: " + iForName);

        String iLastName = fullName1.trim().toUpperCase().split(" ")[1].substring(0,1);
        System.out.println("Initial of last name is: " + iLastName);

        System.out.println(iForName+iLastName);
        System.out.println();
    }
}
